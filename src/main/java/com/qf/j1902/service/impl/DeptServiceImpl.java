package com.qf.j1902.service.impl;

import com.qf.j1902.bean.Dept;
import com.qf.j1902.dao.DeptDao;
import com.qf.j1902.dao.KuangJia;
import com.qf.j1902.service.DeptService;

/**
 * Created by Administrator on 2019/5/16.
 */
public class DeptServiceImpl implements DeptService{
    private DeptDao deptDao;

    public void setDeptDao(DeptDao deptDao) {
        this.deptDao = deptDao;
    }

    @Override

    public Dept getDeptById(int id) {
        KuangJia kuangJia=new KuangJia();
        DeptDao deptDao = kuangJia.getDeptDao();
        return deptDao.getDeptById(id);
    }

    /*public void setDeptDao(String deptDao) {
        this.deptDao = deptDao;
    }*/

    public DeptDao getDeptDao() {
        return deptDao;
    }
}
