package com;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestLogger {

    private static final Logger logger = LoggerFactory.getLogger(TestLogger.class);

    @Test
    public void testLogger(){
        logger.info("testLoggre:{}","testLogger");
    }
}
