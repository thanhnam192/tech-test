package com.animal.fish;

public class Clownfish extends Fish implements FishFeature {
    @Override
    public String size() {
        return "small";
    }

    @Override
    public String color() {
        return "orange";
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
