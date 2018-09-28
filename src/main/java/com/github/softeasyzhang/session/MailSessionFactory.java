package com.github.softeasyzhang.session;

import com.github.softeasyzhang.entity.MailMessageEntity;

/**
 * @author EasyZhang
 * @date 2018/9/28 -  10:40
 */

public interface MailSessionFactory {

     MailSession getMailSession();

     MailSession getMailSession(MailMessageEntity mailMessageEntity);
}
