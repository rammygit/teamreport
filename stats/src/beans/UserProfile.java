package beans;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;

import utilities.UserDao;
import utilities.pojo.User;

/**
 * read users session bean. 
 * TODO: create the get user list from DB and move in the changes to save the user progress details into a new table.
 * @author ramkumarsundarajan
 *
 */
public class UserProfile extends AppBaseBean {

	
	private static final long serialVersionUID = 1L;	
	
	private UserDao userDao;
	
	private SystemStartup systemStartup;
	
	private List<User> users;
	
	private String userName;
	
	private String projectId;
	
	private String teamId;
	
	private String progress;
	
	
	
	
	@PostConstruct
	public void loadData(){
		users = userDao.selectAll();
		
	}
	

	public UserDao getUserDao() {
		return userDao;
	}


	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public SystemStartup getSystemStartup() {
		return systemStartup;
	}

	public void setSystemStartup(SystemStartup systemStartup) {
		this.systemStartup = systemStartup;
	}

	public String getProjectId() {
		return projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

	public String getTeamId() {
		return teamId;
	}

	public void setTeamId(String teamId) {
		this.teamId = teamId;
	}


	public String getProgress() {
		return progress;
	}


	public void setProgress(String progress) {
		this.progress = progress;
	}

}
