package aaa.springbootdemo02.controller;

import aaa.springbootdemo02.entity.Dept;
import aaa.springbootdemo02.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class DeptController {
    @Autowired
    private DeptService deptService;
    @RequestMapping("list")
    public String listAll(Model model){
        List<Dept> depts = deptService.listAll();
        model.addAttribute("depts",depts);
        return"list";
    }
    @RequestMapping("toSave")
    public String toSava(){
        return"save";
    }
    @RequestMapping("save")
    public String save(Dept dept){
        deptService.save(dept);
        return "redirect:list";
    }
    @RequestMapping("toEdit")
    public String toEdit(Long deptno,Model model){
        Dept byDeptno = deptService.findByDeptno(deptno);
        model.addAttribute("byDeptno",byDeptno);
        return "edit";

    }

}
