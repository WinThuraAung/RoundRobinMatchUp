import java.util.ArrayList;

public class BallerDreams {
    public static void main(String[] args) {
        ArrayList<String> Teams=new ArrayList<>();
        Teams.add("Michelle");
        Teams.add("Oppa");
        Teams.add("VC Anar");
        Teams.add("Obama");
        new BallerDreams().RoundRobin(4,Teams);
    }

    public void RoundRobin(int numberofteams, ArrayList<String> teams){
        ArrayList<String> randomTeam=new ArrayList<>();
        for (int i=1; i<numberofteams+1;i++){
            int randomNumber=(int) (Math.random()*teams.size());
            randomTeam.add(teams.get(randomNumber));
            System.out.println("Team "+i+" = "+teams.get(randomNumber));
            teams.remove(randomNumber);
        }

        /*
          The following only applies for four teams
         */

        System.out.println("Round 1: ");
        for (int i=0; i<3;i+=2) {
            System.out.println( randomTeam.get(i) + " vs " + randomTeam.get(i+1));
        }
        System.out.println("Round 2: ");
        for (int i=1; i>=0;i--) {
            System.out.println( randomTeam.get(i) + " vs " + randomTeam.get(i+2));
        }
        int y=3;
        System.out.println("Round 3: ");
        for (int j=0;j<2;j++){
            System.out.println(randomTeam.get(j)+" vs "+randomTeam.get(y));
            y--;
        }
    }
}
