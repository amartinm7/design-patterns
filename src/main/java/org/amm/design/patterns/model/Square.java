package org.amm.design.patterns.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Square extends Shape implements Drawable {
    private static final Logger LOGGER = LoggerFactory.getLogger(Square.class);
    public Square(){
        type = "Square";
    }

    @Override
    public void draw() {
        LOGGER.info("Draw Square");
    }
}
