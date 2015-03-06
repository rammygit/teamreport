package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import beans.UserProfile;
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

	
	
	public List<User> selectAll() throws DataAccessException{

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
	 * @param userId
	 * @return
	 * @throws SQLException
	 *//*
	public User getUserData(Integer userId) throws SQLException {
		String sql = "select * from user_profile where user_profile_id = ?";
		
		return jdbcTemplate.queryForObject(sql, new Object[]{userId}, new RowMapper<User>(){

			@Override
			public User mapRow(ResultSet resultSet, int args) throws SQLException {
				return DaoUtil.userRowMapper(resultSet);				
			}
			
		});
	}*/
	
	
	
		
	public List<Profile> fetchUserProfileData(Integer userId) throws SQLException{
		System.out.println("printing user id : "+userId);
		String sql = "select * from user_profile where userId = ?";
		List<Profile> userProfiles = new ArrayList<Profile>();

		List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql, new Object[]{userId});
		for (Map<String, Object> row : rows) {			
			userProfiles.add(DaoUtil.profileRowMapper(row));
		}
		return userProfiles;
	}
	
	
	
	

	/**
	 * insert into user-profile table.
	 * @param profile
	 */
	public boolean saveProfileData(Profile profile){
		String sql = "insert into user_profile " +
				"(userId,teamId,projectId,reporting_manager,comment,progress,worktype,work_type_number) VALUES (?,?,?,?,?,?,?,?)";
		int rowsInserted = 0;


		rowsInserted = jdbcTemplate.update(sql, new Object[] { profile.getUserId(),profile.getTeamId(),profile.getProjectId(),
				profile.getReportingManager(),profile.getComment(),profile.getProgress(),
				profile.getWorkType(),profile.getWorkTypeNumber()
		});
		
		return (rowsInserted > 0) ? true : false;
	}

	
}
