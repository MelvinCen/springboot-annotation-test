package cn.melvin.dao;

import cn.melvin.domain.UserDomain;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface UserDao {

    int insertUser(UserDomain record);
    List<UserDomain> selectUsers();
}
