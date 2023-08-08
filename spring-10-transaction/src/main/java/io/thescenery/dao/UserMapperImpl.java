package io.thescenery.dao;

import io.thescenery.mapper.UserMapper;
import io.thescenery.pojo.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.transaction.annotation.Transactional;

public class UserMapperImpl extends SqlSessionDaoSupport implements UserMapper {
    private UserMapper getMapper() {
        return getSqlSession().getMapper(UserMapper.class);
    }

    @Override
    public User getUser(String userId) {
        return getMapper().getUser(userId);
    }

    @Override
    public int addUser(User user) {
        return getMapper().addUser(user);
    }

    @Override
    public int deleteUser(String userId) {
        return getMapper().deleteUser(userId);
    }

    @Transactional
    public void addAndDelete(User user) {
        UserMapper mapper = getMapper();
        mapper.addUser(user);
        mapper.deleteUser(user.getId());
    }
}
