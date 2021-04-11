@#WWWWpackage com.lmafia.mybatisdemo.dao;

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
public interface AccountMapper {

    List<Account> getAllAccounts();


}
