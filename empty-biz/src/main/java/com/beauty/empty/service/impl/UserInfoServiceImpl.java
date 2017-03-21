package com.beauty.empty.service.impl;

import com.beauty.empty.client.domain.UserinfoDO;
import com.beauty.empty.client.service.UserInfoService;
import com.beauty.empty.manager.UserInfoManager;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by kenan@xiaokakeji.com
 * on 2017/3/20.
 */
@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Resource
    private UserInfoManager userInfoManager;

    @Override
    public void createUserInfo(UserinfoDO userinfoDO) {
        userInfoManager.createUserInfo(userinfoDO);
    }
}
