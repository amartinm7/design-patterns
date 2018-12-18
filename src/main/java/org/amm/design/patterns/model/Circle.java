package org.amm.design.patterns.model;

public class Circle extends Shape implements Drawable {

    public Circle(){
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("Draw Circle");
    }
}
