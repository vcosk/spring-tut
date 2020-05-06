package in.vikk.spring.springbasics.boot.component.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import in.vikk.spring.springbasics.boot.component.ComponentClass;

@SpringBootApplication
// Since the class ComponentClass used by the application class 
// is not in the same package or in it's sub-package,
// @ComponentScan is informed about bean's package.
@ComponentScan("in.vikk.spring.springbasics.boot.component")
public class ComponentRunner {
	
	public static void main(String[] args) {
		ApplicationContext context 
		= SpringApplication.run(ComponentRunner.class, args);
		ComponentClass componentClass 
		= context.getBean(ComponentClass.class);
	}
}