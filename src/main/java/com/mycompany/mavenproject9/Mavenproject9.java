
package com.mycompany.mavenproject9;

public class Mavenproject9 {

    public static void main(String[] args) {
        Cylinder c = new Cylinder();
        c.setRadius(19.2);
        System.out.println("Radius:" + c.getRadius());
        c.setHeight(20.2);
        System.out.println("Height:" + c.getHeight());
        System.out.println("Surface Area:" + c.surfaceArea(19.2,20.2));
        System.out.println("Volume:" + c.volume());
    }
}
