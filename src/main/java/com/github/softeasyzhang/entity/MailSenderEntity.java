package com.github.softeasyzhang.entity;

/**
 * @author EasyZhang
 * @date 2018/9/27 -  11:23
 */

public class MailSenderEntity {

    /**
     * mail.host
     */
    private String host;

    /**
     * mail.port
     */
    private String port;

    private String username;

    private String password;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
