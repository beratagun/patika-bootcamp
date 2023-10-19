package week5.FixtureGenerator;

import java.util.ArrayList;
import java.util.Scanner;

public class FixtureGenerator {
    private ArrayList<String> teams;

    FixtureGenerator() {
        this.teams = new ArrayList<>();
    }

    public void getTeamsFromUser() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Takım sayısını giriniz : ");
        int numTeams = sc.nextInt();
        sc.nextLine();

        System.out.println("Takım isimlerini giriniz: ");
        for (int i = 0; i < numTeams; i++) {
            System.out.print("Takım " + (i + 1) + ": ");
            String team = sc.nextLine();
            teams.add(team);
        }
    }

    public void generateFixtures() {
        ArrayList<String> fixtures = new ArrayList<>();

        if (teams.size() % 2 != 0) {
            teams.add("BAY");
        }

        int numWeeks = teams.size() - 1;
        int halfSize = teams.size() / 2;

        for (int week = 0; week < numWeeks; week++) {
            System.out.println("Tur " + (week + 1));

            for (int i = 0; i < halfSize; i++) {
                String homeTeam = teams.get(i);
                String awayTeam = teams.get(teams.size() - 1 - i);

                if (!homeTeam.equals("BAY") && !awayTeam.equals("BAY")) {
                    System.out.println(homeTeam + " vs " + awayTeam);
                } else {
                    System.out.println(homeTeam + "(BAY)");
                }
            }

            String lastTeam = teams.remove(teams.size() - 1);
            teams.add(1, lastTeam);
        }
    }

    public void addTeam(String teamName) {
        teams.add(teamName);
    }
}