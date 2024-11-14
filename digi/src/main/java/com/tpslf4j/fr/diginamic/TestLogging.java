package com.tpslf4j.fr.diginamic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.tpslf4j.fr.diginamic.service.AppService;

public class TestLogging {
    private static final Logger logger = LoggerFactory.getLogger(TestLogging.class);

    AppService appService;

    public static void main(String[] args) {
        AppService appService = new AppService();
        for (int i = 0; i < 100; i++) {
            logger.info("Bienvenue dans le projet de démonstration de logging avec SLF4J et Logback!");
            appService.executer("Paramètre de test " + i);
        }
    }
}
