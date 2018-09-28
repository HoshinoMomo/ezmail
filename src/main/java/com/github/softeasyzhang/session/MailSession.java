package com.github.softeasyzhang.session;

import com.github.softeasyzhang.entity.MailMessageEntity;


/**
 * @author EasyZhang
 * @date 2018/9/28 -  10:40
 */
public interface MailSession {

    /**
     * send the mail
     * @param mailMessageEntity
     * @throws Exception
     */
    void sendMail(MailMessageEntity mailMessageEntity) throws Exception;

    /**
     * close the session
     */
    void close();
}
