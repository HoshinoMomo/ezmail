package com.github.softeasyzhang.session.defaults;

import com.github.softeasyzhang.entity.MailMessageEntity;
import com.github.softeasyzhang.session.Configuration;
import com.github.softeasyzhang.session.MailSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.mail.Session;
import javax.mail.internet.MimeMessage;

/**
 * @author EasyZhang
 * @date 2018/9/28 -  10:41
 */

public class DefaultMailSession implements MailSession {

    private static final Logger logger = LoggerFactory.getLogger(DefaultMailSession.class);

    private final Configuration configuration;

    public DefaultMailSession(Configuration configuration){
        this.configuration = configuration;
    }

    @Override
    public MimeMessage createMimeMessage(MailMessageEntity mailMessageEntity) {
        Session session = Session.getInstance(configuration.getProperties());
        session.setDebug(true);
    }
}
