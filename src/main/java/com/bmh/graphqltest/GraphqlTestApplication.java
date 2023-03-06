package com.bmh.graphqltest;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@MapperScan("com.bmh.graphqltest.graphqlserver.mapper")
public class GraphqlTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(GraphqlTestApplication.class, args);
    }

}
