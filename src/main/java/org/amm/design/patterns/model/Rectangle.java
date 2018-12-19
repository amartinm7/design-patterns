package org.amm.design.patterns.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Rectangle extends Shape implements Drawable {
    private static final Logger LOGGER = LoggerFactory.getLogger(Rectangle.class);
    public Rectangle(){
        type = "Rectangle";
    }

    @Override
    public void draw() {
        LOGGER.info("Draw Rectangle");
    }
}
