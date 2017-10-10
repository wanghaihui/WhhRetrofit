package com.story.retrofit.io;

import com.story.retrofit.core.internal.Objects;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;

/**
 * 文件和其Mime Type
 */
public class TypedFile extends AbstractTypedBytes {
    private static final long serialVersionUID = 0;

    private final File file;

    /**
     * 构造一个新的TypedFile
     * @param file
     * @param mimeType
     * @throws NullPointerException if file or mimeType is null
     */
    public TypedFile(File file, MimeType mimeType) {
        super(mimeType, (int) file.length());
        this.file = Objects.nonNull(file, "file");
    }

    public File file() {
        return file;
    }

    public void writeTo(OutputStream out) throws IOException {
        Files.copy(file, out);
    }

    /**
     * 自动移动这个文件中的内容到新的位置
     * @param destination file
     * @throws IOException if the move fails
     */
    public void moveTo(TypedFile destination) throws IOException {
        if (mimeType() != destination.mimeType()) {
            throw new IOException("Type mismatch");
        }
        if (!file.renameTo(destination.file())) {
            throw new IOException("Rename failed");
        }
    }

    @Override
    public String toString() {
        return file.getAbsolutePath() + " (" + mimeType() + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o instanceof TypedFile) {
            TypedFile rhs = (TypedFile) o;
            return file.equals(rhs.file);
        }

        return false;
    }

    @Override
    public int hashCode() {
        return file.hashCode();
    }
}
