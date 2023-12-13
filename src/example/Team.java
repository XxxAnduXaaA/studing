package example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Team<T extends Participant> {
    private String name;
    private List<T> participants = new ArrayList<>();

    public Team(String name){
        this.name = name;
    }


    public void addParticipant(T participant) {
        participants.add(participant);
        System.out.println("New member of team: " + participant.getName());
    }


    public void playWith(Team<T> team){
        String winnerGame;

        Random random = new Random();
        int r = random.nextInt(2);

        if(r == 0){
            winnerGame = this.name;
        }
        else{
            winnerGame = team.name;
        }

        System.out.println("Winner is team " + winnerGame);
    }

}
