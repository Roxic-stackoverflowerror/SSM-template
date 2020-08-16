package com.roxic.domain;

public class Emploee {
    private Integer empno;
    private String ename;
    private String jobName;
    private Integer mgr;
    private String hireDate;
    private Float salary;
    private Float comm;
    private Integer deptno;

    public Emploee() {
    }

    public Emploee(Integer empno, String ename, String jobName, Integer mgr, String hireDate, Float salary, Float comm, Integer deptno) {
        this.empno = empno;
        this.ename = ename;
        this.jobName = jobName;
        this.mgr = mgr;
        this.hireDate = hireDate;
        this.salary = salary;
        this.comm = comm;
        this.deptno = deptno;
    }

    public Integer getEmpno() {
        return empno;
    }

    public void setEmpno(Integer empno) {
        this.empno = empno;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public Integer getMgr() {
        return mgr;
    }

    public void setMgr(Integer mgr) {
        this.mgr = mgr;
    }

    public String getHireDate() {
        return hireDate;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }

    public Float getSalary() {
        return salary;
    }

    public void setSalary(Float salary) {
        this.salary = salary;
    }

    public Float getComm() {
        return comm;
    }

    public void setComm(Float comm) {
        this.comm = comm;
    }

    public Integer getDeptno() {
        return deptno;
    }

    public void setDeptno(Integer deptno) {
        this.deptno = deptno;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "empno=" + empno +
                ", ename='" + ename + '\'' +
                ", jobName='" + jobName + '\'' +
                ", mgr=" + mgr +
                ", hireDate='" + hireDate + '\'' +
                ", salary=" + salary +
                ", comm=" + comm +
                ", deptno=" + deptno +
                '}';
    }
}
