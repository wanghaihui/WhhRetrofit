package com.story.retrofit.core;

/**
 * 回调
 * @param <T> 期望的response类型
 */
public interface CallBack<T> {

    /**
     * 处理response
     * @param t response
     */
    void call(T t);

    /**
     * 会话已经超时或者账号已经不可用--提示用户重新登录
     */
    void sessionExpired();

    /**
     * 不能访问服务器，检查网络设置并且重试
     */
    void networkError();

    /**
     * 服务端返给客户端错误，在大多数情况下，这是一个编程错误，也可能是一个用户输入错误
     * @param message 显示给用户的信息，如果没有信息则是null
     */
    void clientError(String message);

    /**
     * 我们到达了服务器，但是遇到了一个错误，请稍后重试
     * @param message 显示给用户的信息，如果没有信息则是null
     */
    void serverError(String message);

    /**
     * 一个未知的错误出现
     * 如果framework抛出一个未知的异常或者服务器返回400的错误(Bad Request)，这个方法将会被调用
     * 另一种情况是，如果是客户端存在bug，则客户端应该尽快更新
     * @param t 抛出的异常
     */
    void unexpectedError(Throwable t);
}
