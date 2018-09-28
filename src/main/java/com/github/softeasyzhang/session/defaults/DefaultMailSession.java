package com.github.softeasyzhang.session.defaults;

import com.github.softeasyzhang.entity.MailMessageEntity;
import com.github.softeasyzhang.session.Configuration;
import com.github.softeasyzhang.session.MailSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.mail.Session;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Date;

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
    public MimeMessage createMimeMessage(MailMessageEntity mailMessageEntity) throws Exception{
        Session session = Session.getInstance(configuration.getProperties());
        session.setDebug(true);

        MimeMessage mimeMessage = new MimeMessage(session);
        //form
        mimeMessage.setFrom(new InternetAddress(session.getProperty("sender"),"","UTF-8"));
        //to
        mimeMessage.setRecipient(MimeMessage.RecipientType.TO,
                     new InternetAddress(mailMessageEntity.getReceiver(),"","UTF-8"));
        //subject
        mimeMessage.setSubject(mailMessageEntity.getSubject());
        //content
        mimeMessage.setContent(mailMessageEntity.getMessage(),"text/html;charset=UTF-8");
        //send date
        mimeMessage.setSentDate(new Date());
        mimeMessage.saveChanges();
        return mimeMessage;
    }
}
