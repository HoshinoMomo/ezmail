package com.github.softeasyzhang.session;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.mail.Session;
import java.util.Properties;

/**
 * @author EasyZhang
 * @date 2018/9/28 -  10:54
 */

public class Configuration {
    private static final Logger logger = LoggerFactory.getLogger(Configuration.class);

    protected Session session;
    protected Properties properties;
    protected boolean isPooled;
    protected boolean isDebug;

    public Configuration(Properties properties,boolean isPooled, boolean isDebug){
        this.properties = properties;
        this.session = Session.getInstance(properties);
        this.isDebug = isDebug;
        this.session.setDebug(isDebug);
    }

    public Configuration(Properties properties,boolean isPooled){
        this.properties = properties;
        this.session = Session.getInstance(properties);
        this.isDebug = true;
        this.session.setDebug(true);
    }

    public Configuration(Properties properties){
        this.properties = properties;
        this.session = Session.getInstance(properties);
        this.isDebug = true;
        this.session.setDebug(true);
    }

    public Configuration(Session session){
        this.session = session;
    }

    public Properties getProperties() {
        return properties;
    }

    public boolean isPooled() {
        return isPooled;
    }

    public void setPooled(boolean pooled) {
        isPooled = pooled;
    }

    public Session getSession() {
        return session;
    }
}
