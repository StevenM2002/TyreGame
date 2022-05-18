package org.example;

public class Enemy extends SettedEntity {
    Board myBoard;
    public Enemy(int xSpawn, int ySpawn, Board myBoard) {
        super(xSpawn, ySpawn, myBoard);
        myBoard.setEntityOnBoard(xSpawn, ySpawn, Board.ENEMYNUM);
        this.myBoard = myBoard;
    }
    @Override
    public void afterMovement() {
        myBoard.setEntityOnBoard(this.getXLoc(), this.getYLoc(), Board.ENEMYNUM);
    }
    @Override
    public void moveUp() {
        if (this.getYLoc() != myBoard.getYBoardLen() - 1) {
            moveWrapper(SettedEntity.Movement.UP);
        } else {
            if (myBoard.getEntityAtLocation(this.getXLoc(), this.getYLoc()) == Board.ENEMYNUM) {
                myBoard.setEntityOnBoard(this.getXLoc(), this.getYLoc(), Board.EMPTYSPACE);
            }
        }
    }
}
