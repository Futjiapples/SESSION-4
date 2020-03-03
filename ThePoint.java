package com.company;

public class ThePoint {

    private double x;
    private double y;

    ThePoint() {
        this (0,0);
    }


    ThePoint(double x, double y) {

            this.x = x;
            this.y = y;
    }

    public double getX(){
            return x;
    }

    public double getY(){
            return y;
    }

    public double distance(ThePoint thePoint){
        return Math.sqrt(Math.pow(thePoint.getX() - x, 2) + Math.pow(thePoint.getY() -y, 2));


    }

    public double distance(double x, double y){
            return distance(new ThePoint(x, y));
    }

}

