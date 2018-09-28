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

    private static final Logger logger = LoggerFactory.getLogger(Configuration.class);

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }
}
