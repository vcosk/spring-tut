package in.vikk.spring.springbasics.boot.scope;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
// Ensures that a new instance every time referring bean 
// (even if singleton) is looked up.
@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE,
		proxyMode=ScopedProxyMode.TARGET_CLASS)
public class MySql implements JdbcConnection {
	private static final Logger LOGGER = LoggerFactory.getLogger(MySql.class);
	
	public MySql() {
		LOGGER.info("{}", "MySql");
		LOGGER.info("{}", this);
	}
	
	@PostConstruct
	public void postConstrtuctMySql() {
		LOGGER.info("{}","postConstrtuctMySql");
	}
	
	@PreDestroy
	public void preDestroyMySql() {
		LOGGER.info("{}","preConstrtuctMySql");
	}
}
