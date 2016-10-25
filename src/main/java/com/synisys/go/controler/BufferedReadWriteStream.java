package com.synisys.go.controler;

import org.primefaces.model.UploadedFile;

import java.io.*;

/**
 * Created by zaven.chilingaryan on 10/24/2016.
 */
public class BufferedReadWriteStream {
    FileUploader fileUploader = new FileUploader();

    public void bufferedStream(String fileAbsolutePath )  {
        InputStream inputStream = null;
        try {
            inputStream = fileUploader.getUploadedFile().getInputstream();

        OutputStream outputStream = new FileOutputStream(fileAbsolutePath);
        BufferedInputStream bufferedIn = new BufferedInputStream(inputStream);
        BufferedOutputStream bufferedOut = new BufferedOutputStream(outputStream);

        byte [] buffer = new byte[1024];

        while (bufferedIn.read(buffer) != 0){
            bufferedOut.write(buffer);
        }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



}
