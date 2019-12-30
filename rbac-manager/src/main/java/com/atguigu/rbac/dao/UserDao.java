package com.atguigu.rbac.dao;

import com.atguigu.rbac.bean.User;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {

    @Select("select * from t_user")
    List<User> queryAll();
}
