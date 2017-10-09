package com.story.retrofit.core.internal;

/**
 * Object工具方法
 */
public class Objects {

    /**
     * 判断t是否为空的工具方法
     * 返回t，除非t为null
     * @throws NullPointerException if t is null
     */
    public static <T> T nonNull(T t, String name) {
        if (t == null) {
            throw new NullPointerException(name);
        }
        return t;
    }

    /**
     * 如果两个对象相等，返回true
     */
    public static <T> boolean equal(T a, T b) {
        return a == b || a != null && a.equals(b);
    }
}
