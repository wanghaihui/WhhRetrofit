package com.story.retrofit.io;

/**
 * Http请求返回的时候，告诉浏览器返回的数据是什么类型--Mime类型定义在Content-Type中
 */
public enum MimeType {
    GIF("image/gif", "gif"),
    PNG("image/png", "png"),
    JPEG("image/jpeg", "jpg");

    private final String typeName;
    private final String extension;

    MimeType(String typeName, String extension) {
        this.typeName = typeName;
        this.extension = extension;
    }

    /**
     * 返回标准的type name
     */
    public String mimeName() {
        return typeName;
    }

    /**
     * 返回标准的文件扩展名
     */
    public String extension() {
        return extension;
    }
}
