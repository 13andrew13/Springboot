package my.proj.controllers;

import my.proj.services.implementation.UserService;
import my.proj.services.interfaces.UserServiceInt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {
    @Autowired
    UserServiceInt userService=new UserService();
    @RequestMapping("/")
    public String index(){
        return "index";
    }

    @PostMapping("/login")
    public String login(@RequestParam("name")String name,@RequestParam String surname){
        userService.login(name,surname);
        return "index";
    }
    @RequestMapping("/signup")
    public String signUp(@RequestParam("name")String name,@RequestParam String surname){
        userService.signup(name, surname);
        return "index";
    }
    @GetMapping("/getUser")
    @ResponseBody
    public String getUser(){
        userService.
    }
}
