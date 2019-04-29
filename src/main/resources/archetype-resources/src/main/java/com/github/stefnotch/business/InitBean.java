package com.github.stefnotch.business;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.time.LocalDate;

//@Startup
//@Singleton

@ApplicationScoped
public class InitBean {
    //@PersistenceContext
    //EntityManager em;

    //@Inject
    //Dao dao

    public InitBean() {

    }

    private void init(@Observes @Initialized(ApplicationScoped.class) Object ini) {
        // init code
    }

    /*@PostConstruct
    private void init() {
        
    }*/
}
