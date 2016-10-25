package com.synisys.go.common;

import org.apache.myfaces.webapp.StartupServletContextListener;

import javax.annotation.PostConstruct;
import javax.servlet.ServletContext;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.PropertyResourceBundle;

/**
 * Created by zaven.chilingaryan on 10/24/2016.
 */
public class ApplicationInitializer extends StartupServletContextListener {
    private static PropertyResourceBundle applicationProperty ;


    @Override
    public void contextInitialized(javax.servlet.ServletContextEvent event) {
        super.contextInitialized(event);
        ServletContext servletContext = event.getServletContext();
        try {
            initApplicationProperties(servletContext);
            initUploadFolder(servletContext);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void initUploadFolder(ServletContext servletContext) {
        String appPath = servletContext.getRealPath("/");
        String uploadFolderName = getUploadFolder();
        File file = new File(appPath + uploadFolderName);
        if(! file.exists()){
            file.mkdir();
        }
    }

    private void initApplicationProperties(ServletContext servletContext) throws IOException {
        InputStream inputStream = servletContext.getResourceAsStream("/WEB-INF/application.properties");
        applicationProperty = new PropertyResourceBundle(inputStream);

    }

    public static String getProperty(String key){
        return applicationProperty.getString(key);
    }

    public static String getUploadFolder(){
        return applicationProperty.getString("de.uploadFolder");

    }
}
