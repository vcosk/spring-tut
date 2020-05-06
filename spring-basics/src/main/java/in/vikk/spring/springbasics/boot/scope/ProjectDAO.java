package in.vikk.spring.springbasics.boot.scope;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ProjectDAO {

	private static final Logger LOGGER = LoggerFactory.getLogger(ProjectDAO.class);
	
	@Autowired
	@Qualifier("oracleConnection")
	private JdbcConnection jdbcConnection;
	
	@Autowired
	private JdbcConnection sqlServer;
	
	@Autowired
	private JdbcConnection mySql;
	
	{
		LOGGER.info("{}", "ProjectDAOCodeBlock");
	}
	
	public ProjectDAO(@Qualifier("oracleConnection") JdbcConnection jdbcConnection,
			@Qualifier("sqlServer") JdbcConnection sqlServer, @Qualifier("sqlServer") JdbcConnection sqlServer2,
			@Qualifier("mySql") JdbcConnection mySql) {
		LOGGER.info("{}", "ProjectDAO");
		LOGGER.info("{}", this.jdbcConnection);
		LOGGER.info("{}", this.sqlServer);
		LOGGER.info("{}", this.mySql);
		this.jdbcConnection = jdbcConnection;
		this.sqlServer = sqlServer;
		this.mySql = mySql;
	}
	
	public JdbcConnection getJdbcConnection() {
		return jdbcConnection;
	}

	public void setJdbcConnection(JdbcConnection jdbcConnection) {
		this.jdbcConnection = jdbcConnection;
	}

	public JdbcConnection getSqlServer() {
		return sqlServer;
	}

	public void setSqlServer(JdbcConnection sqlServer) {
		this.sqlServer = sqlServer;
	}
	
	public JdbcConnection getMySql() {
		return mySql;
	}

	public void setMySql(JdbcConnection mySql) {
		this.mySql = mySql;
	}

	@PostConstruct
	public void postConstructProjectDAO() {
		LOGGER.info("{}", "postConstructProjectDAO");
	}
	
	@PreDestroy
	public void preDestroyProjectDAO() {
		LOGGER.info("{}","preDestroyProjectDAO");
	}
}
