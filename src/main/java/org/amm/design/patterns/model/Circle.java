package org.amm.design.patterns.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Circle extends Shape implements Drawable {
    private static final Logger LOGGER = LoggerFactory.getLogger(Circle.class);
    public Circle(){
        type = "Circle";
    }

    @Override
    public void draw() {
        LOGGER.info("Draw Circle");
    }
}
