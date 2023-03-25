package cn.cshao.user.cmpt.security.model;

import lombok.Getter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import java.util.Collection;

/**
 * @fileName: JwtUser
 * @description: Jwt用户信息实体
 * @author: 李阳
 * @create: 2020-04-27 23:17
 **/
public class JwtUser extends User {
    private static final long serialVersionUID = -963092281896855988L;

    @Getter
    private Long userId;
    @Getter
    private String userNo;
    @Getter
    private String userNm;
    @Getter
    private String fullName;
    @Getter
    private String shortName;
    @Getter
    private String nickName;
    @Getter
    private String phoneNumber;
    @Getter
    private Byte status;

    public JwtUser(String username, String password
            , Collection<? extends GrantedAuthority> authorities
            , Long userId, String userNm, String phoneNumber) {
        super(username, password, authorities);
        this.userId = userId;
        this.userNo = username;
        this.userNm = userNm;
        this.phoneNumber = phoneNumber;
    }

    /**
     * @Desc 增加用户姓名
     * @Author hub5
     * @Date 2022/11/10 10:20
     * @Return {@link }
     **/
    public JwtUser(String username, String password
            , Collection<? extends GrantedAuthority> authorities
            , Long userId, String userNm, String fullName
            , String shortName, String nickName, String phoneNumber, Byte status) {
        super(username, password, authorities);
        this.userId = userId;
        this.userNo = username;
        this.userNm = userNm;
        this.fullName = fullName;
        this.shortName = shortName;
        this.nickName = nickName;
        this.phoneNumber = phoneNumber;
        this.status = status;
    }

}
