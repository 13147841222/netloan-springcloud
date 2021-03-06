package com.netloan.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.ComponentScan;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy
@EnableHystrix
@EnableHystrixDashboard
@ComponentScan(basePackages= {"com.netloan"})
public class ZuulApplication 
{
    public static void main( String[] args )
    {
        SpringApplication.run(ZuulApplication.class, args);
    }
}
