package org.amm.design.patterns.structural.adapter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Demo {
    private static final Logger LOGGER = LoggerFactory.getLogger(Demo.class);
    public static void main(String args[]){
        Adaptable adapter = new Adapter();
        adapter.doThis(5,6);
    }
}
