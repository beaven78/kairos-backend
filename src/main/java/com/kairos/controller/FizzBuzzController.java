package com.kairos.controller;

import com.kairos.service.FizzBuzzService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Controller class for calculating divisible by 3 or 5
 *
 * Dev notes: I could of created an interface for this api but it seemed too simple to be necessary.
 *
 * @version 0.1
 *
 * @author Stephen Foster
 */
@Controller
public class FizzBuzzController {

    private static final Logger LOGGER = LoggerFactory.getLogger(FizzBuzzController.class);

    private static final String FIZZ_BUZZ_PATH_VARIABLE = "fizzBuzzVal";

    private FizzBuzzService fizzBuzzService;

    /**
     * Method extracts a path variable, determines its fizz buzz value and returns it.
     * @param fizzBuzzVal path variable to process
     * @return result of fizzBuzzService
     */
    @RequestMapping(value="/{" + FIZZ_BUZZ_PATH_VARIABLE + "}", method = RequestMethod.GET)
    @ResponseBody
    public String fizzBuzzGet(@PathVariable(value = FIZZ_BUZZ_PATH_VARIABLE) Integer fizzBuzzVal) {

        LOGGER.info("Processing: " + fizzBuzzVal);

        return fizzBuzzService.processFizzBuzz(fizzBuzzVal);
    }

    /**
     * Dev notes: Spring recommendations to use setters on Autowired components rather than on the variable defintion.
     *
     * Setter for fizzBuzzService
     *
     * @param fizzBuzzService
     */
    @Autowired
    public void setFizzBuzzService(FizzBuzzService fizzBuzzService) {
        this.fizzBuzzService = fizzBuzzService;
    }

}
