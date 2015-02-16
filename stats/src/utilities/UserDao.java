package utilities;

import org.springframework.jdbc.core.BeanPropertyRowMapper;

import utilities.pojo.User;

/**
 * deals with the user table
 * @author ramkumarsundarajan
 *
 */
public class UserDao extends BaseDao {
	
	

	@SuppressWarnings("rawtypes")
	@Override
	public Object getById(int id) throws Exception {
		String sql = "select * from users where userId = ?";
		@SuppressWarnings("unchecked")
		
		User user = (User)jdbcTemplate.queryForObject(
				sql, new Object[] { id }, 
				new BeanPropertyRowMapper(User.class));
		return user;
	}

	@Override
	Object insert() throws Exception {
		

		return null;
	}

	

	
}
