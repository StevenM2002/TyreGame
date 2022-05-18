package org.example;

import java.util.ArrayList;

public class Endings {
    private static int numPointsGained = 10;
    public static void doLossEnd(Board board) {
        board.printBoard();
        System.out.println("You have lost");
        System.exit(0);
    }
//    public static boolean isTyreEnemyCollision(Tyre tyre, Enemy enemy) {
//        return tyre.getXLoc() == enemy.getXLoc() && tyre.getYLoc() == enemy.getYLoc();
//    }
//    public static void handleTyreEnemyWaveCollision(Tyre tyre, EnemyWave wave, Board myBoard) {
//        ArrayList<Enemy> theWave = wave.getEnemyList();
//        for (Enemy enemy : theWave) {
//            if (Endings.isTyreEnemyCollision(tyre, enemy)) {
//                myBoard.setEntityOnBoard(tyre.getXLoc(), tyre.getYLoc(), Board.COLLISIONNUM);
//                doLossEnd(myBoard);
//            }
//        }
//    }
//    public static boolean isTyrePointsCollision(Tyre tyre, Points point) {
//        return tyre.getXLoc() == point.getXLoc() && tyre.getYLoc() == point.getYLoc();
//    }
//    public static void HandleTyrePointsCollision(Tyre tyre, Points point, Board myBoard) {
//        if (isTyrePointsCollision(tyre, point)) {
//            myBoard.setEntityOnBoard(tyre.getXLoc(), tyre.getYLoc(), Board.TYRENUM);
//            myBoard.addPoints(numPointsGained);
//        }
//    }
}
