package com.story.retrofit.io;

import com.story.retrofit.core.internal.Objects;

import java.io.Serializable;

/**
 * 支持类型的值
 * Serializable--序列化
 */
public abstract class AbstractTypedBytes implements TypedBytes, Serializable {
    private static final long serialVersionUID = 0;

    private final MimeType mimeType;
    private final int length;

    public AbstractTypedBytes(MimeType mimeType, int length) {
        this.mimeType = Objects.nonNull(mimeType, "mimeType");
        this.length = length;
    }

    public MimeType mimeType() {
        return mimeType;
    }

    public int length() {
        return length;
    }
}
