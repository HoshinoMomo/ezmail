package com.github.softeasyzhang.session;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Properties;

/**
 * @author EasyZhang
 * @date 2018/9/28 -  10:54
 */

public class Configuration {

    protected Properties properties;
    protected boolean isPools;

    private static final Logger logger = LoggerFactory.getLogger(Configuration.class);

    public Properties getProperties() {
        return properties;
    }

    public boolean isPools() {
        return isPools;
    }

    public void setPools(boolean pools) {
        isPools = pools;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }
}
