package com.synisys.go.system;

import org.apache.myfaces.webapp.StartupServletContextListener;

import javax.servlet.ServletContextEvent;
import java.io.IOException;
import java.io.InputStream;
import java.util.PropertyResourceBundle;

/**
 * Created by meruzhan.gasparyan on 24-Oct-16.
 */
public class ApplicationInitializer extends StartupServletContextListener {
    final String CONFIG_FIEL_PATH = "/WEB-INF/conf.properties";

    private static PropertyResourceBundle properties;
    private static String usersImagesFolder;

    public static PropertyResourceBundle getProperties() {
        if (properties == null) {
            throw new RuntimeException("error: properties aren't loaded properly.");
        }

        return properties;
    }

    public static String getUsersImagesFolder() {
        return usersImagesFolder;
    }

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        try {
            InputStream configStream = servletContextEvent.getServletContext().getResourceAsStream(CONFIG_FIEL_PATH);
            properties = new PropertyResourceBundle(configStream);
            usersImagesFolder = properties.getString("imageFolder");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }



}
