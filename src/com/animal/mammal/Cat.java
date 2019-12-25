package com.animal.mammal;

import com.animal.Animal;

public class Cat extends Animal {
    @Override
    public String walk() {
        return "I walk like a lazy cat";
    }

    @Override
    public String fly() {
        return null;
    }

    @Override
    public String sing() {
        return "Meow";
    }
}
