package com.turntabl.api;

import com.google.common.base.Predicates;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.ListVendorExtension;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

import java.util.Collections;
import java.util.List;

@SpringBootApplication
@EnableSwagger2
public class TradesApplication {

	public static void main(String[] args) {
		SpringApplication.run(TradesApplication.class, args);
	}

	List<VendorExtension> vendorExtensions = Collections.singletonList(
			new ListVendorExtension<>("connectables", Collections.singletonList(
					// provide a field & API Name
					new ListVendorExtension<>("productId", Collections.singletonList("Products"))
			))
	);

	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.any())
				.apis(Predicates.not(RequestHandlerSelectors.basePackage("org.springframework.boot")))
				.apis(Predicates.not(RequestHandlerSelectors.basePackage("org.springframework.cloud")))
				.apis(Predicates.not(RequestHandlerSelectors.basePackage("org.springframework.data.rest.webmvc")))
				.paths(PathSelectors.any())
				.build()
				.apiInfo(metaInfo())
				.host("http://localhost/trades");
	}

	private ApiInfo metaInfo() {
		return new ApiInfo(
				"Trades API",
				"trades api description",
				"1.0",
				"Terms of Service",
				new Contact("trades Contact", "", "tradecontact@email.io"),
				"Apache License Version 2.0",
				"https://www.apache.org/licesen.html",
				vendorExtensions
		);
	}
  
	@Bean
	public CorsFilter corsFilter() {
		UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();

		// Allow access for Swagger spec
		CorsConfiguration config = new CorsConfiguration();
		config.setAllowCredentials(true);
		config.addAllowedOrigin("*");
		config.addAllowedHeader("*");
		config.addAllowedMethod("*");

		source.registerCorsConfiguration("/v2/api-docs", config);
		return new CorsFilter(source);
	}
  
}