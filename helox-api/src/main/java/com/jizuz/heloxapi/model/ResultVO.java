package com.jizuz.heloxapi.model;

/**
 * 返回值
 *
 * @param <T>
 */
public class ResultVO<T> {

    private T t;

    private int code = 0;

    private String msg;

    private boolean isSuccess = true;

    public ResultVO() {
    }

    public ResultVO(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public ResultVO(T t, int code, String msg) {
        this.t = t;
        this.code = code;
        this.msg = msg;
    }

    public ResultVO(T t, int code, String msg, boolean isSuccess) {
        this.t = t;
        this.code = code;
        this.msg = msg;
        this.isSuccess = isSuccess;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public boolean isSuccess() {
        return isSuccess;
    }

    public void setSuccess(boolean success) {
        isSuccess = success;
    }
}
