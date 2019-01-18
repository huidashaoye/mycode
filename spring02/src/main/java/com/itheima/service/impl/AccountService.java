package com.itheima.service.impl;

import com.itheima.dao.IAccountDao;
import com.itheima.domain.Account;
import com.itheima.service.IAccountService;

import java.util.List;

/**
 * @Description: java类作用描述
 * @Author: wangch
 * @CreateDate: 2019/1/4 9:28
 * @Version: 1.0
 */
public class AccountService implements IAccountService {
    private IAccountDao dao ;

    public void setDao(IAccountDao dao) {
        this.dao = dao;
    }

    public void insert(Account account) {
               dao.insert(account);
    }

    public void update(Account account) {
             dao.update(account);
    }

    public void delete(Integer id) {
           dao.delete(id);
    }

    public List<Account> findAll() {
        return dao.findAll() ;
    }
}
