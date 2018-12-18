package org.amm.design.patterns.creational.prototype;

import org.amm.design.patterns.model.Shape;

/**
 * Clone the objects. In this example to do that, we are creating the objects to clone and
 * we are storing in a cache. When we are going to create a new object, we clone the existing ones.
 */
public class Demo {
    public static void main(String[] args) {
        ShapeCache.loadCache();

        Shape clonedShape = (Shape) ShapeCache.getShape("1");
        System.out.println("Shape : " + clonedShape.getType());

        Shape clonedShape2 = (Shape) ShapeCache.getShape("2");
        System.out.println("Shape : " + clonedShape2.getType());

        Shape clonedShape3 = (Shape) ShapeCache.getShape("3");
        System.out.println("Shape : " + clonedShape3.getType());
    }
}
