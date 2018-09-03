package com.study.full.stack.fullstack_project.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.accept.ContentNegotiationManager;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.ContentNegotiatingViewResolver;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class RestConfiguration {
    @Bean
    public  ViewResolver contentNegotiatingViewResolver(ContentNegotiationManager manager) {
        // Define the view resolvers
        List<ViewResolver> resolvers = new ArrayList<ViewResolver>();

        resolvers.add(new JsonViewResolver());

        // Create the CNVR plugging in the resolvers and the content-negotiation manager
        ContentNegotiatingViewResolver resolver = new ContentNegotiatingViewResolver();
        resolver.setViewResolvers(resolvers);
        resolver.setContentNegotiationManager(manager);


        return resolver;
    }
}
