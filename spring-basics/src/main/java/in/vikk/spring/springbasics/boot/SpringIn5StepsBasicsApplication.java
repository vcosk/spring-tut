package in.vikk.spring.springbasics.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import in.vikk.spring.springbasics.boot.basics.BinarySearchImpl;

@SpringBootApplication
public class SpringIn5StepsBasicsApplication {

	public static void main(String[] args) {
		ApplicationContext context =
				SpringApplication.run(SpringIn5StepsBasicsApplication.class, args);
		BinarySearchImpl search = context.getBean(BinarySearchImpl.class);
        System.out.println("-----------" + search + " " + search.binarySearch(new int[]{1,2,3,4,5,6}, 3));
        
        search = context.getBean(BinarySearchImpl.class);
        System.out.println("-----------" + search + " " + search.binarySearch(new int[]{1,2,3,4,5,6}, 3));
	}

}
