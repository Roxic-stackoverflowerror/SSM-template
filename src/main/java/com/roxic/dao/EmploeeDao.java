package com.roxic.dao;

import com.roxic.domain.Emploee;

import java.util.List;

//接口操作emp表
public interface EmploeeDao {
    // 查询emp表所有的数据
    public List<Emploee> selectEmploees();
    // 向emp表中插入一行数据
    public int insertEmploees(Emploee emp);
    // 删除emp的一行数据
    public int deleteEmploees(Integer empno);
}
