package com.animal.mammal;

import com.animal.Animal;
import com.animal.fish.FishFeature;

public class Dolphin extends Animal implements FishFeature {
    @Override
    public String walk() {
        return null;
    }

    @Override
    public String fly() {
        return null;
    }

    @Override
    public String sing() {
        return null;
    }

    @Override
    public String swim() {
        return "I am a good swimmer";
    }

    @Override
    public String size() {
        return "normal";
    }

    @Override
    public String color() {
        return "blue";
    }

    @Override
    public boolean canJoke() {
        return true;
    }

    @Override
    public boolean canEatOtherFish() {
        return false;
    }
}
