package com.animal.butterfly;

import com.animal.Animal;

public class Caterpillar extends Animal {
    @Override
    public String walk() {
        return "I can crawl";
    }

    @Override
    public String fly() {
        return null;
    }

    @Override
    public String sing() {
        return null;
    }
}
