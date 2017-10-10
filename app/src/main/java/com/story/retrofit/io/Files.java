package com.story.retrofit.io;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * 文件工具类
 */
public class Files {
    /**
     * 拷贝文件到指定的输出流
     */
    public static void copy(File file, OutputStream out) throws IOException {
        byte[] buffer = new byte[4096];
        // 先把文件读入文件输入流
        FileInputStream in = new FileInputStream(file);
        try {
            int read;
            while ((read = in.read(buffer)) >= 0) {
                out.write(buffer, 0, read);
            }
        } finally {
            in.close();
        }
    }

    /**
     * 将输入流拷贝到指定的文件，当完成的时候关闭输入流
     */
    public static void copy(InputStream in, File file) throws IOException {
        byte[] buffer = new byte[4096];
        try {
            // 先把文件读入文件输出流
            FileOutputStream out = new FileOutputStream(file);
            try {
                int read;
                while ((read = in.read(buffer)) > -1) {
                    out.write(buffer, 0, read);
                }
            } finally {
                out.close();
            }
        } finally {
            in.close();
        }
    }
}
