package com.beauty.empty.controller;

import com.beauty.empty.client.domain.UserinfoDO;
import com.beauty.empty.client.service.UserInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
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

    @RequestMapping(value = "/create", method = RequestMethod.GET)
    @ResponseBody
    public void create() {
        UserinfoDO userinfoDO = new UserinfoDO();
        userinfoDO.setAge(18);
        userinfoDO.setName("leilei");
        userinfoDO.setBirthday("1988-12-20");
        userInfoService.createUserInfo(userinfoDO);
    }
}
