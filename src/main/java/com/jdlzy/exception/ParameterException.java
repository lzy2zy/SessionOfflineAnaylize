package com.jdlzy.exception;

/**
 * json参数异常
 * <p>
 * Created by liuziyang on 2017/9/11.
 * Copyright © liuziyang ustl. All Rights Reserved
 */
public class ParameterException extends Exception {
    /**
     * Constructs an ParameterException with nothing.
     */
    public ParameterException() {
        super();
    }

    /**
     * Constructs an ParameterException with the specified detail message.
     *
     * @param message
     */
    public ParameterException(String message) {
        super(message);
    }

    /**
     * Constructs an ParameterException with the specified detail message and cause.
     *
     * @param message
     * @param cause
     */
    public ParameterException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * Constructs an ParameterException with the specified cause
     *
     * @param cause
     */
    public ParameterException(Throwable cause) {
        super(cause);
    }
}
