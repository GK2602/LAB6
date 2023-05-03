package lab6.config;

import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class swaggerconfig {
	public Docket libray() {
		return new Docket(DocumentationType.SWAGGER_2).groupName("College Fest").select()
				.apis(RequestHandlerSelectors.basePackage("lab6.controller")).build();
	}
}
