package com.example.demo;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class CustomAssertTest {


    @Test
    public void not_null(){

        Coffee lattee = new Coffee();
        lattee.setName("라떼");

        CustomAssert.notNull(lattee.getName(), "coffee's name must not be null");
    }


    @Test(expected = IllegalArgumentException.class)
    public void not_null_exception(){

        Coffee lattee = new Coffee();
        lattee.setName("라떼");

        CustomAssert.notNull(lattee.getPrice(), "coffee's price must not be null");

    }


    @Test
    public void is_true(){

        int limit = 10;

        CustomAssert.isTrue(limit > 5, "Limit must be greater than 5");
    }


    @Test(expected = IllegalArgumentException.class)
    public void is_true_exception(){

        int limit = 3;

        CustomAssert.isTrue(limit > 5, "Limit must be greater than 5");
    }


    @Test
    public void state(){

        Coffee lattee = new Coffee();
        lattee.setName("라떼");

        CustomAssert.state(lattee.getName() != null, "");

    }


    @Test(expected = IllegalStateException.class)
    public void state_exception(){

        Coffee lattee = new Coffee();
        lattee.setName("라떼");

        CustomAssert.state(lattee.getPrice() != null, "");

    }


    @Test
    public void not_empty(){

        Set<String> coffees = new HashSet<>();

        coffees.add("latte");

        CustomAssert.notEmpty(coffees, "Coffees must not be empty!");

    }


    @Test(expected = IllegalArgumentException.class)
    public void not_empty_exception(){

        Set<String> coffees = new HashSet<>();

        CustomAssert.notEmpty(coffees, "Coffees must not be empty!");

    }

}