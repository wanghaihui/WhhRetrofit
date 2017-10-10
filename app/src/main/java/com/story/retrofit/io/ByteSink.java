package com.story.retrofit.io;


import java.io.IOException;

/**
 * 字节下沉--一个接口等同于OutputStream--输出流
 */
public interface ByteSink {

    /**
     * 将指定数量的字节数写入Buffer
     * @param buffer
     * @param count
     * @throws IOException
     */
    void write(byte[] buffer,int count) throws IOException;

    /**
     * 关闭这个流
     * @throws IOException
     */
    void close() throws IOException;

    /**
     * 构造一个新的流
     */
    public interface Factory {
        // 构造一个新的Sink
        ByteSink newSink() throws IOException;
    }
}
