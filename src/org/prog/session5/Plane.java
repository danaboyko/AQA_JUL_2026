package org.prog.session5;

public class Plane {
    public int seats = 3;

    public void board(int passengers) {

        if (passengers <= seats) {

            System.out.println(seats + "seats" + passengers + "boarded passengers");
        } else {
            System.out.println("too many passengers");
        }
    }
}


