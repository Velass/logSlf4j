package com.tpslf4j.fr.diginamic.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AppService {
    private static final Logger LOG = LoggerFactory.getLogger(AppService.class);

    public void executer(String param) {
        LOG.info("Traitement 1 : param = {}", param);
    }
}
