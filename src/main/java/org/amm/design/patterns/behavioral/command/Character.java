package org.amm.design.patterns.behavioral.command;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Character {

    private static final Logger LOGGER = LoggerFactory.getLogger(Character.class);

    public Boolean justWalk(){
        LOGGER.info("Walking...");
        return true;
    }

    public Boolean justRun(){
        LOGGER.info("Running...");
        return true;
    }

    public Boolean justJump(){
        LOGGER.info("Jumping...");
        return true;
    }


}
