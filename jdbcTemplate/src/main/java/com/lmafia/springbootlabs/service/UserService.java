package com.lmafia.springbootlabs.service;

import com.lmafia.springbootlabs.bean.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * @author L_MaFia
 * @classname UserService.java
 * @description TODO
 * @date 2021/2/27
 */

@Service("UserService")
public class UserService {

    @Autowired
    @Qualifier("jdbcTemplateOne")
    JdbcTemplate jdbcTemplate;

    @Autowired
    @Qualifier("jdbcTemplateTwo")
    JdbcTemplate jdbcTemplateTwo;



    public Integer addAccount (Account account) {
        return jdbcTemplate.update("insert into account (id, user, money, accountName) values(?, ?, ?, ?)",
                account.getId(), account.getUser(), account.getMoney(), account.getAccountName());
    }

    public Integer updateAccount (Account account) {
        return jdbcTemplate.update("update account set user = ? where id = ?", account.getUser(), account.getId());
    }

    public Integer deleteAccount (Integer id) {
        return jdbcTemplate.update("delete from account where id = ?", id);
    }

    public List<Account> getAllAccounts() {
        return jdbcTemplate.query("select * from account", new RowMapper<Account>() {
            @Override
            public Account mapRow(ResultSet resultSet, int i) throws SQLException {
                Account account = new Account();
                int id = resultSet.getInt("id");
                String user = resultSet.getString("user");
                long money = resultSet.getLong("money");
                String accountName = resultSet.getString("accountName");
                account.setId(id);
                account.setUser(user);
                account.setMoney(money);
                account.setAccountName(accountName);
                return account;

            }
        });
    }

    public List<Account> getAllAccounts2() {
        return jdbcTemplateTwo.query("select * from account", new BeanPropertyRowMapper<>(Account.class));
    }
}
