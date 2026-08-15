package org.prog.session5;

public class Plane {
    public int seats = 3;
    public int board = 4;

    public void goTo() {
        if (board <= seats) {

            System.out.println(seats + "seats" + board + "boarded passengers");
        } else {
            System.out.println("too many passengers");
        }
    }
}


