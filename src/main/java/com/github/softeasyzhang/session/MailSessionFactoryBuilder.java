package com.github.softeasyzhang.session;

import com.github.softeasyzhang.session.defaults.DefaultMailSessionFactory;

import java.io.FileInputStream;
import java.util.Properties;

/**
 * @author EasyZhang
 * @date 2018/9/28 -  15:05
 */

public class MailSessionFactoryBuilder {

     public MailSessionFactory build(String propertiesUrl) throws Exception{
         Properties properties = new Properties();
         properties.load(new FileInputStream(propertiesUrl));

         Configuration configuration = new Configuration(properties);

         return new DefaultMailSessionFactory(configuration);
     }
}
