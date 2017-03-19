package com.beauty.empty.controller;

import com.beauty.empty.client.domain.UserInfoDO;
import com.beauty.empty.client.service.UserInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * Created by kenan@xiaokakeji.com
 * on 2017/3/19.
 */

@Controller
@RequestMapping("/test")
public class TestController {
    private static final Logger logger = LoggerFactory.getLogger(TestController.class);

    @Resource
    private UserInfoService userInfoService;

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    @ResponseBody
    public void create(@RequestBody UserInfoDO userInfoDO) {
    }
}
