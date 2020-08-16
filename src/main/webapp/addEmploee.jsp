<%--
  Created by IntelliJ IDEA.
  User: rmf
  Date: 2020/8/13/0013
  Time: 18:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加员工信息</title>
</head>
<body>
    <div align="center">
        <form action="addEmploee" method="post">
            <table>
                <tr>
                    <td>员工编号：</td>
                    <td><input type="text" name="empno"></td>
                </tr>
                <tr>
                    <td>员工姓名：</td>
                    <td><input type="text" name="ename"></td>
                </tr>
                <tr>
                    <td>员工职位：</td>
                    <td><input type="text" name="jobName"></td>
                </tr>
                <tr>
                    <td>员工上司编号：</td>
                    <td><input type="text" name="mgr"></td>
                </tr>
                <tr>
                    <td>员工入职日期：</td>
                    <td><input type="text" name="hireDate"></td>
                </tr>
                <tr>
                    <td>员工月薪：</td>
                    <td><input type="text" name="salary"></td>
                </tr>
                <tr>
                    <td>员工补贴：</td>
                    <td><input type="text" name="comm"></td>
                </tr>
                <tr>
                    <td>员工部门编号：</td>
                    <td><input type="text" name="deptno"></td>
                </tr>
                <tr>
                    <td colspan="2" align="center"><input type="submit" value="            添加            "></td>
                </tr>
            </table>
        </form>
    </div>
</body>
</html>
