package com.qf.j1902.bean;

/**
 * Created by Administrator on 2019/5/16.
 */
public class Dept {
    private int deptno;
    private String dname;
    private String ioc;

    public Dept() {
    }

    public Dept(int deptno, String dname, String ioc) {
        this.deptno = deptno;
        this.dname = dname;
        this.ioc = ioc;
    }

    public int getDeptno() {
        return deptno;
    }

    public void setDeptno(int deptno) {
        this.deptno = deptno;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getIoc() {
        return ioc;
    }

    public void setIoc(String ioc) {
        this.ioc = ioc;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "deptno=" + deptno +
                ", dname='" + dname + '\'' +
                ", ioc='" + ioc + '\'' +
                '}';
    }
}
