package beans;

import java.util.List;

import javax.annotation.PostConstruct;

import utilities.MasterDataDao;
import utilities.pojo.Project;
import utilities.pojo.Team;
import utilities.pojo.User;

/**
 * used to load the data at the application startup and will be in session scope. 
 * @author ramkumarsundarajan
 *
 */
public class SystemStartup extends AppBaseBean {


	private static final long serialVersionUID = 1L;

	private MasterDataDao masterDataDao;

	private List<User> users;
	
	private List<Team> teams;
	
	private List<Project> projects;
	
	@PostConstruct
	public void loadMasterData(){
		fetchTeams();
		fetchProjects();
	}

	private void fetchTeams(){
		setTeams(masterDataDao.fetchAllTeams());
	}
	
	private void fetchProjects(){
		setProjects(masterDataDao.fetchAllProjects());
	}

	public MasterDataDao getMasterDataDao() {
		return masterDataDao;
	}

	public void setMasterDataDao(MasterDataDao masterDataDao) {
		this.masterDataDao = masterDataDao;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public List<Team> getTeams() {
		return teams;
	}

	public void setTeams(List<Team> teams) {
		this.teams = teams;
	}

	public List<Project> getProjects() {
		return projects;
	}

	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}

	

}
