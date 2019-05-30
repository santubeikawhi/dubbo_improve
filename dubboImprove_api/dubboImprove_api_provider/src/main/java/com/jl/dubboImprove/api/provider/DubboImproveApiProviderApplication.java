package com.jl.dubboImprove.api.provider;


import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.alibaba.dubbo.config.ServiceConfig;
import com.jl.dubboImprove.api.provider.service.UserServiceImpl;
import com.jl.dubboImprove.service.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @ClassName DubboImproveApiProviderApplication
 * @Description TODO
 * @Author Jiangl
 * @Date 2019/5/20 17:40
 * @Version 1.0
 */
@SpringBootApplication
public class DubboImproveApiProviderApplication {
    public static void main(String[] args){
        SpringApplication.run(DubboImproveApiProviderApplication.class,args);

        ServiceConfig<UserServiceImpl> service = new ServiceConfig<>();
        service.setApplication(new ApplicationConfig("dubbo-demo-api-provider"));
        service.setRegistry(new RegistryConfig("zookeeper://127.0.0.1:2181"));
        service.setInterface(UserService.class);
        service.setRef(new UserServiceImpl());
        service.export();
    }
}
