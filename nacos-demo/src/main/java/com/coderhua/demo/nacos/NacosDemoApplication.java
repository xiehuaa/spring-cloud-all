package com.coderhua.demo.nacos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Create By IntelliJ IDEA
 *
 * @author codehua
 * @date 2020-01-02
 */
@SpringBootApplication
@RestController
@EnableConfigurationProperties(value = {DatasourceConfig.class})
@EnableDiscoveryClient
public class NacosDemoApplication {
    @Resource
    private DatasourceConfig datasourceConfig;

    public static void main(String[] args) {
        SpringApplication.run(NacosDemoApplication.class, args);
    }

    @GetMapping(value = "/")
    public String test() {
        return "datasourceName = " + datasourceConfig.getName() + " ==== "
                + "datasourceUser = " + datasourceConfig.getUser() + " ==== "
                + "datasourcePassword = " + datasourceConfig.getPassword();
    }
}
