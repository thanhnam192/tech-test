package com.animal.bird;

import com.animal.Animal;
import com.animal.bird.Bird;

public class Parrot extends Bird {
    private Animal friend;

    public Parrot(){

    }

    public Parrot(Animal friend){
        this.friend = friend;
    }

    @Override
    public String sing() {
        if( friend != null && friend.sing() != null){
            return friend.sing();
        }
        return "kek kek";
    }
}
