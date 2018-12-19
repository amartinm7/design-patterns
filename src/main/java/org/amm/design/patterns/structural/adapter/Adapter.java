package org.amm.design.patterns.structural.adapter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.MessageFormat;

public class Adapter implements Adaptable {
    private static final Logger LOGGER = LoggerFactory.getLogger(Adapter.class);
    public void doThis(int x, int y){
        int calculatedValuedZ = 7;
        LOGGER.info(MessageFormat.format("adapting doThis({0}, {1}) to doThat({0}, {1}, {2})...", x, y, calculatedValuedZ));
        new Adaptee().doThat(x, y, calculatedValuedZ);
    }
}
