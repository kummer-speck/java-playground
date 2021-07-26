package com.statefarm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        RockPaperScissors game = new RockPaperScissors();
        Scanner scan = new Scanner(System.in);

        System.out.println("===============================");
        System.out.println("=======Welcome to SkyNet=======");
        System.out.println("Choose rock, paper or scissors");
        String playerChoice = scan.next();
//        game.playCPUAlwaysWins(playerChoice);
        game.playFairGame(playerChoice);
        System.out.println("===============================");

    }

}


