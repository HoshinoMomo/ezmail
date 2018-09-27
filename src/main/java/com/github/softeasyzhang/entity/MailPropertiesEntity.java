package com.github.softeasyzhang.entity;

/**
 * @author EasyZhang
 * @date 2018/9/27 -  11:23
 */

public class MailPropertiesEntity {

    /**
     * mail.host
     */
    private String host;

    /**
     * mail.transport.protocol
     */
    private String protocol;

    /**
     * mail.smtp.auth
     */
    private String auth;

    private String sender;
    private String senderPass;

    /**
     * Carbon Copy
     */
    private String mailCC;
    private String receiver;

    /**
     * subject
     */
    private String subject;

    /**
     * message
     */
    private String message;

    /**
     * attach
     */
    private String attach;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public String getAuth() {
        return auth;
    }

    public void setAuth(String auth) {
        this.auth = auth;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getSenderPass() {
        return senderPass;
    }

    public void setSenderPass(String senderPass) {
        this.senderPass = senderPass;
    }

    public String getMailCC() {
        return mailCC;
    }

    public void setMailCC(String mailCC) {
        this.mailCC = mailCC;
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

    public String getAttach() {
        return attach;
    }

    public void setAttach(String attach) {
        this.attach = attach;
    }
}
