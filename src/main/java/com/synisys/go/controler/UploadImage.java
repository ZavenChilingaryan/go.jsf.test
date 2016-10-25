package com.synisys.go.controler;

import com.synisys.go.dom.User;
import com.synisys.go.system.ApplicationInitializer;
import org.primefaces.model.UploadedFile;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.ServletContext;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;


@ManagedBean
@SessionScoped
public class UploadImage {


    private UploadedFile uploadedFile;


    public UploadedFile getUploadedFile() {
        return uploadedFile;
    }

    public void setUploadedFile(UploadedFile uploadedFile) {
        this.uploadedFile = uploadedFile;
    }

    public void saveImage(User user) throws IOException {



        File file = new File(getAppPath() + ApplicationInitializer.getUsersImagesFolder() + getUniqName());
        if(!file.getParentFile().exists()){
            file.getParentFile().mkdir();
        }

        FileOutputStream fileOutputStream = new FileOutputStream(file);
        fileOutputStream.write(uploadedFile.getContents());
        user.setImages(file.getName());


    }

    private String getUniqName(){

    return File.separator + System.currentTimeMillis() + getFileFormat();
    }


    private String getAppPath(){
     return ((ServletContext) FacesContext.getCurrentInstance().getExternalContext().getContext()).getRealPath("/");
    }

    public String getImageFilePath(User user){

        System.out.println( ApplicationInitializer.getUsersImagesFolder() + File.separator + user.getImages().get(0));
       return  ApplicationInitializer.getUsersImagesFolder() + File.separator + user.getImages().get(0);

    }


    private String getFileFormat(){
       return  "." + uploadedFile.getContentType().substring(uploadedFile.getContentType().lastIndexOf("/") + 1);
    }
}
