package utilities;

import java.io.Serializable;
import java.util.Map;

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

}
