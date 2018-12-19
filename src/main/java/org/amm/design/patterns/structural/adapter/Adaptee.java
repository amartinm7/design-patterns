package org.amm.design.patterns.structural.adapter;

public class Adaptee {

    public void doThat(int x, int y, int z){
        System.out.println(String.format("doing that (%d,%d,%d)...", x, y, z));
    }
}
