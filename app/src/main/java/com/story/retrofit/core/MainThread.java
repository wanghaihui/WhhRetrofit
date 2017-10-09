package com.story.retrofit.core;

import java.util.concurrent.Executor;

/**
 * 表示UI线程
 * UI线程在屏幕上绘制图像并且执行activity回调
 */
public interface MainThread extends Executor {
    /**
     * 执行这个Runnable在一段时间之后
     * @param r 执行的Runnable
     * @param delay ms(毫秒)
     */
    void executeDelayed(Runnable r, long delay);

    /**
     * 移除在消息队列中的Runnable
     * @param r 移除的Runnable
     */
    void cancel(Runnable r);
}
