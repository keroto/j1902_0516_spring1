package com.qf.j1902.service;

import com.qf.j1902.bean.Dept;
import com.qf.j1902.service.impl.DeptServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2019/5/16.
 */
public class TestDeptService {
    @Test
    public void tsst(){
        DeptService deptService=new DeptServiceImpl();
        Dept deptById = deptService.getDeptById(10);
        System.out.println(deptById);
    }
    @Test
    public void testSpring(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");
        DeptService deptService = (DeptService) ac.getBean("deptService");
        Dept deptById = deptService.getDeptById(10);

        System.out.println(deptById);
    }
    @Test
    public void testKuangjia(){
        DeptService deptService=new DeptServiceImpl();
        Dept deptById = deptService.getDeptById(10);
        System.out.println(deptById);
    }
}
