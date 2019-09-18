package com.hdy.hwspringboot01.entity;

/**
 * @author m760384371
 * @date 2019/9/18
 */
public class Result {

    public int code;

    public Result() {
    }

    public Result(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "Result{" +
                "code=" + code +
                '}';
    }
}
