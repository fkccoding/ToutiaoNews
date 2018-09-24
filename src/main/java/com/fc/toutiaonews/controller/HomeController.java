package com.fc.toutiaonews.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

//    @Autowired
//    UserService userService;

    @RequestMapping("/")
    public String showHome(Model model){
//        User1 user1ById = userService.findUserById(5);
//        model.addAttribute("user1", user1ById);
        return "test";
    }

}
