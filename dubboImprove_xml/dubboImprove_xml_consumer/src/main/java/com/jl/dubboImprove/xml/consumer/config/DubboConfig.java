package com.jl.dubboImprove.xml.consumer.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * @ClassName DubboConfig
 * @Description TODO
 * @Author Jiangl
 * @Date 2019/5/20 16:39
 * @Version 1.0
 */
@Configuration
@ImportResource(value = {"classpath:dubbo-consumer.xml"})
public class DubboConfig {
}
