package com.expertsoft.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "counter", eager = true)
@RequestScoped
public class VowelCounterBean {
    private String target;
    private int res;

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public int getRes() {
        return res;
    }

    public void setRes(int res) {
        this.res = res;
    }

    public String count() {
        for (Character c : target.toCharArray()) {
            if (String.valueOf(c).matches("[aeiou]")) {
                res++;
            }
        }
        return "result";
    }
}
