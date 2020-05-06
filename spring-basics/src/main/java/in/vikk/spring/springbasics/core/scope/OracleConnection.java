package in.vikk.spring.springbasics.core.scope;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


@Component
public class OracleConnection implements JdbcConnection {
	private static final Logger LOGGER = LoggerFactory.getLogger(OracleConnection.class);
	
	public OracleConnection() {
		LOGGER.info("{}", "OracleConnection");
		LOGGER.info("{}", this);
	}
	
	@PostConstruct
	public void postConstrtuctOracle() {
		LOGGER.info("{}","postConstrtuctOracle");
	}
	
	@PreDestroy
	public void preDestroyOracle() {
		LOGGER.info("{}","preDestroyOracle");
	}
}
