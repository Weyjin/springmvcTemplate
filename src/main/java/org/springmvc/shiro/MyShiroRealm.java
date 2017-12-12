package org.springmvc.shiro;

import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springmvc.model.User;
import org.springmvc.service.UserService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/10/9.
 */
public class MyShiroRealm extends AuthorizingRealm {

    @Autowired
    private UserService userService;
    /**
     * 登录后授权
     * @param pc
     * @return
     */
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection pc) {
        System.out.println("登录授权>>>");
        //getPrimaryPrincipal()获得的是
        //SimpleAuthenticationInfo()传进来的第一个参数
        User user= (User) pc.getPrimaryPrincipal();
        //String name=pc.getPrimaryPrincipal().toString();

            try{
                //User user=userService.getUserByName(name);
                if(user==null){
                    throw new UnknownAccountException();//没找到账号
                }
                int id=user.getId();
                String username=user.getName();


                //获得用户可以访问的url
                List<String> urls=userService.permissionlist(username);
                System.out.println("url>>> "+urls.toString());
                //授权
                SimpleAuthorizationInfo simpleAuthorizationInfo=new SimpleAuthorizationInfo();
                simpleAuthorizationInfo.addStringPermissions(urls);

                //设置角色
                List<String> roles=new ArrayList<String>();
                simpleAuthorizationInfo.addRoles(roles);

                return simpleAuthorizationInfo;
            }catch (Exception ex){
                System.out.println("授权异常>>>");
                ex.printStackTrace();
            }

        throw new UnknownAccountException();
    }

    /**
     * 登录认证
     * @param token
     * @return
     * @throws AuthenticationException
     */
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        /**
        UnknownAccountException 用户名未知...
        IncorrectCredentialsException 凭据不正确，例如密码不正确 ...
        LockedAccountException lae 用户被锁定，例如管理员把某个用户禁用...
        ExcessiveAttemptsException 尝试认证次数多余系统指定次数 ...
        AuthenticationException  其他未知错误
         */
            //通过表单接收的用户名
        String username= (String) token.getPrincipal();
        User user=userService.getUserByName(username);
        if(user!=null){
            String password=user.getPassword();
            return new SimpleAuthenticationInfo(user,password,getName());
        }

        throw new UnknownAccountException();
    }
}
