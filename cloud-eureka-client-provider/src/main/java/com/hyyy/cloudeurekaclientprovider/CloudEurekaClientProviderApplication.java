package com.hyyy.cloudeurekaclientprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CloudEurekaClientProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudEurekaClientProviderApplication.class, args);
    }
}
