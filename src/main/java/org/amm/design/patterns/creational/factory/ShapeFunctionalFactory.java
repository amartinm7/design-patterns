package org.amm.design.patterns.creational.factory;

import org.amm.design.patterns.model.Circle;
import org.amm.design.patterns.model.Drawable;
import org.amm.design.patterns.model.Rectangle;
import org.amm.design.patterns.model.Square;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.function.Supplier;

/**
 * create an new object without exposing the creation logic to the client and refer
 * to newly created object using a common interface.
 */
public class ShapeFunctionalFactory {
    private static final Logger LOGGER = LoggerFactory.getLogger(ShapeFunctionalFactory.class);
    //use getShape method to get object of type shape
    public static Supplier<Drawable> getShape(String shapeType){
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return Circle::new;

        } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return Rectangle::new;

        } else if(shapeType.equalsIgnoreCase("SQUARE")){
            return Square::new;
        }
        return null;
    }

    public static void main(String args[]) {
        ShapeFunctionalFactory.getShape("CIRCLE").get().draw();
        ShapeFunctionalFactory.getShape("RECTANGLE").get().draw();
        ShapeFunctionalFactory.getShape("SQUARE").get().draw();
    }
}
