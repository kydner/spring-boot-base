package com.domain.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


/**
 * SwaggerConfig
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

  @Bean
  public Docket productApi() {
    return new Docket(DocumentationType.SWAGGER_2)
      .select()
      .apis(RequestHandlerSelectors.basePackage("com.domain.controllers"))
      .paths(PathSelectors.any())
      .build();
      // .apiInfo(apiInfo());
  }

  // private ApiInfo apiInfo() {
  //   ApiInfo apiInfo = new ApiInfo(
  //     "title", 
  //     "description", 
  //     "version", 
  //     "termsOfServiceUrl", 
  //     new Contact("a","b","c"), 
  //     "license", "licenseUrl", 
  //     "vendorExtensions"
  //   );
  //   return apiInfo;
  // }
}