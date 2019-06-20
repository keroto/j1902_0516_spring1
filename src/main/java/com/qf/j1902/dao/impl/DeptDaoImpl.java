package com.qf.j1902.dao.impl;

import com.qf.j1902.bean.Dept;
import com.qf.j1902.dao.DeptDao;

/**
 * Created by Administrator on 2019/5/16.
 */
public class DeptDaoImpl implements DeptDao{

    @Override
    public Dept getDeptById(int id) {
        Dept dept = new Dept(10,"uu","xi'an");
        return dept;
    }
}
