package utilities;



import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;


public abstract class BaseDao {

	private DataSource dataSource;
	
	protected JdbcTemplate jdbcTemplate;

    public void setDataSource(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

	public DataSource getDatasource() {
		return dataSource;
	}

	

	abstract public Object getById(int id) throws Exception;

	abstract Object insert() throws Exception;
	
	




}
