package org.amm.design.patterns.creational.factory;

import org.amm.design.patterns.model.Circle;
import org.amm.design.patterns.model.Drawable;
import org.amm.design.patterns.model.Rectangle;
import org.amm.design.patterns.model.Square;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * create an new object without exposing the creation logic to the client and refer
 * to newly created object using a common interface.
 */
public class ShapeFactory {
    private static final Logger LOGGER = LoggerFactory.getLogger(ShapeFactory.class);
    //use getShape method to get object of type shape
    public Drawable getShape(String shapeType){
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();

        } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();

        } else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }

        return null;
    }
}
