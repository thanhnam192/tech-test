package com.test;

import com.animal.bird.Parrot;
import com.animal.bird.Rooster;
import com.animal.mammal.Cat;
import com.animal.mammal.Dog;
import org.junit.Assert;
import org.junit.Test;

public class ParrotTest {

    @Test
    public void parrot_near_dog_says_like_a_dog(){
        Dog dog = new Dog();
        Parrot parrot = new Parrot(dog);

        Assert.assertEquals(dog.sing(), parrot.sing());
    }

    @Test
    public void parrot_near_cat_says_like_a_cat(){
        Cat cat = new Cat();
        Parrot parrot = new Parrot(cat);

        Assert.assertEquals(cat.sing(), parrot.sing());
    }


    @Test
    public void parrot_near_rooster_says_like_a_rooster(){
        Rooster rooster = new Rooster();
        Parrot parrot = new Parrot(rooster);

        Assert.assertEquals(rooster.sing(), parrot.sing());
    }
}
