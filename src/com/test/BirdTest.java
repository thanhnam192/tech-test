package com.test;


import com.animal.bird.Bird;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BirdTest {
    private Bird bird;

    @Before
    public void postConstruct(){
        bird = new Bird();
    }

    @Test
    public void bird_can_fly(){
        Assert.assertEquals("I am flying", bird.fly());
    }

    @Test
    public void bird_can_sing(){
        Assert.assertEquals("I am singing", bird.sing());
    }

    @Test
    public void bird_can_walk(){
        Assert.assertEquals("I am walking", bird.walk());
    }
}
