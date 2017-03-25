package com.websystique.springboot;

/**
 * Created by Tom on 24/03/2017.
 */

import java.util.LinkedHashMap;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.client.RestTemplate;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=SpringBootRestApiApp.class)// 指定spring-boot的启动类   
//@SpringApplicationConfiguration(classes = Application.class)// 1.4.0 前版本  
public class SpringBootJunitTest{

        public static final String REST_SERVICE_URI = "http://localhost:8080/SpringBootRestApi/api";

        @Test
        public void listAllUsers(){
                System.out.println("Testing listAllUsers API-----------");

//                RestTemplate restTemplate = new RestTemplate();
//                List<LinkedHashMap<String, Object>> usersMap = restTemplate.getForObject(REST_SERVICE_URI+"/user/", List.class);
//
//                if(usersMap!=null){
//                        for(LinkedHashMap<String, Object> map : usersMap){
//                                System.out.println("User : id="+map.get("id")+", Name="+map.get("name")+", Age="+map.get("age")+", Salary="+map.get("salary"));;
//                        }
//                }else{
//                        System.out.println("No user exist----------");
//                }
        }

}
