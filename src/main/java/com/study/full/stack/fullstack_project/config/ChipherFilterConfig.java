package com.study.full.stack.fullstack_project.config;

import com.study.full.stack.fullstack_project.filter.CipherFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
public class ChipherFilterConfig {

    @Bean
    public FilterRegistrationBean getFilterRegistrationBean() {
        FilterRegistrationBean registrationBean = new FilterRegistrationBean(new CipherFilter());
        registrationBean.addUrlPatterns("*.do");
        return registrationBean;
    }

}
