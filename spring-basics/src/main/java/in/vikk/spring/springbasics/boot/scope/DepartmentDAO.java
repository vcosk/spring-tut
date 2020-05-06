package in.vikk.spring.springbasics.boot.scope;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class DepartmentDAO {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(DepartmentDAO.class);
	
	@Autowired
	@Qualifier("mySql")
	private JdbcConnection jdbcConnection;
	
	@Autowired
	@Qualifier("sqlServer")
	private JdbcConnection sqlServer;

	public JdbcConnection getSqlServer() {
		return sqlServer;
	}

	public void setSqlServer(JdbcConnection sqlServer) {
		this.sqlServer = sqlServer;
	}

	public JdbcConnection getJdbcConnection() {
		return jdbcConnection;
	}

	public void setJdbcConnection(JdbcConnection jdbcConnection) {
		this.jdbcConnection = jdbcConnection;
	}
	
	@PostConstruct
	public void postConstructDepartmentDAO1() {
		LOGGER.info("{}", "postConstructDepartmentDAO1");
	}
	
	@PreDestroy
	public void preDestroyDepartmentDAO2() {
		LOGGER.info("{}","preDestroyDepartmentDAO2");
	}
	
	@PostConstruct
	public void postConstructDepartmentDAO2() {
		LOGGER.info("{}", "postConstructDepartmentDAO2");
	}
	
	@PreDestroy
	public void preDestroyDepartmentDAO1() {
		LOGGER.info("{}","preDestroyDepartmentDAO1");
	}
}
