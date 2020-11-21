package com.qingmu.mybatisplus.mapper;

import com.qingmu.mybatisplus.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author qingmu
 * @since 2020-11-14
 */
@Repository public interface UserMapper extends BaseMapper<User> {

    @Select("select * from user where name=${name}")
    User selectByName(@Param("name") String name);

    @Select("select * from user where name=#{name}")
    User selectByName2(@Param("name") String name);
}
