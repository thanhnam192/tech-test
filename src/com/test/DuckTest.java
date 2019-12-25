package com.test;

import com.animal.bird.Chicken;
import com.animal.bird.Duck;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DuckTest {
    private Duck duck;

    @Before
    public void postConstruct(){
        duck = new Duck();
    }

    @Test
    public void duck_can_fly(){
        Assert.assertEquals("I am flying", duck.fly());
    }

    @Test
    public void duck_can_swim(){
        Assert.assertEquals("I can swim", duck.swim());
    }

    @Test
    public void duck_can_sing(){
        Assert.assertEquals("Quack, quack", duck.sing());
    }

    @Test
    public void duck_can_walk(){
        Assert.assertEquals("I am walking", duck.walk());
    }
}
