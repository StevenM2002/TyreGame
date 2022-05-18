package org.example;

public class SettedEntity extends Entity {
    public static enum Movement{
        LEFT,
        RIGHT,
        UP,
        DOWN
    }
    Board myBoard;
    public SettedEntity(int xSpawn, int ySpawn, Board myBoard) {
        super(xSpawn, ySpawn, myBoard);
        myBoard.setEntityOnBoard(xSpawn, ySpawn, Board.ENEMYNUM);
        this.myBoard = myBoard;
    }
    public void afterMovement() {
        // To be used in subclass
    }
    public void moveWrapper(Movement movement) {
        myBoard.setEntityOnBoard(this.getXLoc(), this.getYLoc(), Board.EMPTYSPACE);
        switch (movement) {
            case UP -> super.moveUp();
            case DOWN -> super.moveDown();
            case LEFT -> super.moveLeft();
            case RIGHT -> super.moveRight();
        }
        this.afterMovement();
    }
    @Override
    public void moveLeft() {
        moveWrapper(Movement.LEFT);
    }
    @Override
    public void moveRight() {
        moveWrapper(Movement.RIGHT);
    }
    @Override
    public void moveDown() {
        moveWrapper(Movement.DOWN);
    }
    @Override
    public void moveUp() {
        moveWrapper(Movement.UP);
    }
}
