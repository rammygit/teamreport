package beans;

import java.util.List;

import dao.MasterDataDao;
import utilities.pojo.Project;
import utilities.pojo.Team;

/**
 * used by the team and project tab.
 * @author ramkumarsundarajan
 *
 */
public class AddDataBean extends AppBaseBean{
	
	
	private static final long serialVersionUID = 1L;

	private MasterDataDao masterDataDao;
	
	private Team team;
	
	private Project project;
	
	private List<Project> projects;
	
	private List<Team> teams;
	
	

	/**
	 * action method for adding team.
	 * return to index.xhtml
	 * @return
	 */
	public String addTeam(){
		
		masterDataDao.save(team);
		return "index"; 

	}
	
	/**
	 * action method for adding project as master data.
	 * returns to index.xhtml
	 * @return
	 */
	public String addProject(){
		
		masterDataDao.save(project);
		return "index";
	}
	
	
	/**
	 * fetch all the projects 
	 * @return
	 */
	public String fetchProjects(){
		projects = masterDataDao.fetchAllProjects();
		return null;
	}
	
	public String fetchTeams(){
		teams = masterDataDao.fetchAllTeams();
		return null;
	}

	public MasterDataDao getMasterDataDao() {
		return masterDataDao;
	}

	public void setMasterDataDao(MasterDataDao masterDataDao) {
		this.masterDataDao = masterDataDao;
	}
	
	public Team getTeam() {
		return team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	public List<Project> getProjects() {
		return projects;
	}

	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}

	public List<Team> getTeams() {
		return teams;
	}

	public void setTeams(List<Team> teams) {
		this.teams = teams;
	}

}
