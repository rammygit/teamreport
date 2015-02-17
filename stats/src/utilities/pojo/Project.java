package utilities.pojo;

import java.io.Serializable;

/**
 * pojo class for project entity
 * @author ramkumarsundarajan
 *
 */
public class Project implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer projectId;
	
	private String projectName;
	
	private String startDate;
	
	private String endDate;

	public Integer getProjectId() {
		return projectId;
	}

	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	
	

}
