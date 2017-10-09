package com.story.retrofit.io;

import com.story.retrofit.core.internal.Objects;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;

/**
 * 字节数组和Mime Type
 */
public class TypedByteArray extends AbstractTypedBytes {
    private static final long serialVersionUID = 0;

    private final byte[] bytes;

    /**
     * 构造一个新的typed byte array
     * @throws NullPointerException 如果bytes和mimeType是null
     */
    public TypedByteArray(byte[] bytes, MimeType mimeType) {
        super(mimeType, bytes.length);
        this.bytes = Objects.nonNull(bytes, "bytes");
    }

    public void writeTo(OutputStream out) throws IOException {
        out.write(bytes);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o instanceof TypedByteArray) {
            TypedByteArray rhs = (TypedByteArray) o;
            return Arrays.equals(bytes, rhs.bytes);
        }

        return false;
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(bytes);
    }
}
