package cn.cshao.user.cmpt.security.utils;

import cn.cshao.user.cmpt.security.configure.properties.JwtProperties;
import cn.cshao.user.cmpt.security.cons.SecurityConstants;
import cn.cshao.user.cmpt.security.model.AuthUser;
import cn.cshao.user.cmpt.security.model.JwtToken;
import cn.cshao.user.cmpt.security.model.JwtUser;
import com.alibaba.fastjson.JSON;
import cs.cshao.common.exc.FailTokenException;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.*;
import java.util.function.Function;

/**
 * @Desc JwtToken工具类
 * @Author hub5
 * @Date 2022/11/9 16:53
 * @Return {@link }
 **/
@Component
@Slf4j
public class JwtTokenUtil implements Serializable {

    private static final long serialVersionUID = 7349747361889048814L;

    @Autowired
    @Getter
    public JwtProperties jwtProperties;

    public Date getExpirationDateFromToken(String token, String secret) {
        return getClaimFromToken(token, secret, Claims::getExpiration);
    }

    public <T> T getClaimFromToken(String token, String secret, Function<Claims, T> claimsResolver) {
        final Claims claims = getAllClaimsFromToken(token, secret);
        return claimsResolver.apply(claims);
    }

    private Claims getAllClaimsFromToken(String token, String secret) {
        try {
            return Jwts.parser()
                    .setSigningKey(Optional.ofNullable(secret).orElse(jwtProperties.getTokenSecret()))
                    .parseClaimsJws(token)
                    .getBody();
        } catch (Exception ex) {
            throw new FailTokenException("无效的令牌");
        }
    }

    public Boolean isTokenExpired(String token, String secret) {
        final Date expiration = getExpirationDateFromToken(token, secret);
        return expiration.before(new Date());
    }

    public JwtToken generateToken(JwtUser user, String secret) {
        return doGenerateToken(user, secret);
    }

    private JwtToken doGenerateToken(JwtUser user, String secret) {
        Claims claims = Jwts.claims();
        claims.put("userId", user.getUserId());
        claims.put("userNo", user.getUsername());
        claims.put("userNm", user.getUserNm());
        claims.put("fullName", user.getUserNm());
        claims.put("nickName", user.getNickName());
        claims.put("phoneNumber", user.getPhoneNumber());
        claims.put("rolePermissions", user.getAuthorities());
        log.info("doGenerateToken-rolePermissions:{}", JSON.toJSONString(user.getAuthorities()));
        final Date issuedAt = new Date(System.currentTimeMillis());
        final Date expiration = new Date(System.currentTimeMillis() + jwtProperties.getExpiration() * 1000);

        final String token = Jwts.builder()
                .setClaims(claims)
                .setIssuer("lee")
                .setIssuedAt(issuedAt)
                .setExpiration(expiration)
                .signWith(SignatureAlgorithm.HS256,
                        Optional.ofNullable(secret)
                                .orElse(jwtProperties.getTokenSecret()))
                .compact();

        JwtToken jwtToken = new JwtToken();
        jwtToken.setAccessToken(token);
        jwtToken.setExpiration(expiration.getTime());
        jwtToken.setTokenType(jwtProperties.getTokenPrefix());
        jwtToken.setHeaderName(jwtProperties.getHeader());
        return jwtToken;
    }

    public Collection<? extends GrantedAuthority> getAuthorities(String token, String secret) {
        final Claims claims = getAllClaimsFromToken(token, secret);
        final List<LinkedHashMap> rolePermissions = claims.get("rolePermissions", List.class);

        Set<String> dbAuthSet = new HashSet<>();
        if (rolePermissions.size() > 0) {
            rolePermissions.forEach(rolePermission -> dbAuthSet.add(rolePermission.get("authority").toString()));
        }

        return AuthorityUtils.createAuthorityList(dbAuthSet.toArray(new String[0]));
    }

    public AuthUser toAuthUser(String token, String secret) {
        final Claims claims = getAllClaimsFromToken(token, secret);
        final List<LinkedHashMap> rolePermissions = claims.get("rolePermissions", List.class);
        log.info("toAuthUser-rolePermissions:{}", JSON.toJSONString(rolePermissions));
        AuthUser authUser = new AuthUser();
        authUser.setUserId(claims.get("userId", Long.class));
        authUser.setUserNo(claims.get("userNo", String.class));
        authUser.setUserNm(claims.get("userNm", String.class));
        authUser.setFullName(claims.get("fullName", String.class));
        authUser.setNickName(claims.get("nickName", String.class));
        authUser.setShortName(claims.get("shortName", String.class));
        authUser.setPhoneNumber(claims.get("phoneNumber", String.class));

        authUser.setRoles(rolePermissions.stream()
                .filter(p -> p.get("authority").toString().startsWith(SecurityConstants.ROLE))
                .map(p -> p.get("authority").toString().replace(SecurityConstants.ROLE, ""))
                .toArray(String[]::new));
        authUser.setPermissions(rolePermissions.stream()
                .filter(p -> !p.get("authority").toString().startsWith(SecurityConstants.ROLE))
                .map(p -> p.get("authority").toString())
                .toArray(String[]::new));
        log.info("toAuthUser-authUser:{}", JSON.toJSONString(authUser));
        return authUser;
    }

}
