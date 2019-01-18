package com.itheima.dao.impl;

import com.itheima.dao.IAccountDao;
import com.itheima.dbassit.DBAssit;
import com.itheima.domain.Account;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

/**
 * @Description: java类作用描述
 * @Author: wangch
 * @CreateDate: 2019/1/4 9:27
 * @Version: 1.0
 */
public class AccountDaoImpl implements IAccountDao {
         private QueryRunner   runner;

    public void setRunner(QueryRunner runner) {
        this.runner = runner;
    }

    public void insert(Account account) {
        try {
            runner.update("insert account  values(null,?,?)",account.getName(),account.getMoney());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void update(Account account) {
        try {
            runner.update("update account  set name=?,money=? where id=?",account.getName(),account.getMoney(),account.getId());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void delete(Integer id) {
        try {
            runner.update("delete account  where id=?",id);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public List<Account> findAll() {
        try {
          return   runner.query("select * from account",new BeanListHandler<Account>(Account.class));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
