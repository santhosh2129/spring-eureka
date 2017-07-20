package com.santhosh2129.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by santhosh on 7/1/17.
 */

@SpringBootApplication
@EnableEurekaServer
public class SpringBootEurekaStarter {
    public static void main(String[] arg) {
        SpringApplication.run(SpringBootEurekaStarter.class, arg);
    }
}
