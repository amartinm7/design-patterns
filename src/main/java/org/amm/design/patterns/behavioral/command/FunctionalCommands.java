package org.amm.design.patterns.behavioral.command;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class FunctionalCommands {

    private static final Logger LOGGER = LoggerFactory.getLogger(FunctionalCommands.class);

    private List<Supplier<Boolean>> commands = new ArrayList<>();

    public void addCommand(Supplier<Boolean> command){
        commands.add(command);
    }

    public void executeComands(){
        // commands.forEach(supplier -> LOGGER.info(supplier.get().toString()));
        commands.forEach(Supplier::get);
    }

    public static void main(String args[]){
        Character character = new Character();
        FunctionalCommands fc = new FunctionalCommands();
        fc.addCommand(() -> character.justWalk());
        fc.addCommand(() -> character.justRun());
        fc.addCommand(() -> character.justJump());
        fc.executeComands();
    }
}
