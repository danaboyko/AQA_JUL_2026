package org.prog.session5;

public class Plane {
    public int seats;
    public int board;
    public void goTo(){
        if(board <= seats){

           System.out.println( seats + "seats" + board + "boarded passengers");
        } else{
            System.out.println("too many passengers");
        }
    }
    public static void main(String[] args) {
    Plane plane = new Plane();

    plane.seats = 3;
    plane.board = 1;

    plane.goTo();
 }
}
