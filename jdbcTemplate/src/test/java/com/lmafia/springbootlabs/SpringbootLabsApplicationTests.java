package com.lmafia.springbootlabs;

import com.lmafia.springbootlabs.bean.Account;
import com.lmafia.springbootlabs.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootLabsApplicationTests {

    @Autowired
    UserService userService;


    @Test
    void contextLoads() {
        Account account = new Account();
        account.setAccountName("1");
        account.setMoney(1L);
        account.setUser("lmafia");
        System.out.println(userService.addAccount(account));
    }

    @Test
    void test1() {
        Account account = new Account();
        account.setId(1);
        account.setUser("lmafia1");
        userService.updateAccount(account);
    }

    @Test
    void test2() {
        userService.deleteAccount(24);
    }

    @Test
    void test3() {

//        System.out.println(userService.getAllAccounts());

        System.out.println(userService.getAllAccounts2());
    }

}
