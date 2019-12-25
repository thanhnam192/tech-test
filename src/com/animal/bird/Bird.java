package com.animal.bird;

import com.animal.Animal;

public class Bird extends Animal {

    @Override
    public String walk() {
        return "I am walking";
    }

    @Override
    public String fly() {
        return "I am flying";
    }

    @Override
    public String sing() {
        return "I am singing";
    }


}
