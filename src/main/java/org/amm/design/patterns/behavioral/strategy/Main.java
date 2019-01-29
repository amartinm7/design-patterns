package org.amm.design.patterns.behavioral.strategy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.List;

public class Main {

    private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);

    public static void main(String args[]){
        final Task t1 = new Task("one",1000);
        final Task t2 = new Task("two",2000);
        final Task t3 = new Task("three",3000);
        final List<Task> tasks =  Arrays.asList(t1,t2,t3);
        LOGGER.info(OrderStrategy.ascended.getFirstOrderedTask(tasks).toString());
        LOGGER.info(OrderStrategy.descended.getFirstOrderedTask(tasks).toString());
    }
}
