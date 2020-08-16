package com.roxic.service.impl;

import com.roxic.dao.EmploeeDao;
import com.roxic.domain.Emploee;
import com.roxic.service.EmploeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "emploeeService")
public class EmploeeServiceImpl implements EmploeeService {

    @Autowired
    private EmploeeDao emploeeDao;

    public EmploeeServiceImpl(EmploeeDao emploeeDao) {
        this.emploeeDao = emploeeDao;
    }

    @Override
    public List<Emploee> queryEmploees() {
        return emploeeDao.selectEmploees();
    }

    @Override
    public Integer addEmploee(Emploee emploee) {
        int res = emploeeDao.insertEmploees(emploee);
        return res;
    }

    @Override
    public Integer deleteEmploee(Integer empno) {
        int res = emploeeDao.deleteEmploees(empno);
        return res;
    }
}
