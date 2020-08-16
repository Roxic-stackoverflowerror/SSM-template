package com.roxic.controller;

import com.roxic.domain.Emploee;
import com.roxic.service.EmploeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Controller
public class EmploeeController {
    @Autowired
    private EmploeeService emploeeService;
    //添加雇员
    @RequestMapping("/addEmploee")
    public ModelAndView addStudent(Emploee emploee){
        ModelAndView mv = new ModelAndView();
        String message = "添加失败";
        int res = emploeeService.addEmploee(emploee);
        if (res > 0) {
            message = "员工：" + emploee.getEname() + "，添加信息成功";
        }
        mv.addObject("message",message);
        mv.setViewName("result");
        return mv;
    }

    //处理查询，响应ajax
    @RequestMapping("/queryEmploee")
    @ResponseBody
    public List<Emploee> queryEmploee(){
        List<Emploee> emploees = emploeeService.queryEmploees();
        return emploees;
    }

    @RequestMapping("/deleteEmploee")
    public ModelAndView deleteEmploee(Integer empno){
        ModelAndView mv = new ModelAndView();
        emploeeService.deleteEmploee(empno);
        mv.setViewName("forward:/listEmploee.jsp");
        return mv;
    }
}

