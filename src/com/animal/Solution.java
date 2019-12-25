package com.animal;

import com.animal.bird.*;
import com.animal.butterfly.Butterfly;
import com.animal.fish.Clownfish;
import com.animal.fish.Fish;
import com.animal.fish.Shark;
import com.animal.mammal.Cat;
import com.animal.mammal.Dog;
import com.animal.mammal.Dolphin;
import com.animal.mammal.Frog;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;

public class Solution {


    public static void main(String[] args){
        Animal[] animals = new Animal[]{
                new Bird(),
                new Duck(),
                new Chicken(),
                new Rooster(),
                new Parrot(),
                new Fish(),
                new Shark(),
                new Clownfish(),
                new Dolphin(),
                new Frog(),
                new Dog(),
                new Butterfly(),
                new Cat()
        };

        Map<String, Object> animalsCanFly = checkAnimal(animals, a -> a.fly() != null);
        System.out.println("Animals can fly : " + animalsCanFly.get("total") + " , they are : " + animalsCanFly.get("animals"));

        Map<String, Object> animalsCanWalk = checkAnimal(animals, a -> a.walk() != null);
        System.out.println("Animals can walk : " + animalsCanWalk.get("total") + " , they are : " + animalsCanWalk.get("animals"));

        Map<String, Object> animalsCanSing = checkAnimal(animals, a -> a.sing() != null);
        System.out.println("Animals can sing : " + animalsCanSing.get("total") + " , they are : " + animalsCanSing.get("animals"));

        Map<String, Object> animalsCanSwim = checkAnimal(animals, a -> a.swim() != null);
        System.out.println("Animals can swim : " + animalsCanSwim.get("total") + " , they are : " + animalsCanSwim.get("animals"));

        //----BONUS
        System.out.println("\n\n---------BONUS SECTION------");
        Rooster rooster1 = new Rooster();
        System.out.println("rooster say as default : " + rooster1.sing() );

        Rooster rooster2 = new Rooster("Japanese");
        System.out.println("rooster say in Japanese : " + rooster2.sing());
    }

    public static Map<String, Object> checkAnimal(Animal[] animals, Predicate<Animal> predicate){
        int total = 0;
        StringBuilder animalsName = new StringBuilder();
        for(Animal animal : animals ){
            if ( predicate.test(animal) ) {
                total++;
                animalsName.append(animal.getClass().getSimpleName() + " , ");
            }
        }

        Map<String, Object> result = new HashMap<>();
        result.put("total", total);
        result.put("animals", animalsName.toString());
        return result;

    }
}
