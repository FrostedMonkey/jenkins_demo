package com.example.jenkins;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JenkinsApplicationTests {

    @Autowired
    private DemoInterface demoInterface;
    @Test
    void contextLoads() {
        int add = demoInterface.add(5, 4);
        System.out.println(add);
    }

}
