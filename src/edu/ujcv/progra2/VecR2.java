package edu.ujcv.progra2;

public class VecR2 {
    private double x;
    private double y;

    private VecR2(){

    }

    public VecR2(double x, double y){
        this.x = x;
        this.y = y;
    }

    public VecR2(VecR2 a){
        this.y = a.getY();
        this.x = a.getX();
    }


    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}
