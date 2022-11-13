package io.chatbus.roadeurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

import java.lang.management.ManagementFactory;
import java.lang.management.MemoryMXBean;

@SpringBootApplication
@EnableEurekaServer
public class RoadEurekaServerApplication {

    public static void main(String[] args) {

        int mb = 1024 * 1024;
        MemoryMXBean memoryBean = ManagementFactory.getMemoryMXBean();
        long xmx = memoryBean.getHeapMemoryUsage().getMax() / mb;
        long xms = memoryBean.getHeapMemoryUsage().getInit() / mb;
        System.out.println("Initial Memory (xms) : "+xms+"mb");
        System.out.println("Max Memory (xmx) : "+xmx+"mb");

        SpringApplication.run(RoadEurekaServerApplication.class, args);
    }

}
