package com.jtafinalassessment.code;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Hello {
    private static final Logger LOGGER = LogManager.getLogger(Hello.class.getName());
    public static void main(String[] args) {
        LOGGER.info("Rangu");
    }
}
