package com.lmafia.mybatisdemo.dao2;

import com.lmafia.mybatisdemo.bean.Account;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author L_MaFia
 * @classname AccountMapper.java
 * @description TODO
 * @date 2021/2/27
 */
//@Mapper
public interface AccountMapper2 {

    List<Account> getAllAccounts();


}
