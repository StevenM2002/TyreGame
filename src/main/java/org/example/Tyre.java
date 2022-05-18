package org.example;

import java.util.ArrayList;
import java.util.Set;

public class Tyre extends SettedEntity {
    Board myBoard;
    public Tyre(int xSpawn, int ySpawn, Board myBoard) {
        super(xSpawn, ySpawn, myBoard);
        myBoard.setEntityOnBoard(xSpawn, ySpawn, Board.TYRENUM);
        this.myBoard = myBoard;
    }
    @Override
    public void afterMovement() {
        myBoard.setEntityOnBoard(this.getXLoc(), this.getYLoc(), Board.TYRENUM);
    }
    public void handleIfCollideEnemy(Enemy enemy) {
        if (this.getXLoc() == enemy.getXLoc() && this.getYLoc() == enemy.getYLoc()) {
            myBoard.setEntityOnBoard(this.getXLoc(), this.getYLoc(), Board.COLLISIONNUM);
            Endings.doLossEnd(myBoard);
        }
    }
    public void handleIfCollideWave(EnemyWave wave) {
        ArrayList<Enemy> theWave = wave.getEnemyList();
        for (Enemy enemy : theWave) {

        }
    }
    public boolean isHandleIfGetPoints(Points point) {
        if (this.getXLoc() == point.getXLoc() && this.getYLoc() == point.getYLoc()) {
            myBoard.addPoints(10);
            return true;
        }
        return false;
    }
}
