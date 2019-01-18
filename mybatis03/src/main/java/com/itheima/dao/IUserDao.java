package com.itheima.dao;

import com.itheima.domain.User;

/**
 * @Description: java类作用描述
 * @Author: wangch
 * @CreateDate: 2019/1/2 19:10
 * @Version: 1.0
 */
public interface IUserDao {
    /**
     * 更新用户信息
     * @param user
     */
       void   update (User user);
}
