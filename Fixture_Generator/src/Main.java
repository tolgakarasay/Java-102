import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the number of teams in the league : ");
        int n = scanner.nextInt();

        FixtureGenerator fixtureGenerator = new FixtureGenerator(n);

        System.out.println("Please enter the names of the teams.");
        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.print("Team " + (i + 1) + " : ");
            fixtureGenerator.addToTeamList(scanner.nextLine());
        }

        fixtureGenerator.run();
    }
}

