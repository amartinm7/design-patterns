package org.amm.design.patterns.structural.adapter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Adaptee {
    private static final Logger LOGGER = LoggerFactory.getLogger(Adaptee.class);
    public void doThat(int x, int y, int z){
        LOGGER.info("doing that ({},{},{})...", x, y, z);
    }
}
