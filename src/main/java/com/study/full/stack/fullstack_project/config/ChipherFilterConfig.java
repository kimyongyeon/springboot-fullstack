package com.study.full.stack.fullstack_project.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
public class ChipherFilterConfig {
<<<<<<< HEAD

    @Bean
    public FilterRegistrationBean getFilterRegistrationBean() {
        FilterRegistrationBean registrationBean = new FilterRegistrationBean(new CipherFilter());
        registrationBean.addUrlPatterns("*.do");
        return registrationBean;
    }
=======
//    @Bean
//    public FilterRegistrationBean getFilterRegistrationBean() {
//        FilterRegistrationBean registrationBean = new FilterRegistrationBean(new CipherFilter());
//        registrationBean.addUrlPatterns("*.do");
//        return registrationBean;
//    }
>>>>>>> 7cd31a5e3a00ffe3204f6a8095321fa6c38cf4a3
}
