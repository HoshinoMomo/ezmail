package com.github.softeasyzhang.session.defaults;

import com.github.softeasyzhang.entity.MailSenderEntity;
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

    public MailSession getMailSession() {
        return null;
    }

    public MailSession getMailSession(MailSenderEntity mailSenderEntity) {
        return null;
    }
}
