package com.cloud.k8s.springcloudk8s.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@EnableEurekaServer
@SpringBootApplication
public class SpringCloudK8sSampleApplication {


    public static void main(String[] args) {
        SpringApplication.run(SpringCloudK8sSampleApplication.class, args);
    }

}
