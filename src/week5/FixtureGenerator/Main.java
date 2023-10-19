package week5.FixtureGenerator;

public class Main {
    public static void main(String[] args) {
        FixtureGenerator fixtureGenerator = new FixtureGenerator();

        fixtureGenerator.getTeamsFromUser();

        fixtureGenerator.generateFixtures();
    }
}