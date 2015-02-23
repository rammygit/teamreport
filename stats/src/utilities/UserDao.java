package utilities;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.BeanPropertyRowMapper;

import utilities.pojo.Profile;
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

	
	
	public List<User> selectAll() {

		String sql = "select * from users";
		List<User> users = new ArrayList<User>();

		List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);
		for (Map<String, Object> row : rows) {			
			users.add(DaoUtil.userRowMapper(row));
		}
		return users;
	}

	/**
	 * 
	 * @param profile
	 */
	public void saveProfileData(Profile profile){
		
	}

	
}
