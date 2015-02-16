package utilities.pojo;

import java.io.Serializable;

/**
 * 
 * @author ramkumarsundarajan
 *
 */
public class User implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	private Integer userId;
	
	private String fName;
	
	private String lName;
	
	private String role;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}	

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}
	
	

}
