package in.vikk.spring.springbasics.boot.scope;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class PersonDAO {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(PersonDAO.class);
	
	@Autowired
	@Qualifier("oracleConnection")
	private JdbcConnection jdbcConnection;
	
	@Autowired
	@Qualifier("mySql")
	private JdbcConnection mySqlConnection;
	
	private PersonDAO() {
		LOGGER.info("{}", "PersonDAO");
	}
	
	/**
	 * @return the jdbcConnection
	 */
	public JdbcConnection getJdbcConnection() {
		return jdbcConnection;
	}

	/**
	 * @param jdbcConnection the jdbcConnection to set
	 */
	public void setJdbcConnection(JdbcConnection jdbcConnection) {
		this.jdbcConnection = jdbcConnection;
	}
	
	public JdbcConnection getMySqlConnection() {
		return mySqlConnection;
	}

	public void setMySqlConnection(JdbcConnection mySqlConnection) {
		this.mySqlConnection = mySqlConnection;
	}

	@PostConstruct
	public void postConstructPersonDAO() {
		LOGGER.info("{}", "postConstructPersonDAO");
	}
	
	@PreDestroy
	public void preDestroyPersonDAO() {
		LOGGER.info("{}","preDestroyPersonDAO");
	}
}
