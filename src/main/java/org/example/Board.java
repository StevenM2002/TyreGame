package org.example;

public class Board {
    public static final int EMPTYSPACE = 0;
    public static final int TYRENUM = 1;
    public static final int ENEMYNUM = 2;
    public static final int POINTSNUM = 3;
    public static final int COLLISIONNUM = 4;
    private int xBoardLen;
    private int yBoardLen;
    private int numPoints = 0;
    private int[][] theBoard;
    public Board(int xBoardLen, int yBoardLen) {
        assert xBoardLen > 0;
        assert yBoardLen > 0;
        this.xBoardLen = xBoardLen;
        this.yBoardLen = yBoardLen;
        this.theBoard = new int[xBoardLen][yBoardLen];
        for (int i = 0; i < yBoardLen; i++) {
            for (int j = 0; j < xBoardLen; j++) {
                this.theBoard[j][i] = 0;
            }
        }
    }

    public int getXBoardLen() {
        return this.xBoardLen;
    }

    public int getYBoardLen() {
        return this.yBoardLen;
    }
    public void setEntityOnBoard(int xLoc, int yLoc, int spaceType) {
        assert xLoc < this.xBoardLen && xLoc >= 0;
        assert yLoc < this.yBoardLen && yLoc >= 0;
        this.theBoard[xLoc][yLoc] = spaceType;
    }

    public int getEntityAtLocation(int xLoc, int yLoc) {
        assert xLoc < this.xBoardLen && xLoc >= 0;
        assert yLoc < this.yBoardLen && yLoc >= 0;
        return this.theBoard[xLoc][yLoc];
    }

    public void printBoard() {
        for (int i = 0; i < yBoardLen; i++) {
            for (int j = 0; j < xBoardLen; j++) {
                System.out.print(this.theBoard[j][i]);
                System.out.print(' ');
            }
            System.out.println();
        }
        System.out.println();
    }

    public void addPoints(int numPoints) {
        this.numPoints += numPoints;
    }
    public int getPoints() {
        return this.numPoints;
    }
}
