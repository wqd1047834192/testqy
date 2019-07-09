package aaa.springbootdemo02.service.impl;

import aaa.springbootdemo02.dao.DeptDao;
import aaa.springbootdemo02.entity.Dept;
import aaa.springbootdemo02.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class DeptServiceImpl implements DeptService {
    @Autowired
    private DeptDao deptDao;
    @Override
    public List<Dept> listAll() {
        return deptDao.listAll();
    }

    @Override
    public void save(Dept dept) {
        deptDao.save(dept);
    }

    @Override
    public Dept findByDeptno(Long deptno) {

        return deptDao.findByDeptno(deptno) ;
    }
}
