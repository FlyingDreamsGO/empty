package com.beauty.empty.manager;

import com.beauty.empty.client.domain.UserinfoDO;
import com.beauty.empty.dao.user.UserinfoDOMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by kenan@xiaokakeji.com
 * on 2017/3/20.
 */
@Repository
public class UserInfoManager {

    @Autowired
    private UserinfoDOMapper userinfoDOMapper;

    public void createUserInfo(UserinfoDO userinfoDO){
        userinfoDOMapper.insert(userinfoDO);
    }



}
