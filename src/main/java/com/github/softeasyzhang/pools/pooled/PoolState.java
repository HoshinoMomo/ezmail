package com.github.softeasyzhang.pools.pooled;

import javax.mail.Transport;
import java.util.ArrayList;
import java.util.List;

/**
 * @author EasyZhang
 * @date 2018/9/29 -  15:52
 */

public class PoolState {

    protected PooledTransport pooledTransport;

    protected final List<Transport> freeTransport = new ArrayList<>();

    protected final List<Transport> activeTransport = new ArrayList<>();

    public PoolState(PooledTransport pooledTransport){
        this.pooledTransport = pooledTransport;
    }

}
