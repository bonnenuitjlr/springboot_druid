package com.xingyu.druid.service;

import com.xingyu.druid.entity.User;
import com.baomidou.mybatisplus.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author xingyu
 * @since 2020-01-17
 */
public interface UserService extends IService<User> {

    List<User> getAll();

}
