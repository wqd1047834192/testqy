package aaa.springbootdemo02.dao;

import aaa.springbootdemo02.entity.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


import java.util.List;
@Repository
@Mapper
public interface DeptDao {
    List<Dept> listAll();
    void save(Dept dept);
    Dept findByDeptno(Long deptno);
}
