package com.github.softeasyzhang.pools.unpooled;

import com.github.softeasyzhang.session.Configuration;

import javax.mail.Transport;

/**
 * @author EasyZhang
 * @date 2018/9/28 -  18:01
 */

public class UnpooledTransport{

    protected final String username;
    protected final String password;
    protected final Configuration configuration;

    public UnpooledTransport(Configuration configuration) {
        this.configuration = configuration;
        this.username = configuration.getProperties().getProperty("username");
        this.password = configuration.getProperties().getProperty("password");
    }

    public Transport getConnect() throws Exception{
        Transport transport = configuration.getSession().getTransport();
        transport.connect(username,password);
        return transport;
    }
}
