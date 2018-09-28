package com.github.softeasyzhang.session;

import com.github.softeasyzhang.entity.MailSenderEntity;

/**
 * @author EasyZhang
 * @date 2018/9/28 -  10:40
 */

public interface MailSessionFactory {

     MailSession getMailSession();

     MailSession getMailSession(MailSenderEntity mailSenderEntity);
}
