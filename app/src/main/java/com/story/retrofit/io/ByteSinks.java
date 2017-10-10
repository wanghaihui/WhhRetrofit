package com.story.retrofit.io;


import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * 工具方法来处理字节输出
 */
public class ByteSinks {
    /**
     * 创建一个sink来写文件
     */
    public static ByteSink.Factory forFile(final File file) {
        return new ByteSink.Factory() {
            @Override
            public ByteSink newSink() throws IOException {
                final OutputStream out = new FileOutputStream(file);
                return new ByteSink() {
                    @Override
                    public void write(byte[] buffer, int count) throws IOException {
                        out.write(buffer, 0, count);
                    }

                    @Override
                    public void close() throws IOException {
                        out.close();
                    }
                };
            }
        };
    }
}
