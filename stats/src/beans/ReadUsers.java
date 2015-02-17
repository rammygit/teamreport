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
public class ReadUsers implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	
	private UserDao userDao;
	
	private UserProfileBean userProfile;
	
	private List<User> users;
	
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


	public UserProfileBean getUserProfile() {
		return userProfile;
	}


	public void setUserProfile(UserProfileBean userProfile) {
		this.userProfile = userProfile;
	}

}
