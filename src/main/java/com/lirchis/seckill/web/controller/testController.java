package com.lirchis.seckill.web.controller;

import com.lirchis.seckill.dal.domain.UserDO;
import com.lirchis.seckill.service.auto.UserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class testController {
    @Resource
    private UserService userService;

    @GetMapping("/test/getUser")
    public UserDO getUser(@Param("id") Long id){
        return userService.getById(id);
    }
}
