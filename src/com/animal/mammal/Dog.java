package com.animal.mammal;

import com.animal.Animal;

public class Dog extends Animal {
    @Override
    public String walk() {
        return "I walk like a dog";
    }

    @Override
    public String fly() {
        return null;
    }

    @Override
    public String sing() {
        return "Woof, woof";
    }
}
