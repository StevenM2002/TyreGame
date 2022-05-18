package org.example;

public class Entity {
    private int xLoc;
    private int yLoc;
    private int xBoardLen;
    private int yBoardLen;
    Board theBoard;

    public Entity(int xSpawn, int ySpawn, Board myBoard) {
        if (xSpawn < 0) xSpawn = 0;
        if (xSpawn > myBoard.getXBoardLen() - 1) xSpawn = myBoard.getXBoardLen() - 1;
        if (ySpawn < 0) ySpawn = 0;
        if (ySpawn > myBoard.getYBoardLen() - 1) ySpawn = myBoard.getYBoardLen() - 1;
        this.xLoc = xSpawn;
        this.yLoc = ySpawn;
        this.xBoardLen = myBoard.getXBoardLen();
        this.yBoardLen = myBoard.getYBoardLen();
        this.theBoard = myBoard;
    }

    public void moveLeft() {
        if (this.xLoc == 0) {
            this.xLoc = 0;
        } else {
            this.xLoc--;
        }
    }

    public void moveRight() {
        if (this.xLoc == xBoardLen - 1) {
            this.xLoc = xBoardLen - 1;
        } else {
            this.xLoc++;
        }
    }

    public void moveDown() {
        if (this.yLoc == 0) {
            this.yLoc = 0;
        } else {
            this.yLoc--;
        }
    }

    public void moveUp() {
        if (this.yLoc == yBoardLen - 1) {
            this.yLoc = yBoardLen - 1;
        } else {
            this.yLoc++;
        }
    }

    public boolean isColliding(int xLoc, int yLoc) {
        return this.xLoc == xLoc && this.yLoc == yLoc;
    }

    public int getXLoc() {
        return this.xLoc;
    }

    public int getYLoc() {
        return this.yLoc;
    }
}
