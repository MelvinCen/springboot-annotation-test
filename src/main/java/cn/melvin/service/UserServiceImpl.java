package cn.melvin.service;

import cn.melvin.dao.UserDao;
import cn.melvin.domain.UserDomain;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "userService")
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;

    @Override
    public int addUser(UserDomain user) {
        return userDao.insertUser(user);
    }

    @Override
    public PageInfo<UserDomain> findAllUser(int pageSize, int pageNum) {
        PageHelper.startPage(pageNum,pageSize);
        List<UserDomain> userDomains = userDao.selectUsers();
        System.out.println("查询到的userDomains - " + userDomains);
        PageInfo<UserDomain> domainPageInfo = new PageInfo<>(userDomains);
        return domainPageInfo;
    }
}
