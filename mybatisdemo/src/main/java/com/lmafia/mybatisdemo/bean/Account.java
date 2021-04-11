package com.lmafia.mybatisdemo.bean;

/**
 * @author L_MaFia
 * @classname Account.java
 * @description TODO
 * @date 2021/2/27
 */
public class Account {
    private Integer id;
    private String user;
    private Long money;
    private String accountName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public Long getMoney() {
        return money;
    }

    public void setMoney(Long money) {
        this.money = money;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", user='" + user + '\'' +
                ", money=" + money +
                ", accountName='" + accountName + '\'' +
                '}';
    }
}
