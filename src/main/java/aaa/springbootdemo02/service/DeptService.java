package aaa.springbootdemo02.service;

import aaa.springbootdemo02.entity.Dept;

import java.util.List;

public interface DeptService {
    List<Dept> listAll();

    void save(Dept dept);

    Dept findByDeptno(Long deptno);
}
