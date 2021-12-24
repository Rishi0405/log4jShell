package com.log4jshell;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DependencyApp {

    private static final Logger logger = LogManager.getLogger(DependencyApp.class);

    public static void runTheLog(String msg) {
        logger.info(msg);
    }
}
