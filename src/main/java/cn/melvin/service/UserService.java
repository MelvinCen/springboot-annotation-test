package cn.melvin.service;

import cn.melvin.domain.UserDomain;
import com.github.pagehelper.PageInfo;

public interface UserService {

    int addUser(UserDomain user);

    PageInfo<UserDomain> findAllUser(int pageSize, int pageNum);
}
