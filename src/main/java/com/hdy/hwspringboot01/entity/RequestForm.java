package com.hdy.hwspringboot01.entity;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author m760384371
 * @date 2019/9/18
 */
public class RequestForm {

    public Map<String, String> form = new LinkedHashMap<>();

    public RequestForm() {
    }

    public RequestForm(Map<String, String> form) {
        this.form = form;
    }

    public Map<String, String> getForm() {
        return form;
    }

    public void setForm(Map<String, String> form) {
        this.form = form;
    }

    @Override
    public String toString() {
        return "RequestForm{" +
                "form=" + form +
                '}';
    }
}
