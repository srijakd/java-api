package com.neplab;

// import javax.security.auth.login.LoginException;
import oracle.iam.platform.OIMClient;

import java.io.IOException;
import java.util.Properties;

public class Config {
    //    public static final Logger logger = Logger.getLogger(Config.class.getName());
    OIMClient oimClient = null;

    public static final Properties PROPERTIES = new Properties();

    static {
        try {
            PROPERTIES.load(UserManagement.class.getClassLoader().getResourceAsStream("app.properties"));
        } catch (IOException e) {
            System.out.println("Couldn't open properties file: "+ e.getMessage());;
        }
    }

    public static String getProperty(String propertyName) {
        return PROPERTIES.getProperty(propertyName);
    }

    public static final String OIM_USERNAME = getProperty("oim_username");
    public static final String OIM_PASSWORD = getProperty("oim_pass");

    }



