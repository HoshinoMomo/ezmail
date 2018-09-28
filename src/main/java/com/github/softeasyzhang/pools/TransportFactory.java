package com.github.softeasyzhang.pools;

import com.github.softeasyzhang.pools.unpooled.UnpooledTransport;
import com.github.softeasyzhang.session.Configuration;


/**
 * @author EasyZhang
 * @date 2018/9/28 -  18:01
 */

public interface TransportFactory {

    /**
     * getUnpooledTransport
     * @param configuration
     * @return
     * @throws Exception
     */
    UnpooledTransport getUnpooledTransport(Configuration configuration) throws Exception;

}
