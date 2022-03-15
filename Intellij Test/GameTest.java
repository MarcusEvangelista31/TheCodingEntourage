package com.example.myapplication;

import java.util.ArrayList;
import org.junit.Test;

import static org.junit.Assert.*;

public class GameTest {
    private static Game game = new Game();

    @Test
    public static void main(String[] args) {
        GameRound gameRound;
        ArrayList<Icon> gameRoundArray;
        while (!game.isGameOver()){
            gameRound = game.getGameRound();
            gameRoundArray = gameRound.getOrder();
            for (int i = 0;i < gameRoundArray.size();i++){
                System.out.print(gameRoundArray.get(i).getName() + " - ");
            }
            System.out.println("");
        }
    }
}
