package utilities.pojo;

import java.io.Serializable;

/**
 * 
 * @author ramkumarsundarajan
 *
 */
public class Profile implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	private String userId;
	
	private String teamId;
	
	private String projectId;
	
	private String progress;
	
	private String comment;
	
	private String reportingManager;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getTeamId() {
		return teamId;
	}

	public void setTeamId(String teamId) {
		this.teamId = teamId;
	}

	public String getProjectId() {
		return projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

	public String getProgress() {
		return progress;
	}

	public void setProgress(String progress) {
		this.progress = progress;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getReportingManager() {
		return reportingManager;
	}

	public void setReportingManager(String reportingManager) {
		this.reportingManager = reportingManager;
	}
	
	

}
