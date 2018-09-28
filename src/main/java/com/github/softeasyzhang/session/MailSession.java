package com.github.softeasyzhang.session;

import com.github.softeasyzhang.entity.MailMessageEntity;

import javax.mail.internet.MimeMessage;

/**
 * @author EasyZhang
 * @date 2018/9/28 -  10:40
 */
public interface MailSession {

    MimeMessage createMimeMessage(MailMessageEntity mailMessageEntity);

}
