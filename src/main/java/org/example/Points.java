package org.example;

import java.util.Random;

public class Points extends Enemy {
    Board myBoard;
    public Points(int xSpawn, int ySpawn, Board myBoard) {

        super(xSpawn, ySpawn, myBoard);
        this.myBoard = myBoard;
    }
    @Override
    public void afterMovement() {
        myBoard.setEntityOnBoard(this.getXLoc(), this.getYLoc(), Board.POINTSNUM);
    }
    @Override
    public void moveUp() {
        if (this.getYLoc() != myBoard.getYBoardLen() - 1) {
            moveWrapper(SettedEntity.Movement.UP);
        } else {
            if (myBoard.getEntityAtLocation(this.getXLoc(), this.getYLoc()) == Board.POINTSNUM) {
                myBoard.setEntityOnBoard(this.getXLoc(), this.getYLoc(), Board.EMPTYSPACE);
            }
        }
    }
}
