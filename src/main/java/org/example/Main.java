package org.example;
import java.util.ArrayList;
import java.util.Scanner;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Main {
    public static void main(String[] args) {
        var myBoard = new Board(6, 7);
        var myTyre = new Tyre(3, myBoard.getYBoardLen() - 1, myBoard);
        ArrayList<EnemyWave> enemyWaves = new ArrayList<>();
        Scanner myScanner = new Scanner(System.in);
        System.out.println("You are the tyre (1)\nDodge the cars (2)\n" +
                "Enter: \n 0 to start game\n 1 to move left\n 2 to stay\n 3 to move right\n 4 to exit game");
        while (true) {
            // Move waves up then spawn new wave
            for (EnemyWave wave : enemyWaves) {
                wave.moveUp();
            }
            // Check if furthest wave is collided with tyre
            if (enemyWaves.get(0).getYWave() == 0) {
                ArrayList<Enemy> enemies = enemyWaves.get(0).getEnemyList();
                for (Enemy enemy : enemies) {
                    myTyre.handleIfCollideEnemy(enemy);
                }
            }
            var myWave = new EnemyWave(myBoard);
            enemyWaves.add(myWave);
            // no longer reference waves after out of screen
            if (enemyWaves.get(0).isOutOfScreen()) {
                enemyWaves.remove(0);
            }
            // Now receive input after moving wave down
            switch (myScanner.next()) {
                case "1" -> myTyre.moveLeft();
                case "3" -> myTyre.moveRight();
                case "4" -> doExit();
            }

            myBoard.printBoard();
        }

    }
    private static void doExit() {
        System.out.println("You have exited the game");
        System.exit(0);
    }
}