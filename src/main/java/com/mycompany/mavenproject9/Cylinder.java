
package com.mycompany.mavenproject9;

//Class Definition
public class Cylinder {

//    Attributes
    private double radius;
    private double height;

//  Methods   
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;

    }
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    
    public double surfaceArea(double radius, double height){
        return 2*3.142*radius*radius+2*3.142*radius*height;
    }
    
    public double volume(){
        return 3.142*radius*radius*height;
    }
}
