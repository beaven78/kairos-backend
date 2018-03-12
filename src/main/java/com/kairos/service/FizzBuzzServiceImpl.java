package com.kairos.service;

import org.springframework.stereotype.Component;

/**
 * Concrete implementation of Interface FizzBuzzService
 *
 * @version 0.1
 *
 * @author Stephen Foster
 */
@Component
public class FizzBuzzServiceImpl implements FizzBuzzService {

    @Override
    public String processFizzBuzz(Integer fizzBuzzVal) {

        String fizzBuzzStr = fizzBuzzVal.toString();

        if (fizzBuzzVal % FIZZ_DIVISIBLE_VALUE == 0 && fizzBuzzVal % BUZZ_DIVISIBLE_VALUE == 0) {
            fizzBuzzStr = FIZZ_BUZZ;
        } else if (fizzBuzzVal % FIZZ_DIVISIBLE_VALUE == 0) {
            fizzBuzzStr = FIZZ;
        } else if (fizzBuzzVal % BUZZ_DIVISIBLE_VALUE == 0) {
            fizzBuzzStr = BUZZ;
        }

        return fizzBuzzStr;
    }
}
