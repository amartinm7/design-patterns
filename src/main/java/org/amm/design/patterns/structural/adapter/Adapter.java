package org.amm.design.patterns.structural.adapter;

import java.text.MessageFormat;

public class Adapter implements Adaptable {

    public void doThis(int x, int y){
        int calculatedValuedZ = 7;
        System.out.println(MessageFormat.format("adapting doThis({0}, {1}) to doThat({0}, {1}, {2})...", x, y, calculatedValuedZ));
        new Adaptee().doThat(x, y, calculatedValuedZ);
    }
}
