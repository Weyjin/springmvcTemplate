package org.springmvc.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springmvc.model.User;
import org.springmvc.service.UserService;


/**
 * Created by Administrator on 2017/10/9.
 */
@Controller
@RequestMapping("/home")
public class HomeController {
    @Autowired
    private UserService userService;

    @RequestMapping("/index")
    public ModelAndView index(){
        ModelAndView view=new ModelAndView();
        view.setViewName("home/index");
        return view;
    }

    @RequestMapping("/login")
    public ModelAndView login(){
        ModelAndView view=new ModelAndView();
        view.setViewName("home/login");
        return view;
    }

    /**
     * 登录
     * @param username
     * @param password
     * @return
     */
    @RequestMapping(value = "/loginForm",method = RequestMethod.POST)
    public ModelAndView loginForm(String username, String password){
        ModelAndView view=new ModelAndView();
        User user=userService.getUserByName(username);

        if(user==null){
            return view;
        }
        //注销
        //SecurityUtils.getSecurityManager().logout(SecurityUtils.getSubject());
        //登录后存放进shiro token
        System.out.println("getName()"+user.getName());
        System.out.println("getPassword()"+user.getPassword());
        UsernamePasswordToken token=new UsernamePasswordToken(user.getName(),user.getPassword());
        token.setRememberMe(true);
        Subject subject=SecurityUtils.getSubject();
         subject.login(token);
        view.setViewName("test/list");
        return view;
    }

    /**
     * 注销
     * @return
     */
    @RequestMapping("/logout")
    public ModelAndView logout(){
        ModelAndView view=new ModelAndView();
        view.setViewName("home/login");
        SecurityUtils.getSecurityManager().logout(SecurityUtils.getSubject());
        return view;
    }
}
