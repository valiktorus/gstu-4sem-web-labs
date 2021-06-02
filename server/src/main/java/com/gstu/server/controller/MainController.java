package com.gstu.server.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.gstu.server.service.UserService;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
    @Autowired
    private UserService userService;
    @Autowired
    private ObjectMapper objectMapper;


    @GetMapping(value = {"/"})
    public String mainPage(){
        return "index";
    }

    @GetMapping("/users")
    @ResponseBody
    @SneakyThrows
    public String getUsers(){
        return objectMapper.writeValueAsString(userService.getUsers());
    }

}
