package com.synisys.go.controler;

import java.io.*;

/**
 * Created by zaven.chilingaryan on 10/24/2016.
 */
public class BufferedReadWriteStream {

    private final InputStream inputStream;
    private final String fileOutputPath;

    public BufferedReadWriteStream(InputStream inputStream, String fileOutputPath) {
        this.inputStream = inputStream;
        this.fileOutputPath = fileOutputPath;
    }

    void bufferedStream() {
        try (OutputStream outputStream = new FileOutputStream(fileOutputPath);
             BufferedInputStream bufferedIn = new BufferedInputStream(inputStream);
             BufferedOutputStream bufferedOut = new BufferedOutputStream(outputStream)) {
            byte[] buffer = new byte[1024];
            while (bufferedIn.read(buffer) > 0) {
                bufferedOut.write(buffer);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
