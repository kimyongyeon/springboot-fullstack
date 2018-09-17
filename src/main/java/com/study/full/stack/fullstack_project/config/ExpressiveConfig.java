package com.study.full.stack.fullstack_project.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
//@PropertySource("classpath:server.properties")
@Slf4j
public class ExpressiveConfig {
    @Autowired
    Environment env;

//    @Bean
//    public String disc(
//            @Value("${disc.title}") String title
//            , @Value("#{systemProperties['disc.artist']}") String artist) { // artist는 안됨.
//        log.info("title" + env.getProperty("disc.title"));
//        String localTitle = env.getProperty("disc.title");
//        if (localTitle.equals(title)) {
//            log.info("true");
//        } else {
//            log.info("false");
//        }
//        String localArtist = env.getProperty("disc.artist");
//        if (localArtist.equals(artist)){
//            log.info("true");
//        } else {
//            log.info("false");
//        }
//
//        log.info("artist" + env.getProperty("disc.artist"));
//
//        env.getProperty("disc.title=", "Rattle and Hum");
//        env.getProperty("disc.artist=", "spark");
//
//        int connectionCount = env.getProperty("db.connection.count", Integer.class, 30);
//        log.info("connection=" + connectionCount);
//
//        env.getRequiredProperty("disc.title");
//        env.getRequiredProperty("disc.artist");
//
//        boolean titles = env.containsProperty("disc.title2");

//        return "";
//    }
}
