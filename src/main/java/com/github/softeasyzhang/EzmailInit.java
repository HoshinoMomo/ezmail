package com.github.softeasyzhang;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author EasyZhang
 * @date 2018/9/27 -  10:36
 */
@Configuration
public class EzmailInit {

    private static final Logger logger = LoggerFactory.getLogger(EzmailInit.class);

    @Bean
    public void init(){
       logger.info("启动开始...");

       logger.info("启动完成...");
    }


}
