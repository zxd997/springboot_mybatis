package com.example.demo.entity;

public class Student {
    private Integer sid;

    private String sname;

    private String sage;

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname == null ? null : sname.trim();
    }

    public String getSage() {
        return sage;
    }

    public void setSage(String sage) {
        this.sage = sage == null ? null : sage.trim();
    }
}