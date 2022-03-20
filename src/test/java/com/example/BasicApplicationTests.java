package com.example;

import Entities.Article;
import Repository.ArticleRepository;
import java.util.Date;
import java.util.List;
import static org.junit.Assert.*;
import org.junit.Test;
//import org.junit.jupiter.api.Disabled;


import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.AutoConfigureTestEntityManager;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.ContextConfiguration;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = BasicApplication.class)
//@DataJpaTest
//@ContextConfiguration(classes=BasicApplication.class)
public class BasicApplicationTests {
   @Autowired
   ArticleRepository arep;
	@Test
//        @Disabled
	public void addData() {
            arep.saveItem(new Date(), "кое-что про Джаву", new Date(), "про джаву", "JavaSE");
	}
        @Test
//        @Disabled
        public void findByDescription(){
            List<Article> list = arep.findByDescription("кое-что про Джаву");
            assertEquals(list.get(list.size()-1).getDescription(), "кое-что про Джаву");
        }
//        @Test
//        @Disabled
//        public void findByDescriptionAndTheme(){
//         List<Article> list = arep.findByDescriptionAndTheme("JavaSE");
//            assertEquals(list.get(list.size()-1).getDescription(), "кое-что про Джаву");
//        }
//    @Test
//    public void ttesting(){
//        System.out.println("success");
//    }

}
