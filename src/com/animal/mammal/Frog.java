package com.animal.mammal;

import com.animal.Animal;

public class Frog extends Animal {
    @Override
    public String walk() {
        return "I can walk";
    }

    @Override
    public String fly() {
        return null;
    }

    @Override
    public String sing() {
        return "Oop Oop";
    }
}
