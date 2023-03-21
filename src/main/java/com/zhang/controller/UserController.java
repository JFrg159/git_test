package com.zhang.controller;

import com.zhang.domain.User;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/save")

    public String save(String name){
        System.out.println("user  save....");
        System.out.println(name);
        return "{'string':'springmvc'}";
    }

    @RequestMapping("/list")
    public String list(@RequestParam List<String>list){
        return "{'list':'springmvc'}";
    }

    @RequestMapping("/pojouser")

    public String pojouser(User user){
        return "{'pojouser':'springmvc'}";
    }

    @RequestMapping("/jsonlist")

    public String jsonlist(@RequestBody List<String> list){
        return "{'jsonlist':'springmvc'}";
    }

    @RequestMapping("/jsonuser")
    public String jsonuser(@RequestBody User user){
        return "{'jsonuser':'springmvc'}";
    }

}
