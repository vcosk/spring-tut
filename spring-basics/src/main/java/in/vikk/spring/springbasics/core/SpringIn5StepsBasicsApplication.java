package in.vikk.spring.springbasics.core;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import in.vikk.spring.springbasics.core.basics.BinarySearchImpl;

// Defines an application configuration.
@Configuration
@ComponentScan
public class SpringIn5StepsBasicsApplication {

	public static void main(String[] args) {
		try (
				AnnotationConfigApplicationContext context 
					= new AnnotationConfigApplicationContext(SpringIn5StepsBasicsApplication.class);
		) {
			BinarySearchImpl search = context.getBean(BinarySearchImpl.class);
	        System.out.println("-----------" + search + " " + search.binarySearch(new int[]{1,2,3,4,5,6}, 3));
	        
	        search = context.getBean(BinarySearchImpl.class);
	        System.out.println("-----------" + search + " " + search.binarySearch(new int[]{1,2,3,4,5,6}, 3));
		}
	}

}
