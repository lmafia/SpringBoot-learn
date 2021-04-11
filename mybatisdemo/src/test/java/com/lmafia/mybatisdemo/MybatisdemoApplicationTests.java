package com.lmafia.mybatisdemo;

import com.lmafia.mybatisdemo.bean.Account;
import com.lmafia.mybatisdemo.dao.AccountMapper;
import com.lmafia.mybatisdemo.dao2.AccountMapper2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MybatisdemoApplicationTests {

    @Autowired
    AccountMapper accountMapper;
    @Autowired
    AccountMapper2 accountMapper2;

    @Test
    void contextLoads() {
        List<Account> allAccounts = accountMapper.getAllAccounts();
        System.out.println(allAccounts);
        List<Account> allAccounts2 = accountMapper2.getAllAccounts();
        System.out.println(allAccounts2);
    }

}
