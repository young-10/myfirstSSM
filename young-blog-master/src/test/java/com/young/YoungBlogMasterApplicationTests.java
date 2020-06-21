package com.young;

import com.alibaba.druid.sql.ast.statement.SQLForeignKeyImpl;
import com.young.entity.TypePO;
import com.young.entity.User;
import com.young.entity.UserExample;
import com.young.mapper.TypePOMapper;
import com.young.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import sun.font.CreatedFontTracker;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

@SpringBootTest
class YoungBlogMasterApplicationTests {

    @Autowired
    private DataSource dataSource;

    @Autowired
    private TypePOMapper typePOMapper;

    @Autowired
    private UserMapper userMapper;

    @Test
    void contextLoads() throws SQLException {

//        System.out.println(dataSource);
//        Connection connection = dataSource.getConnection();
//        System.out.println(connection);

        String username="young";
        UserExample example = new UserExample();

        UserExample.Criteria criteria = example.createCriteria();

        criteria.andUsernameEqualTo(username);

        List<User> users = userMapper.selectByExample(example);

        User user = users.get(0);

        System.out.println(user);

    }

}
