package com.application.ad4243.dao;

import javax.jdo.JDOHelper;
import javax.jdo.PersistenceManagerFactory;

public class PMF {
    private static final PersistenceManagerFactory factory = 
        JDOHelper.getPersistenceManagerFactory("transactions-optional");
     
    private PMF(){}
     
    public static PersistenceManagerFactory get(){
        return factory;
    }
    
    ///////////////////////////////////////
    // PMFと全然関係ないけどUserNoをここで管理
    ///////////////////////////////////////
    
    private static int userId;
    public static int getNextUserId(){ return userId++; }
}