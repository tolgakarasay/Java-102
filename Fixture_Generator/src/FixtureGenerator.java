import java.util.ArrayList;

public class FixtureGenerator {
    private int numOfTeams;
    private ArrayList<String> teamList = new ArrayList<>();;

    public FixtureGenerator(int numOfTeams) {
        this.numOfTeams = numOfTeams;
    }

    public void addToTeamList(String str){
        this.teamList.add(str);
    }

    public void run(){
        printTeamList();
        generateFixture();
    }

    public void printTeamList(){
        System.out.println();
        System.out.println("Teams");
        for (String team: teamList) {
            System.out.println("- " + team);
        }
        System.out.println();
    }

    public void generateFixture(){

        if (this.numOfTeams % 2 == 1) {
            addToTeamList("Bay");
        }

        for (int i = 0; i < teamList.size() - 1; i++) {
            System.out.println("Round "+(i+1));
            for (int j = 0; j < teamList.size() / 2; j++) {
                System.out.println(teamList.get(j) + " vs " + teamList.get(teamList.size() - j - 1));
            }
            System.out.println();

            String temp = teamList.get(1);
            teamList.remove(1);
            teamList.add(temp);
        }

        for (int i = 0; i < teamList.size() - 1; i++) {
            System.out.println("Round "+(teamList.size()+i));
            for (int j = 0; j < teamList.size() / 2; j++) {
                System.out.println(teamList.get(teamList.size() - j - 1) + " vs " + teamList.get(j));
            }
            System.out.println();

            String temp = teamList.get(1);
            teamList.remove(1);
            teamList.add(temp);
        }
    }
}
