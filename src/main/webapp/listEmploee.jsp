<%--
  Created by IntelliJ IDEA.
  User: rmf
  Date: 2020/8/13/0013
  Time: 18:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String basePath = request.getScheme() + "://" +
            request.getServerName() + ":" + request.getServerPort() +
            request.getContextPath() + "/";
%>
<html>
<head>
    <title>查看员工表</title>
    <base href="<%=basePath%>"/>
    <script type="text/javascript" src="js\jquery-3.5.1.js"></script>
    <script type="text/javascript">
        $(function () {
                $.ajax({
                    url:"queryEmploee",
                    type:"get",
                    dataType:"json",
                    success:function (data) {
                        $("#info").html("");
                        $.each(data,function (i,n) {
                            $("#info")
                                .append("<tr>")
                                .append("<td>"+n.empno+"</td>")
                                .append("<td>"+n.ename+"</td>")
                                .append("<td>"+n.jobName+"</td>")
                                .append("<td>"+n.mgr+"</td>")
                                .append("<td>"+n.hireDate+"</td>")
                                .append("<td>"+n.salary+"</td>")
                                .append("<td>"+n.comm+"</td>")
                                .append("<td>"+n.deptno+"</td>")
                                .append("<td><a href='deleteEmploee?empno="+n.empno+"'>删除</a></td>")
                                .append("</tr>")
                        })
                    }
                })
            })
    </script>
</head>
<body>
    <div align="center">
        <table border="1px">
            <thead>
                <tr>
                    <td>员工编号</td>
                    <td>员工姓名</td>
                    <td>员工职位</td>
                    <td>员工上司编号</td>
                    <td>员工入职时间</td>
                    <td>员工月薪</td>
                    <td>员工补贴</td>
                    <td>员工部门编号</td>
                </tr>
            </thead>
            <tbody id="info">

            </tbody>
        </table>
    </div>
</body>
</html>
