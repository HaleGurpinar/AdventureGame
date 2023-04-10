package com.patika;

import java.util.Scanner;

public class Game {

    //Player player;
    //Location location;

    public Scanner input=new Scanner(System.in);

    public void start(){
        System.out.println("Welcome to Adventure Game");
        System.out.println("Please enter a name :");
        String playerName=input.nextLine();
        Player player=new Player(playerName);
        System.out.println("Welcome "+player.getName());
        player.selectChar();
        player.selectLoc();
    }
}
