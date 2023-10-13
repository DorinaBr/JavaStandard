package session12_polymorphism.challenges.construction_project_in_progress;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TeamManager {
    private static final Map<String, Team> teams = new HashMap<>();

    private TeamManager() {
    }

    public static Map<String, Team> getTeams() {
        return teams;
    }

    public static Team addNewTeam(String name, List<Employee> employees){
        Team team = new Team(name, employees);
        teams.put(team.getName(), team);
        return team;
   }
}
