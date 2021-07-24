package com.statefarm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class RockPaperScissors {

    final ArrayList<String> COMPUTERCHOICES = new ArrayList<>(Arrays.asList("rock", "paper", "scissors"));
    final ArrayList<String> OUTCOMES = new ArrayList<>(Arrays.asList("draw", "CPU", "Player"));
    //ask Rich if there's a way to do this without casting...Math.random return a double.
    int randomChoice = (int)(Math.random() * 3);
    String computerPlay = COMPUTERCHOICES.get(randomChoice);

    public void playCPUAlwaysWins(String userPlay){
        userPlay = userPlay.toLowerCase();

        if(userPlay.equals("rock")){
            System.out.println("Computer plays paper, you lose!");
        } else if(userPlay.equals("paper")){
            System.out.println("Computer plays scissors, you lose!");
        } else if(userPlay.equals("scissors")) {
            System.out.println("Computer plays rock, you lose!");
        } else {
            System.out.println("Invalid play");
        }
    }

    private void winMessage(String winner){
        String playerWins = "Player wins!";
        String cpuWins = "The CPU wins, bow to your computer overlord!";
        String cpuPlays = "CPU plays " + computerPlay;
        String gameDraw = cpuPlays + ", it's a draw.";

        if(winner.equals("draw")){
            System.out.println(gameDraw);
        } else if(winner.equals("CPU")){
            System.out.println(cpuPlays);
            System.out.println(cpuWins);
        } else{
            System.out.println(cpuPlays);
            System.out.println(playerWins);
        }

    }

    public void playFairGame(String userPlay){
        userPlay = userPlay.toLowerCase();

        if(userPlay.equals(computerPlay)){
            winMessage(OUTCOMES.get(0));
        } else if(userPlay.equals("rock")){
            if(computerPlay.equals("scissors")){
                winMessage(OUTCOMES.get(2));
            } else {
                winMessage(OUTCOMES.get(1));
            }
        } else if(userPlay.equals("paper")){
            if(computerPlay.equals("rock")){
                winMessage(OUTCOMES.get(2));
            } else {
                winMessage(OUTCOMES.get(1));
            }
        } else {
            if(computerPlay.equals("paper")){
                winMessage(OUTCOMES.get(2));
            } else {
                winMessage(OUTCOMES.get(1));
            }
        }

    }
}
