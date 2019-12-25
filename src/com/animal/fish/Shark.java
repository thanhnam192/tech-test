package com.animal.fish;

public class Shark extends Fish implements FishFeature {
    @Override
    public String size() {
        return "lager";
    }

    @Override
    public String color() {
        return "grey";
    }

    @Override
    public boolean canJoke() {
        return false;
    }

    @Override
    public boolean canEatOtherFish() {
        return true;
    }
}
