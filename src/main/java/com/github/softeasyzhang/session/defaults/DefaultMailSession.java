package com.github.softeasyzhang.session.defaults;

import com.github.softeasyzhang.entity.MailMessageEntity;
import com.github.softeasyzhang.session.Configuration;
import com.github.softeasyzhang.session.MailSession;
import com.sun.deploy.util.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Date;
import java.util.Objects;
import java.util.Properties;

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
        if(!canMailMessageEntityUse(mailMessageEntity)){
            throw new NullPointerException("receiver can not be null");
        }

        MimeMessage mimeMessage = new MimeMessage(configuration.getSession());
        //form
        mimeMessage.setFrom(new InternetAddress(configuration.getProperties().getProperty("username")));
        //to
        mimeMessage.setRecipient(MimeMessage.RecipientType.TO,new InternetAddress(mailMessageEntity.getReceiver()));
        //subject
        mimeMessage.setSubject(mailMessageEntity.getSubject());
        //content
        mimeMessage.setContent(mailMessageEntity.getMessage(),"text/html;charset=UTF-8");
        //send date
        mimeMessage.setSentDate(new Date());
        //save
        mimeMessage.saveChanges();

        return mimeMessage;
    }

    private boolean canMailMessageEntityUse(MailMessageEntity mailMessageEntity){
        if(Objects.isNull(mailMessageEntity.getReceiver())|| "".equals(mailMessageEntity.getReceiver())){
            return false;
        }
        return true;
    }
}
