package dao;

import java.io.Serializable;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;

import beans.UserProfile;
import utilities.converters.ObjectConverter;
import utilities.pojo.Profile;
import utilities.pojo.Project;
import utilities.pojo.Team;
import utilities.pojo.User;

/**
 * 
 * @author ramkumarsundarajan
 *
 */
public class DaoUtil implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	/**
	 * 
	 * @param row
	 * @return
	 */
	public static User userRowMapper(Map<String, Object> row){
		User user = new User();
		user.setUserId((Integer)row.get("userId"));
		user.setfName((String)row.get("fname"));
		user.setlName((String)row.get("lname"));
		user.setRole((String)row.get("role"));
		return user;
	}
	
	
	public static User userRowMapper(ResultSet resultSet) throws SQLException{
		User user = new User();
		user.setUserId(resultSet.getInt("userId"));
		user.setfName(resultSet.getString("fname"));
		user.setlName(resultSet.getString("lname"));
		user.setRole(resultSet.getString("role"));
		return user;
	}
	
	/**
	 * 
	 * @param row
	 * @return
	 */
	public static Team teamRowMapper(Map<String, Object> row){
		Team team = new Team();
		team.setTeamId((Integer)row.get("teamId"));
		team.setTeamName((String)row.get("team_name"));
		team.setTeamOwner((String)row.get("team_owner"));
		team.setActive((String)row.get("active"));
		return team;
	}
	
	
	/**
	 * 
	 * @param row
	 * @return
	 */
	public static Project projectRowMapper(Map<String, Object> row){
		Project project = new Project();
		project.setProjectId((Integer)row.get("projectId"));
		project.setProjectName((String)row.get("project_name"));
		project.setStartDate((String)row.get("start_date"));
		project.setEndDate((String)row.get("end_date"));
		return project;
	}
	
	/**
	 * 
	 * @param row
	 * @return
	 */
	public static Profile profileRowMapper(Map<String, Object> row) {
		Profile profile = new Profile();
		profile.setUserId(ObjectConverter.toString(row.get("userId")));
		profile.setTeamId(ObjectConverter.toString(row.get("teamId")));
		profile.setProjectId(ObjectConverter.toString(row.get("projectId")));
		profile.setComment(ObjectConverter.toString(row.get("comment")));
		profile.setReportingManager(ObjectConverter.toString(row.get("reporting_manager")));
		profile.setProgress(ObjectConverter.toString(row.get("progress")));
		return profile;
	}

}
