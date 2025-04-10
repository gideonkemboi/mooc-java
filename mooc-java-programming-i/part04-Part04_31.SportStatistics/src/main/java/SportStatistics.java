
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("File:");
        String filename = scan.nextLine();

        ArrayList<Team> teams = new ArrayList<>();
        ArrayList<String> recordedTeams = new ArrayList<>();

        try ( Scanner file = new Scanner(Paths.get(filename))) {
            while (file.hasNextLine()) {
                String line = file.nextLine();
                String[] gameStats = line.split(",");

                String homeTeam = gameStats[0];
                String visitingTeam = gameStats[1];

                int homeTeamScore = Integer.valueOf(gameStats[2]);
                int visitingTeamScore = Integer.valueOf(gameStats[3]);

                if (!(recordedTeams.contains(homeTeam))) {
                    Team team = new Team(homeTeam);

                    if (homeTeamScore > visitingTeamScore) {
                        team.incrementWins();
                    } else {
                        team.incrementLosses();
                    }

                    team.incrementGames();
                    recordedTeams.add(homeTeam);
                    teams.add(team);
                } else {
                    for (Team team : teams) {
                        if (team.getName().equals(homeTeam)) {
                            team.incrementGames();

                            if (homeTeamScore > visitingTeamScore) {
                                team.incrementWins();
                            } else {
                                team.incrementLosses();
                            }

                            break;
                        }
                    }
                }

                if (!(recordedTeams.contains(visitingTeam))) {
                    Team team = new Team(visitingTeam);

                    if (homeTeamScore < visitingTeamScore) {
                        team.incrementWins();
                    } else {
                        team.incrementLosses();
                    }

                    team.incrementGames();
                    recordedTeams.add(visitingTeam);
                    teams.add(team);
                } else {
                    for (Team team : teams) {
                        if (team.getName().equals(visitingTeam)) {
                            team.incrementGames();

                            if (homeTeamScore < visitingTeamScore) {
                                team.incrementWins();
                            } else {
                                team.incrementLosses();
                            }

                            break;
                        }
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Team: ");
        String teamName = scan.nextLine();

        boolean notFound = true;
        
        for (Team team : teams) {
            if (team.getName().equals(teamName)) {
                System.out.println("Games: " + team.getGames());
                System.out.println("Wins: " + team.getWins());
                System.out.println("Losses: " + team.getLosses());
                
                notFound = false;
                break;
            }
        }
        
        if (notFound) {
            System.out.println("Games: " + 0);
            System.out.println("Wins: " + 0);
            System.out.println("Losses: " + 0);
        }
    }

}
