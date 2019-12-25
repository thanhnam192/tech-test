package com.test;

import com.animal.bird.Chicken;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ChickenTest {
    private Chicken chicken;

    @Before
    public void postConstruct(){
        chicken = new Chicken();
    }

    @Test
    public void chicken_can_not_fly(){
        Assert.assertNull(chicken.fly());
    }

    @Test
    public void chicken_can_not_swim(){
        Assert.assertNull(chicken.swim());
    }

    @Test
    public void chicken_can_sing(){
        Assert.assertEquals("Cluck, cluck", chicken.sing());
    }

    @Test
    public void bird_can_walk(){
        Assert.assertEquals("I am walking", chicken.walk());
    }
}
