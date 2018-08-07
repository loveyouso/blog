package com.wss.blog.controller;

import com.wss.blog.domain.Authority;
import com.wss.blog.domain.User;
import com.wss.blog.service.AuthorityServiceImpl;
import com.wss.blog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * 主页控制器
 */
@Controller
public class MainController {

    private static final Long ROLE_USER_AUTHORITY_ID = 2L;

    @Autowired
    private UserService userService;

    @Autowired
    private AuthorityServiceImpl authorityService;

    @GetMapping("/")
    public String root(){
        return "redirect:/index";
    }

    @GetMapping("/index")
    public String index(){
        return "redirect:/blogs";
    }

    @GetMapping("/login")
    public String login(){
        return "login";
    }

//    username:用户账号
//    password:用户密码
//    rememb-me:是否记住我

    @GetMapping("/login-error")
    public String loginError(Model model){
        model.addAttribute("longinError",true);
        model.addAttribute("msg","登录失败，用户名或密码错误");
        return "login";
    }

    @GetMapping("/register")
    public String register(){
        return "register";
    }
    /**
     * 注册用户
     * @param user
     * @return
     */
    @PostMapping("/register")
    public String registerUser(User user) {

        //带入用户的权限信息
        List<Authority> authorities = new ArrayList<>();

        authorities.add(authorityService.getAuthorityById(ROLE_USER_AUTHORITY_ID).get());
        user.setAuthorities(authorities);

        userService.registerUser(user);
        return "redirect:/login";
    }
}
