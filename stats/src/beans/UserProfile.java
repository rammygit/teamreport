package beans;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;

import utilities.UserDao;
import utilities.pojo.Profile;
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
	
	private String userId;
	
	private String projectId;
	
	private String teamId;
	
	private String progress;
	
	private String statusUpdate;
	
	private String reportingManager;
	
	
	@PostConstruct
	public void loadData(){
		users = userDao.selectAll();
		
	}
	
	public String saveUserProfile(){
		Profile profile = new Profile();
		profile.setUserId(userId);
		profile.setTeamId(teamId);
		profile.setProjectId(projectId);
		profile.setComment(statusUpdate);
		profile.setProgress(progress);
		profile.setReportingManager(reportingManager);
		
		return null;
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

	

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
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


	public String getStatusUpdate() {
		return statusUpdate;
	}


	public void setStatusUpdate(String statusUpdate) {
		this.statusUpdate = statusUpdate;
	}


	public String getReportingManager() {
		return reportingManager;
	}


	public void setReportingManager(String reportingManager) {
		this.reportingManager = reportingManager;
	}

}
