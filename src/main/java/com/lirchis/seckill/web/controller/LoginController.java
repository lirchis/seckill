package com.lirchis.seckill.web.controller;

import cn.dev33.satoken.stp.StpUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.lirchis.seckill.dal.domain.UserDO;
import com.lirchis.seckill.service.auto.UserService;
import com.lirchis.seckill.web.common.ResultVO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class LoginController {
    @Resource
    private UserService userService;
    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @PostMapping("doLogin")
    @ResponseBody
    public ResultVO<Object> doLogin(@Param("mobile") String mobile, @Param("password") String password){
        LambdaQueryWrapper<UserDO> queryWrapper = new LambdaQueryWrapper<UserDO>();
        queryWrapper.eq(UserDO::getMobile, mobile);
        List<UserDO> userDOS = userService.list(queryWrapper);
        if(CollectionUtils.isEmpty(userDOS)){
            return ResultVO.success("您未注册");
        }
        UserDO user = userDOS.get(0);
        StpUtil.login(user.getId());
        return ResultVO.success("登录成功");
    }

    @GetMapping("/index.htm")
    @ResponseBody
    public String index(){
        if(StpUtil.isLogin()){
            return "您已经登录，您的登录id是："+StpUtil.getLoginId();
        }
        return "您未登录";
    }
}
