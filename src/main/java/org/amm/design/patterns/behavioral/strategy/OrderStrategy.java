package org.amm.design.patterns.behavioral.strategy;

import java.util.Comparator;
import java.util.List;

@FunctionalInterface
public interface OrderStrategy {

    Task getFirstOrderedTask(List<Task> list);

    OrderStrategy ascended = (List<Task> list) ->
        list.stream().min( Comparator.comparingInt(Task::getDuration)).get();


    OrderStrategy descended = (List<Task> list) ->
            list.stream().max( Comparator.comparingInt(Task::getDuration)).get();
}
