package in.vikk.spring.springbasics.core;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

import in.vikk.spring.springbasics.core.properties.ExternalService;


@Configurable
@ComponentScan
@PropertySource("classpath:app.properties")
public class SpringIn5StepsPropertiesApplication {
	
	private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsPropertiesApplication.class);
	
	public static void main(String[] args) {
		try (
				AnnotationConfigApplicationContext context =
					new AnnotationConfigApplicationContext(SpringIn5StepsPropertiesApplication.class);
				) {
			ExternalService service = context.getBean(ExternalService.class);
			LOGGER.info("{}", service);
		}
	}
}