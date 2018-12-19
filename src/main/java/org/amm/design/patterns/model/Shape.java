package org.amm.design.patterns.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class Shape implements Cloneable {
    private static final Logger LOGGER = LoggerFactory.getLogger(Shape.class);
    private String id;
    protected String type;

    abstract void draw();

    public String getType(){
        return type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Object clone() {
        Object clone = null;

        try {
            clone = super.clone();

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return clone;
    }
}


