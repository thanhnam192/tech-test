package com.animal.bird;

public class Chicken  extends Bird{
    @Override
    public String sing() {
        return "Cluck, cluck";
    }

    @Override
    public String fly() {
        return null;
    }
}
