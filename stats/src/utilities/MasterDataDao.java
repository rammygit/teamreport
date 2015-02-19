package utilities;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import utilities.pojo.Project;
import utilities.pojo.Team;

public class MasterDataDao extends BaseDao {

	@Override
	public Object getById(int id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	
	public void save(Team team){
		String query = "insert into team (team_name, team_owner,active) values (?,?,?)";
		Object[] args = new Object[] {team.getTeamName(), team.getTeamOwner(),team.getActive()};
        
        int out = jdbcTemplate.update(query, args);
         
        if(out !=0){
            System.out.println("team data saved with id="+team.getTeamId());
        }else System.out.println("team data save failed with id");
	}
	
	public void save(Project project){
		String query = "insert into projects (project_name, start_date,end_date) values (?,?,?)";
		Object[] args = new Object[] {project.getProjectName(),project.getStartDate(),project.getEndDate()};
        
        int out = jdbcTemplate.update(query, args);
         
        if(out !=0){
            System.out.println("team data saved with id="+project.getProjectId());
        }else System.out.println("team data save failed with id");
	}
	
	/**
	 * fetch all the projects 
	 * @return
	 */
	public List<Project> fetchAllProjects(){
		String sql = "select * from projects";
		List<Project> projects = new ArrayList<Project>();

		List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);

		for (Map<String, Object> row : rows) {

			projects.add(DaoUtil.projectRowMapper(row));
		}

		return projects;
	}
	
	/**
	 * fetch all teams.
	 * 
	 * @return
	 */
	public List<Team> fetchAllTeams() {
		
		String sql = "select * from team";
		
		List<Team> teams = new ArrayList<Team>();

		List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);

		for (Map<String, Object> row : rows) {

			teams.add(DaoUtil.teamRowMapper(row));
		}

		return teams;
	}

}
