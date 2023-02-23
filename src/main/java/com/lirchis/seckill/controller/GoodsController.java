package com.lirchis.seckill.controller;

import com.lirchis.seckill.redis.RedisService;
import com.lirchis.seckill.service.GoodsService;
import com.lirchis.seckill.service.UserService;
import com.lirchis.seckill.vo.GoodsVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.thymeleaf.spring4.view.ThymeleafViewResolver;

import java.util.List;

/**
 * Created by lichuanya.
 */
@Controller
@RequestMapping("/goods")
public class GoodsController {

    @Autowired
    UserService userService;

    @Autowired
    RedisService redisService;

    @Autowired
    GoodsService goodsService;

    @Autowired
    ApplicationContext applicationContext;

    @Autowired
    ThymeleafViewResolver thymeleafViewResolver;

    /**
     * 商品列表页面
     * QPS:433
     * 1000 * 10
     */
    @RequestMapping(value = "/to_list")
    @ResponseBody
    public List<GoodsVo> list() {
        return goodsService.listGoodsVo();
    }


    /**
     * 商品详情页面
     */
    @RequestMapping(value = "/to_detail/{goodsId}")
    @ResponseBody
    public GoodsVo detail2( @PathVariable("goodsId") long goodsId) {
        return goodsService.getGoodsVoByGoodsId(goodsId);
    }

}
