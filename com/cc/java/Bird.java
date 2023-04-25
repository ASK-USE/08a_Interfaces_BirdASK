package com.cc.java;

public class Bird implements Flyable, Ifeathers {

    @Override
    public String fly() {
        return "i'm a bird, i can fly!"; 
    }

    @Override
    public String hasFeathers() {
        return "I'm a bird, I have feathers!";  
    }
    
}
