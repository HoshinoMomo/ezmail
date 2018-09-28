package com.github.softeasyzhang.session.defaults;

import com.github.softeasyzhang.session.Configuration;
import com.github.softeasyzhang.session.MailSession;
import com.github.softeasyzhang.session.MailSessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author EasyZhang
 * @date 2018/9/28 -  10:42
 */

public class DefaultMailSessionFactory implements MailSessionFactory {

    private static final Logger logger = LoggerFactory.getLogger(DefaultMailSessionFactory.class);

    private final Configuration configuration;

    public DefaultMailSessionFactory(Configuration configuration){
        this.configuration = configuration;
    }

    @Override
    public MailSession getMailSession(Configuration configuration) {
        return new DefaultMailSession(configuration);
    }

    public Configuration getConfiguration() {
        return configuration;
    }
}
