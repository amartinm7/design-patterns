package org.amm.design.patterns.model;

public class Square extends Shape implements Drawable {

    public Square(){
        type = "Square";
    }

    @Override
    public void draw() {
        System.out.println("Draw Square");
    }
}
