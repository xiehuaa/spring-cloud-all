package com.coderhua.demo.nacos;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;

/**
 * Create By IntelliJ IDEA
 *
 * @author coderhua
 * @date 2020-01-02
 */
@Configuration
@ConfigurationProperties("spring.datasource")
@RefreshScope
public class DatasourceConfig {
    private String name;

    private String user;

    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
