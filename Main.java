package com.company;

public class Main {

    public static void main(String[] args) {
        ThePoint point1 = new ThePoint();
        ThePoint point2 = new ThePoint(10, 30.5);


        System.out.println("The distance between ("
                + point1.getX() + ", " + point1.getY() + ") and ("
                + point2.getX() + ", " + point2.getY() + ") is: " +
                point1.distance(point2));

    }

}
