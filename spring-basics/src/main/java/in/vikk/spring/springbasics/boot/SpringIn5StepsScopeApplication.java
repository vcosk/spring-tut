package in.vikk.spring.springbasics.boot;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import in.vikk.spring.springbasics.boot.scope.DepartmentDAO;
import in.vikk.spring.springbasics.boot.scope.PersonDAO;
import in.vikk.spring.springbasics.boot.scope.ProjectDAO;

@SpringBootApplication
public class SpringIn5StepsScopeApplication {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsScopeApplication.class);
	
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringIn5StepsScopeApplication.class, args);
		
		PersonDAO personDAO1 = context.getBean(PersonDAO.class);
		
		PersonDAO personDAO2 = context.getBean(PersonDAO.class);
		
		// PersonDAO has prototype scope where OracleConnection has singleton scope.
		// personDAO1 and personDAO2 are two different instances.
		// But are pointing to same OracleConnection object instance.
		LOGGER.info("{}", personDAO1);
		LOGGER.info("{}", personDAO1.getJdbcConnection());
		LOGGER.info("{}", personDAO1.getMySqlConnection());
		LOGGER.info("{}", personDAO2);
		LOGGER.info("{}", personDAO2.getJdbcConnection());
		LOGGER.info("{}", personDAO2.getMySqlConnection());
		
		DepartmentDAO departmentDAO1 = context.getBean(DepartmentDAO.class);
		
		DepartmentDAO departmentDAO2 = context.getBean(DepartmentDAO.class);
		
		// DepartmentDAO has singleton scope where MySqlConnection has prototype scope.
		// Since department.
		LOGGER.info("{}", Arrays.stream(DepartmentDAO.class.getMethods()).map(Method::getName).filter(name->name.contains("DepartmentDAO")).collect(Collectors.toList()));
		LOGGER.info("{}", departmentDAO1);
		LOGGER.info("{}", departmentDAO1.getJdbcConnection());
		LOGGER.info("{}", departmentDAO1.getSqlServer());
		LOGGER.info("{}", departmentDAO2);
		LOGGER.info("{}", departmentDAO2.getJdbcConnection());
		LOGGER.info("{}", departmentDAO2.getSqlServer());
		
		ProjectDAO projectDAO1 = context.getBean(ProjectDAO.class);
		LOGGER.info("{}", projectDAO1);
		LOGGER.info("{}", projectDAO1.getJdbcConnection());
		LOGGER.info("{}", projectDAO1.getSqlServer());
		LOGGER.info("{}", projectDAO1.getMySql());
		
		
	}
}
