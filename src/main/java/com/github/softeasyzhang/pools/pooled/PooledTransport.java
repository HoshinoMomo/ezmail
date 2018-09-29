package com.github.softeasyzhang.pools.pooled;

import com.github.softeasyzhang.pools.unpooled.UnpooledTransport;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author EasyZhang
 * @date 2018/9/29 -  15:54
 */

public class PooledTransport {

    private static final Logger logger = LoggerFactory.getLogger(PooledTransport.class);

    private final PoolState state = new PoolState(this);

    private UnpooledTransport unpooledTransport;
}
