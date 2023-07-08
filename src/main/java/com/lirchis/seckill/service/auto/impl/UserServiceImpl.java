package com.lirchis.seckill.service.auto.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lirchis.seckill.dal.domain.UserDO;
import com.lirchis.seckill.dal.mapper.UserMapper;
import com.lirchis.seckill.service.auto.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
@Slf4j
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, UserDO> implements UserService{
}
