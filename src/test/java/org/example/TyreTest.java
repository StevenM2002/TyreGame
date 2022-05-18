package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class TyreTest {

    @Test
    void simpleTest() {
        var myBoard = new Board(10, 10);
        var myTyre = new Tyre(5, 3, myBoard);
        assertEquals(5, myTyre.getXLoc());
        myTyre.moveLeft();
        assertEquals(4, myTyre.getXLoc());
        assertEquals(3, myTyre.getYLoc());
        assertTrue(myTyre.isColliding(4, 3));
        myTyre.moveDown();
        assertTrue(myTyre.isColliding(4, 2));
        for (int i = 0; i < 3; i++) {
            myTyre.moveDown();
        }
        assertTrue(myTyre.isColliding(4, 0));
        for (int i = 0; i < 10; i++) {
            myTyre.moveUp();
            myTyre.moveRight();
        }
        assertTrue(myTyre.isColliding(9, 9));
        for (int i = 0; i < 15; i++) {
            myTyre.moveDown();
            myTyre.moveLeft();
        }
        assertTrue(myTyre.isColliding(0, 0));
    }
    @Test
    void newTest() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);
        list.add(2);
        System.out.println(list.remove(0));
        System.out.println(list.remove(0));
    }
}