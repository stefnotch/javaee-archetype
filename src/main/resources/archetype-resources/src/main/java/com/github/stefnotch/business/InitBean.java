package com.github.stefnotch.business;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.time.LocalDate;

@Startup
@Singleton
public class InitBean {
    @PersistenceContext
    EntityManager em;

    public InitBean() {

    }

    @PostConstruct
    private void init() {
        
    }
}
