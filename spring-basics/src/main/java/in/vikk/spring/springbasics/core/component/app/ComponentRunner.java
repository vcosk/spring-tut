package in.vikk.spring.springbasics.core.component.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import in.vikk.spring.springbasics.core.component.ComponentClass;

@Configuration
// Since the class ComponentClass used by the application class 
// is not in the same package or in it's sub-package,
// @ComponentScan is informed about bean's package.
@ComponentScan("in.vikk.spring.springbasics.core.component")
public class ComponentRunner {
	
	public static void main(String[] args) {
		try (
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(ComponentRunner.class);
				) {
			context.getBean(ComponentClass.class);
		}
	}
}