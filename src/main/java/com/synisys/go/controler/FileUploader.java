package com.synisys.go.controler;

import com.synisys.go.common.ApplicationInitializer;
import com.synisys.go.dom.User;
import org.primefaces.model.UploadedFile;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.ServletContext;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by zaven.chilingaryan on 10/24/2016.
 */
@ManagedBean
@SessionScoped
public class FileUploader {
    private UploadedFile uploadedFile;

    public UploadedFile getUploadedFile() {
        return uploadedFile;
    }

    public void setUploadedFile(UploadedFile uploadedFile) {
        this.uploadedFile = uploadedFile;
    }

    private String getUniqueName(String fileName) {
        return fileName + String.valueOf(System.currentTimeMillis());
    }

    public void upload(User user) throws IOException, InterruptedException {
        String fileAbsolutePath = getApplicationPath() + File.separator + ApplicationInitializer.getUploadFolder() + File.separator + getUniqueName(uploadedFile.getFileName());
        BufferedReadWriteStream bufferedReadWriteStream = new BufferedReadWriteStream();
        bufferedReadWriteStream.bufferedStream(fileAbsolutePath);


//        File file = new File(fileAbsolutePath);
//        FileWriter fileWriter = new FileWriter(fileAbsolutePath);
//        fileWriter.write(file.);
    }

    private String getApplicationPath() {
        ServletContext servletContext = (ServletContext) FacesContext.getCurrentInstance().getExternalContext().getContext();
        return servletContext.getRealPath("/");
    }
}
