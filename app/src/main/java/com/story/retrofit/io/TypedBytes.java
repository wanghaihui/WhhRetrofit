package com.story.retrofit.io;

import java.io.IOException;
import java.io.OutputStream;

/**
 * 类型的字节
 * 二进制数据--与mime type相关联的
 */
public interface TypedBytes {
    /**
     * 返回的mime type
     */
    MimeType mimeType();

    /**
     * 字节长度
     */
    int length();

    /**
     * 将这些字节写到给定的OutputStream中
     */
    void writeTo(OutputStream out) throws IOException;
}
