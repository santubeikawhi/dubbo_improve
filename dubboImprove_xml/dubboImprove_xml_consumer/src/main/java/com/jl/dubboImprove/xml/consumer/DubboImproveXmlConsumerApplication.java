package com.jl.dubboImprove.xml.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @ClassName DubboImproveXmlProviderApplication
 * @Description TODO
 * @Author Jiangl
 * @Date 2019/5/20 13:57
 * @Version 1.0
 */
@SpringBootApplication(scanBasePackages = { "com.jl.dubboImprove.xml.consumer"})
public class DubboImproveXmlConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(DubboImproveXmlConsumerApplication.class, args);
    }
}
