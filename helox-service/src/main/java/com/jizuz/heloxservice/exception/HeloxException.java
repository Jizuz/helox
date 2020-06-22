package com.jizuz.heloxservice.exception;

public class HeloxException extends RuntimeException {

    private static final long serialVersionUID = -6491978066762418486L;

    private int code;

    private String msg;

    public HeloxException(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public HeloxException(String message, int code) {
        super(message);
        this.code = code;
    }

    public HeloxException(String message, Throwable cause, int code) {
        super(message, cause);
        this.code = code;
    }

    public HeloxException(Throwable cause, int code, String msg) {
        super(cause);
        this.code = code;
        this.msg = msg;
    }
}
