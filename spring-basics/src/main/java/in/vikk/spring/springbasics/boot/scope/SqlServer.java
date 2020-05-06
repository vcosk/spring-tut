package in.vikk.spring.springbasics.boot.scope;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class SqlServer implements JdbcConnection {
	
	private final Logger LOGGER = LoggerFactory.getLogger(SqlServer.class);

	public SqlServer() {
		LOGGER.info("{}", "SqlServer");
		LOGGER.info("{}", this);
	}
	
	
	@PostConstruct
	public void postConstructSqlServer() {
		LOGGER.info("{}", "postConstructSqlServer");
	}
	
	@PreDestroy
	public void preDestroySqlServer() {
		LOGGER.info("{}","preDestroySqlServer");
	}
}
