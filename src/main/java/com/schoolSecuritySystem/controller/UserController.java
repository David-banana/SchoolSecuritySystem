package com.schoolSecuritySystem.controller;

import com.schoolSecuritySystem.dto.UserComtroller.NewUserInfoReq;
import com.schoolSecuritySystem.dto.UserComtroller.UserLoginInfoReq;
import com.schoolSecuritySystem.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/User")
public class UserController {
    @Autowired
    private UserServiceImpl userServiceimpl;

    @ResponseBody
    @PostMapping("/register")
    public boolean NewUserRegister(@RequestBody NewUserInfoReq dto) {
        return userServiceimpl.userRegister(dto); }

    @ResponseBody
    @PostMapping("/login")
    public boolean UserLogin(@RequestBody UserLoginInfoReq dto) {
        return userServiceimpl.userLogin(dto);
    }
}
