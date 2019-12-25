package com.test;

import com.animal.bird.Rooster;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RoosterTest {
    Rooster rooster;
    @Before
    public void postConstruct(){
        rooster = new Rooster();
    }

    @Test
    public void rooster_can_crow(){
        Assert.assertEquals("ROAR....!", rooster.crow());
    }
}
