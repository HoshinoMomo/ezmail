package com.github.softeasyzhang.pools.unpooled;

import com.github.softeasyzhang.pools.TransportFactory;
import com.github.softeasyzhang.session.Configuration;

import javax.mail.Transport;

/**
 * @author EasyZhang
 * @date 2018/9/28 -  18:08
 */

public class UnpooledTransportFactory implements TransportFactory {

    @Override
    public UnpooledTransport getUnpooledTransport(Configuration configuration) throws Exception{
        return new UnpooledTransport(configuration);
    }
}
