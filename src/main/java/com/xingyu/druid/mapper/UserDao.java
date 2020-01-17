package com.xingyu.druid.mapper;

import com.xingyu.druid.entity.User;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author xingyu
 * @since 2020-01-17
 */
@Repository
public interface UserDao extends BaseMapper<User> {

    List<User> getAll();

}
