package com.study.full.stack.fullstack_project.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.accept.ContentNegotiationManager;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.ContentNegotiatingViewResolver;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;
import java.util.List;

@Configuration
@EnableWebMvc
@EnableSwagger2
public class RestConfiguration extends WebMvcConfigurerAdapter {

    	@Bean
	public Docket api(){
		ApiInfo apiInfo = new ApiInfo(
				"Sample REST API",
				"This documents describes about Sample API.",
				"v1",
				"EmailAddress@gmail.com",
				"Sample Team",
				"API License URL", ""
		);
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.any())
				.paths(PathSelectors.any())
				.build()
				.apiInfo(apiInfo);
	}

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {

        registry.addResourceHandler("**/**")
                .addResourceLocations("classpath:/META-INF/resources/");

//        registry.addResourceHandler("swagger-ui.html")
//                .addResourceLocations("classpath:/META-INF/resources/");

        registry.addResourceHandler("/webjars/**")
                .addResourceLocations("classpath:/META-INF/resources/webjars/");
    }


    /*
     * Configure ContentNegotiationManager
     */
//    @Override
//    public void configureContentNegotiation(ContentNegotiationConfigurer configurer) {
//        configurer.ignoreAcceptHeader(true).defaultContentType(
//                MediaType.TEXT_HTML);
//    }
    @Bean
    public ViewResolver contentNegotiatingViewResolver(ContentNegotiationManager manager) {
        // Define the view resolvers
        List<ViewResolver> resolvers = new ArrayList<ViewResolver>();
        resolvers.add(new JsonViewResolver());
        // Create the CNVR plugging in the resolvers and the content-negotiation manager
        ContentNegotiatingViewResolver resolver = new ContentNegotiatingViewResolver();
        resolver.setViewResolvers(resolvers);

        resolver.setContentNegotiationManager(manager);

//        resolvers.add(jaxb2MarshallingXmlViewResolver());
        resolvers.add(jsonViewResolver());
//        resolvers.add(jspViewResolver());
//        resolvers.add(pdfViewResolver());
//        resolvers.add(excelViewResolver());

        resolver.setViewResolvers(resolvers);
        return resolver;
    }

    /*
     * Configure View resolver to provide XML output Uses JAXB2 marshaller to
     * marshall/unmarshall POJO's (with JAXB annotations) to XML
     */
//    @Bean
//    public ViewResolver jaxb2MarshallingXmlViewResolver() {
//        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
//        marshaller.setClassesToBeBound(Pizza.class);
//        return new Jaxb2MarshallingXmlViewResolver(marshaller);
//    }
//
//    /*
//     * Configure View resolver to provide JSON output using JACKSON library to
//     * convert object in JSON format.
//     */
    @Bean
    public ViewResolver jsonViewResolver() {
        return new JsonViewResolver();
    }
    /*
     * Configure View resolver to provide PDF output using lowagie pdf library to
     * generate PDF output for an object content
     */
//    @Bean
//    public ViewResolver pdfViewResolver() {
//        return new PdfView.PdfViewResolver();
//    }

    /*
     * Configure View resolver to provide XLS output using Apache POI library to
     * generate XLS output for an object content
     */
//    @Bean
//    public ViewResolver excelViewResolver() {
//        return new ExcelViewResolver();
//    }

    /*
     * Configure View resolver to provide HTML output This is the default format
     * in absence of any type suffix.
     */
//    @Bean
//    public ViewResolver jspViewResolver() {
//        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
//        viewResolver.setViewClass(JstlView.class);
//        viewResolver.setPrefix("/WEB-INF/views/");
//        viewResolver.setSuffix(".jsp");
//        return viewResolver;
//    }
}
