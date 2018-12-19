package org.amm.design.patterns.structural.adapter;

public class Demo {
    public static void main(String args[]){
        Adaptable adapter = new Adapter();
        adapter.doThis(5,6);
    }
}
