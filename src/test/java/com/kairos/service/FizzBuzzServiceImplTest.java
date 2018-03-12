package com.kairos.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

/**
 * Test class to unit test FizzBuzzServiceImpl
 *
 * Dev notes: Each test, verifies a specific use case for the processFizzBuzz method.
 *
 * @version 0.1
 *
 * @author Stephen Foster
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class FizzBuzzServiceImplTest {

    private FizzBuzzService fizzBuzzService;

    @Test
    public void itShouldReturnBuzzWhenTheGivenNumberIsAMultipleOf5() {
        assertEquals("Buzz", fizzBuzzService.processFizzBuzz(5));
    }

    @Test
    public void itShouldReturnFizzBuzzWhenTheGivenNumberIsAMultipleOf3And5() {
        assertEquals("FizzBuzz", fizzBuzzService.processFizzBuzz(15));
    }

    @Test
    public void itShouldReturnTheGivenNumber() {
        assertEquals("2", fizzBuzzService.processFizzBuzz(2));
    }

    @Test
    public void itShouldReturnFizzWhenTheGivenNumberIsAMultipleOf3() {
        assertEquals("Fizz", fizzBuzzService.processFizzBuzz(3));
    }

    @Autowired
    public void setFizzBuzzService(FizzBuzzService fizzBuzzService) {
        this.fizzBuzzService = fizzBuzzService;
    }
}