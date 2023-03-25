package cn.cshao.user.cmpt.security.utils;

import com.hspharm.pharma.cmpt.security.model.AuthUser;
import lombok.experimental.UtilityClass;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

import java.util.Arrays;
import java.util.List;

/**
 * @copyright (C), 2018-2020
 * @fileName: SecurityUtils
 * @author:
 * @date: 2020/4/28 11:24 上午
 * @description: 安全帮助类
 * @history: <author>          <time>          <version>          <desc> 作者姓名           修改时间           版本号
 * 描述
 */
@UtilityClass
public class SecurityUtils {

    /**
     * 获取Authentication
     */
    public Authentication getAuthentication() {
        return SecurityContextHolder.getContext().getAuthentication();
    }

    /**
     * 获取用户
     *
     * @param authentication
     * @return AuthUser
     * <p>
     */
    public AuthUser getUser(Authentication authentication) {
        if (null != authentication) {
            Object principal = authentication.getPrincipal();
            if (principal instanceof AuthUser) {
                return (AuthUser) principal;
            }
        }

        return null;
    }

    /**
     * 获取用户
     */
    public AuthUser getUser() {
        Authentication authentication = getAuthentication();
        return getUser(authentication);
    }

    /**
     * 获取用户角色信息
     *
     * @return 角色集合
     */
    public List<String> getRoles() {
        final AuthUser user = getUser();
        return Arrays.asList(user.getRoles());
    }

    /**
     * 获取用户权限集合
     *
     * @return 权限集合
     */
    public List<String> getPermissions() {
        final AuthUser user = getUser();
        return Arrays.asList(user.getPermissions());
    }
}

