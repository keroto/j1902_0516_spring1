package com.qf.j1902.dao;

import com.qf.j1902.dao.impl.DeptDaoImpl;

/**
 * Created by Administrator on 2019/5/16.
 */
public class KuangJia {
    public DeptDao getDeptDao(){
        DeptDao deptDao = new DeptDaoImpl();
        return deptDao;
    }
}
