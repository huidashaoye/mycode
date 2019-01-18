package com.itheima.dao;
import com.itheima.domain.User;
import org.apache.ibatis.annotations.Param;
import sun.security.util.Password;

import java.util.List;
public interface IUserDao {

      List<User> findAll();
     // List<User> findById(int id);
      void insert(User user);
      int  updateUser(User user);
      List<User> findbyName(String name);
     // User login(@Param("username")String username,@Param("password") String password);
      List<User>  findbyId(@Param("ids")List<Integer> ids);

}
