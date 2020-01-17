package com.xingyu.druid.service.impl;

import com.xingyu.druid.entity.User;
import com.xingyu.druid.mapper.UserDao;
import com.xingyu.druid.service.UserService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author xingyu
 * @since 2020-01-17
 */
@Service
public class UserServiceImap extends ServiceImpl<UserDao, User> implements UserService {

    @Autowired
    UserDao userDao;

    @Override
    public List<User> getAll() {
        return userDao.getAll();
    }
}
