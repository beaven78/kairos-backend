package com.kairos.service;

/**
 * Interface contract for fizz buzz service
 *
 * Dev notes: Including constants in interface as they are agnostic of implementation.
 *
 * @version 0.1
 *
 * @author Stephen Foster
 */
public interface FizzBuzzService {

    Integer FIZZ_DIVISIBLE_VALUE = 3;
    Integer BUZZ_DIVISIBLE_VALUE = 5;

    String BUZZ = "Buzz";
    String FIZZ = "Fizz";
    String FIZZ_BUZZ = FIZZ + BUZZ;

    /**
     * Method determines if parsed value is multiple by 5 or 3
     * @param fizzBuzzVal value to process
     * @return String Fizz, Buzz, FizzBuzz or the value itself if neither is applicable
     */
    String processFizzBuzz(Integer fizzBuzzVal);
}
