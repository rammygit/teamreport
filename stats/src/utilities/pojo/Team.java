package utilities.pojo;

import java.io.Serializable;

public class Team implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	private Integer teamId;
	
	private String teamName;
	
	private String teamOwner;
	
	private String active;

	public Integer getTeamId() {
		return teamId;
	}

	public void setTeamId(Integer teamId) {
		this.teamId = teamId;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getTeamOwner() {
		return teamOwner;
	}

	public void setTeamOwner(String teamOwner) {
		this.teamOwner = teamOwner;
	}

	public String getActive() {
		return active;
	}

	public void setActive(String active) {
		this.active = active;
	}

}
