
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Team> teams = new ArrayList<>();
        
        System.out.println("File: ");
        String file = scanner.nextLine();

        try (Scanner readFile = new Scanner(Paths.get(file))) {
            while (readFile.hasNextLine()) {
                String[] row = readFile.nextLine().split(",");
                String homeTeamName = row[0];
                String visitingTeamName = row[1];
                int homeTeamScore = Integer.valueOf(row[2]);
                int visitingTeamScore = Integer.valueOf(row[3]);

                
                boolean isHomeTeamOnList = false;
                boolean isVisitingTeamOnList = false;
                for (Team team : teams) {
                    if (team.getName().equals(homeTeamName)) {
                        isHomeTeamOnList = true;
                    }
                    
                    if (team.getName().equals(visitingTeamName)) {
                        isVisitingTeamOnList = true;
                    }
                }
                
                if (!isHomeTeamOnList) {
                    teams.add(new Team(homeTeamName));
                }
                if (!isVisitingTeamOnList) {
                    teams.add(new Team(visitingTeamName));
                }
                
                for (Team team : teams) {
                    if (team.getName().equals(homeTeamName)) {
                        team.increaseGames();
                        if (homeTeamScore > visitingTeamScore) {
                            team.increaseWins();
                        } else {
                            team.increaseLosses();
                        }
                    } else if (team.getName().equals(visitingTeamName)) {
                        team.increaseGames();
                        if (homeTeamScore < visitingTeamScore) {
                            team.increaseWins();
                        } else {
                            team.increaseLosses();
                        }
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Reading the file " + e.getMessage() + " failed.");
        }
        
        System.out.println("Team:");
        String searchTeam = scanner.nextLine();
        boolean foundTeam = false;
        for (Team team : teams) {
            if (team.getName().equals(searchTeam)) {
                foundTeam = true;
                System
                    .out
                        .println("Games: " + team.getGames()
                            + "\nWins: " + team.getWins()
                            + "\nLosses: " + team.getLosses()
                        );
            }
        }
        
        if (!foundTeam) {
            System.out.println("Games: 0\nWins: 0\nLosses: 0");
        }
    }

}
