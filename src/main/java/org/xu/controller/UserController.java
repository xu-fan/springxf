package org.xu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.xu.entity.User;
import org.xu.service.UserService;

import java.util.List;

@Controller
//@RequestMapping("/user")
public class UserController {

    private UserService userService;

    public UserController(){

    }

    @Autowired
    public UserController(UserService userService){
        this.userService = userService;
    }

    @RequestMapping("/queryAll")
    public String queryAll(Model model){
        System.out.println("Controller查询数据");
        List<User> users = userService.QueryAll();
        model.addAttribute(users);
        return "success";
    }

    @RequestMapping("/insert")
    public String Insert(User user){
        System.out.println("Controller插入数据");
        userService.insert(user);
        return "success";
    }
}
