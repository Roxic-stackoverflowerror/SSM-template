package com.roxic.service;

import com.roxic.domain.Emploee;

import java.util.List;

public interface EmploeeService {
    List<Emploee> queryEmploees();
    Integer addEmploee(Emploee emploee);
    Integer deleteEmploee(Integer empno);
}
