package beans;

import java.sql.SQLException;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import dao.UserDao;
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
	
	private List<Profile> profiles;
	
	private String selectProfileOption;
	
	private String workType;
	
	private String workTypeNumber;
	
	
	@PostConstruct
	public void loadData(){
		users = userDao.selectAll();
		
	}
	
	/**
	 * save into user_profile table.
	 * @return
	 */
	public String saveUserProfile(){
		Profile profile = new Profile();
		profile.setUserId(userId);
		profile.setTeamId(teamId);
		profile.setProjectId(projectId);
		profile.setComment(statusUpdate);
		profile.setProgress(progress);
		profile.setReportingManager(reportingManager);
		profile.setWorkType(workType);
		profile.setWorkTypeNumber(workTypeNumber);
		boolean saved = userDao.saveProfileData(profile);
		if (saved) {
			setMessage("profile data is saved successfully");
			
		} else {
			setMessage("saving profile data failed!!");
			
		}
		
		return null;
	}
	
	/**
	 * 
	 * @return
	 */
	public String fetchProfileData(){
		try {
			profiles = userDao.fetchUserProfileData(new Integer(userId));
		} catch (NumberFormatException e) {			
			e.printStackTrace();
		} catch (SQLException e) {			
			e.printStackTrace();
		}
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

	public List<Profile> getProfiles() {
		return profiles;
	}

	public void setProfiles(List<Profile> profiles) {
		this.profiles = profiles;
	}

	public String getSelectProfileOption() {
		return selectProfileOption;
	}

	public void setSelectProfileOption(String selectProfileOption) {
		this.selectProfileOption = selectProfileOption;
	}

	public String getWorkType() {
		return workType;
	}

	public void setWorkType(String workType) {
		this.workType = workType;
	}

	public String getWorkTypeNumber() {
		return workTypeNumber;
	}

	public void setWorkTypeNumber(String workTypeNumber) {
		this.workTypeNumber = workTypeNumber;
	}

}
