package com.story.retrofit.core;

/**
 * 监听进度
 */

public interface ProgressListener {

    /**
     * 监听进度更新
     * @param percent 0-100
     */
    void hearProgress(int percent);
}
