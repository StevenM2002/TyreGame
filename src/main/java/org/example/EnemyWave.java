package org.example;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class EnemyWave {
    Board theBoard;
    private int yWave;
    private int yCoveragePercentage = 60;
    private int numEnemies;
    private ArrayList<Enemy> enemyList = new ArrayList<>();
    public EnemyWave(Board theBoard) {
        this.theBoard = theBoard;
        this.yWave = theBoard.getYBoardLen();
        this.doSpawn();
    }

    public boolean isOutOfScreen() {
//        System.out.println(yWave);
        return yWave <= 0;
    }

    public int getYWave() {
        return yWave;
    }

    public void doSpawn() {
        Random rand = new Random();
        double waveCoverage = ((double) rand.nextInt(yCoveragePercentage) / 100) * theBoard.getXBoardLen();
        int numEnemies = (int) Math.floor(waveCoverage);
        Set<Integer> enemyPositions = new HashSet<>();
        while (enemyPositions.size() < numEnemies) {
            int pos = rand.nextInt(theBoard.getXBoardLen());
            enemyPositions.add(pos);
        }
        for (Integer pos : enemyPositions) {
            this.enemyList.add(new Enemy(pos, 0, theBoard));
        }
        for (Enemy enemy : enemyList) {
            theBoard.setEntityOnBoard(enemy.getXLoc(), enemy.getYLoc(), Board.ENEMYNUM);
        }
    }

    public void moveUp() {
        for (Enemy enemy : enemyList) {
            enemy.moveUp();
        }
        this.yWave--;
    }

    public ArrayList getEnemyList() {
        return enemyList;
    }
}
