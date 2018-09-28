package com.github.softeasyzhang.example;

import com.github.softeasyzhang.entity.MailMessageEntity;
import com.github.softeasyzhang.session.MailSession;
import com.github.softeasyzhang.session.MailSessionFactory;
import com.github.softeasyzhang.session.MailSessionFactoryBuilder;

/**
 * @author EasyZhang
 * @date 2018/9/28 -  14:45
 */

public class Main {
    public static void main(String[] args) throws Exception{

        MailSessionFactoryBuilder mailSessionFactoryBuilder = new MailSessionFactoryBuilder();
        MailSessionFactory mailSessionFactory = mailSessionFactoryBuilder.build("src/main/resource/sender.properties");
        MailSession mailSession = mailSessionFactory.getMailSession();

        MailMessageEntity mailMessageEntity = new MailMessageEntity();
        mailMessageEntity.setReceiver("692051437@qq.com");
        mailMessageEntity.setMessage("damaxiya");
        mailMessageEntity.setSubject("test");

        mailSession.sendMail(mailMessageEntity);
        mailSession.close();
    }
}
