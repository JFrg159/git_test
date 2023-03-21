package com.zhang.dao;

import com.zhang.domain.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository("userdao")
public interface Userdao {
    @Select("select * from tb_user where username = #{username}")
    public User findById(String username);



    public int updateById(@Param("username") String username,@Param("newname") String newname);

}
