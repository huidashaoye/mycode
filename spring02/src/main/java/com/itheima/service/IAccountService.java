package com.itheima.service;

import com.itheima.domain.Account;

import java.util.List;

public interface IAccountService {

        /**
         * 添加账户信息
         *
         * @param account
         */
        void insert(Account account);

        /**
         * 更改账户信息
         *
         * @param account
         */
        void update(Account account);

        /**
         * 删除账户信息
         *
         * @param id
         */
        void delete(Integer id);

        /**
         * 查询所有的账户信息
         *
         * @return
         */
        List<Account> findAll();
    }
