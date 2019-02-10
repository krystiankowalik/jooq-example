package com.github.krystiankowalik.jooqexample;

import lombok.extern.log4j.Log4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@Log4j
public class JooqDbTests {

   @Autowired
    private BlogService blogService;

    @Test
    public void contextLoads() {
    }

   @Test
    public void getCommentsFromDb(){
       System.out.println(blogService.getAllComments());
   }

    @Test
    public void getPostsFromDb(){
        System.out.println(blogService.getAllPosts());
    }
}

