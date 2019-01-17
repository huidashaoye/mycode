package com.itheima.dao;
import com.itheima.domain.Account;
import com.itheima.domain.Role;
import com.itheima.domain.User;
import org.apache.ibatis.annotations.Param;
import sun.security.util.Password;

import java.util.List;
public interface AccountDao {
    /**
     * 查询账户的用户信息
     * @return
     */
    // List<Account>  findAll();
/*
    *//**
     * 查询用户包含的所有账户
     * @return
     *//*
     List<User>  findAll();*/

   /* *//**
     * 查询角色所包含的用户
     * @return
     *//*
    List<Role> findAll();
*/

    /**
     * 查询每个用户所参与的角色
     * @return
     */
 List<User> findAll();

 void upate(User user);
}
