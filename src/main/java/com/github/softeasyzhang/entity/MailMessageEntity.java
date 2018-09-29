package com.github.softeasyzhang.entity;

/**
 * the message entity for user setting
 * @author EasyZhang
 * @date 2018/9/27 -  11:23
 */

public class MailMessageEntity {

    /**
     * mail.cc
     */
    private String cc;

    /**
     * mail.receiver
     */
    private String receiver;

    /**
     * mail.subject
     */
    private String subject;

    /**
     * mail.message
     */
    private String message;

    public String getCc() {
        return cc;
    }

    public void setCc(String cc) {
        this.cc = cc;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
