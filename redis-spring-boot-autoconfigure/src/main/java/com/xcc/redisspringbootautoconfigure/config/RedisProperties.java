package com.xcc.redisspringbootautoconfigure.config;


import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @Author xcc
 * @Date 2023/8/10
 */
@ConfigurationProperties(prefix = "redis")
public class RedisProperties {

    private String host = "localhost";
    private int port = 6379;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }
}
