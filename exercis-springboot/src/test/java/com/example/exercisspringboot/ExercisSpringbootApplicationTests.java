package com.example.exercisspringboot;

import com.example.exercisspringboot.dao.usersDao;
import com.example.exercisspringboot.pojo.users;
import com.example.exercisspringboot.service.usersService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ExercisSpringbootApplicationTests {

    @Autowired
    private usersDao usersDao;
    @Test
    public void contextLoads() {

        users users = new users();

        users.setUid(1);
        users.setUname("popopopopo");
        users.setPassword("121122");

        users.setTypeid(1);
        usersDao.save(users);
        //List<users> users = usersDao.findAll();
        System.out.println(users);
    }
    @Test
    public void find() {
        users users = usersDao.findByuid(1);
        System.out.println(users);
    }

}
