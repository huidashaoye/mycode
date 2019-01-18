package com.itheima.dao;

import com.itheima.domain.Account;
import java.util.List;
/**
 * @Description: java类作用描述
 * @Author: wangch
 * @CreateDate: 2019/1/4 9:27
 * @Version: 1.0
 */
public interface IAccountDao {
    /**
     * 添加账户信息
     * @param account
     */
    void insert(Account account);

    /**
     * 更改账户信息
     * @param account
     */
    void update(Account account);

    /**
     * 删除账户信息
     * @param id
     */
    void delete(Integer id);

    /**
     * 查询所有的账户信息
     * @return
     */
    List<Account> findAll();
}
