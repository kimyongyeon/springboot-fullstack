package com.study.full.stack.fullstack_project.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
@ConfigurationProperties(prefix = "env")
public class ServerProfiles {

    @Value("${test.db}")
    private String db;

    public List<String> getServers() {
        return servers;
    }
    public void setServers(List<String> servers) {
        this.servers = servers;
    }
    private List<String> servers = new ArrayList<String>();

    public String getDb() {
        return db;
    }
    public void setDb(String db) {
        this.db = db;
    }
}
