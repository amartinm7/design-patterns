package org.amm.design.patterns.model;

public class Rectangle extends Shape implements Drawable {

    public Rectangle(){
        type = "Rectangle";
    }

    @Override
    public void draw() {
        System.out.println("Draw Rectangle");
    }
}
