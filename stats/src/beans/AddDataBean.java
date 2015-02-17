package beans;

import java.io.Serializable;

import utilities.MasterDataDao;
import utilities.pojo.Team;

/**
 * 
 * @author ramkumarsundarajan
 *
 */
public class AddDataBean implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	private MasterDataDao masterDataDao;
	
	private Team team;
	
	

	/**
	 * action method for adding team.
	 * return to index.xhtml
	 * @return
	 */
	public String addTeam(){
		
		masterDataDao.save(team);
		return "index"; 

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

}
