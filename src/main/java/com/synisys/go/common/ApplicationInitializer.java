package com.synisys.go.common;

import org.apache.myfaces.webapp.StartupServletContextListener;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.PropertyResourceBundle;

/**
 * Created by zaven.chilingaryan on 10/24/2016.
 */
public class ApplicationInitializer extends StartupServletContextListener {
    private static PropertyResourceBundle applicationProperty ;
    private String appPath;

    @Override
    public void contextInitialized(javax.servlet.ServletContextEvent event) {
        super.contextInitialized(event);
        
    }

    private void initApplicationProperties() throws IOException {
        InputStream inputStream = new FileInputStream("/WEB-INF/application.properties");
        applicationProperty = new PropertyResourceBundle(inputStream);

    }

    public static String getProperties(String key){
        return applicationProperty.getString(key);
    }

    public static String getUploadFolder(){
        return applicationProperty.getString("de.uploadFolder");

    }
}
