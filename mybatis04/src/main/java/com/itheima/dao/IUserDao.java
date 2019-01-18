package com.itheima.dao;

import com.itheima.domain.User;
import org.apache.ibatis.annotations.Param;

public interface IUserDao {
    /**
     * 根据id进行查询
     * @param id
     * @return
     */
    User findById(@Param("id")Integer id);

}
