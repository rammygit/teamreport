package beans;

import java.io.Serializable;


import utilities.UserDao;
import utilities.pojo.User;

/**
 * read users session bean. 
 * @author ramkumarsundarajan
 *
 */
public class ReadUsers implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	
	private UserDao userDao;
	
	
	/**
	 * gets you the list of the user list.
	 * @return
	 */
	public String getUserList() {
		
		
		try {
			User user = (User)userDao.getById(1);
			System.out.println("printing user dao first name :"+user.getfName() + " last name : "+user.getlName());
			
			
		} catch (Exception e) {
			System.out.println("printing exception");
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

}
