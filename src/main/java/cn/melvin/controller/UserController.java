package cn.melvin.controller;

import cn.melvin.domain.UserDomain;

import cn.melvin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;


    @PostMapping("/addUser")
    public int addUser(UserDomain user){
        System.out.println("addUser--addUser");
        return userService.addUser(user);
    }


    @GetMapping("/findUser")
    public Object findUser(@RequestParam(value = "pagNum",required = false,defaultValue = "1") int pagNum,@RequestParam(value = "pagSize",required = false,defaultValue = "10") int pagSize){
        return userService.findAllUser(pagSize,pagNum);
    }
}
