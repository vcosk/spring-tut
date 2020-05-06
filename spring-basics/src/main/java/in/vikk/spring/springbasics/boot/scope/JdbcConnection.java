package in.vikk.spring.springbasics.boot.scope;


import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public interface JdbcConnection {
	
	@PostConstruct
	default void postConstructJDBC() {
		final Logger LOGGER = LoggerFactory.getLogger(JdbcConnection.class);
		LOGGER.info("{}", "postConstructJDBC");
	}
	
	@PreDestroy
	default public void preDestroyJDBC() {
		final Logger LOGGER = LoggerFactory.getLogger(JdbcConnection.class);
		LOGGER.info("{}","preDestroyJDBC");
	}
}
