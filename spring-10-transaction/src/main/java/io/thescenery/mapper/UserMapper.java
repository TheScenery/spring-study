package io.thescenery.mapper;

import io.thescenery.pojo.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface UserMapper {
    @Select("SELECT * FROM t_user WHERE id = #{userId}")
    User getUser(@Param("userId") String userId);

    @Insert("insert into t_user values (#{user.id}, #{user.name})")
    int addUser(@Param("user") User user);

    @Delete("delete from t_user where id = #{userId}")
    int deleteUser(@Param("userId") String userId);

    public void addAndDelete(User user);

}
