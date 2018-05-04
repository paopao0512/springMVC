<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>新增信息</title>
</head>
<body>
<form action="${pageContext.request.contextPath }/addStudent.action" method="post">
    <fieldset>
        <legend>新增学生</legend>
        <p>
            <label for="name">名字：</label>
            <input type="text" id="name" name="name" style="width: 70px;">
        </p>
        <p>
            <label for="QQ">QQ：</label>
            <input type="text" id="QQ" name="QQ" style="width: 100px;">
        </p>
        <p>
            <label for="iesson_type">修真类型：</label>
            <input type="text" id="iesson_type" name="iesson_type" style="width: 100px;" >
        </p>
        <p>
            <label for="enroiment_time">预计入学时间：</label>
            <input type="text" id="enroiment_time" name="enroiment_time" >
        </p>
        <p>
            <label for="graduated_school">毕业学校：</label>
            <input type="text" id="graduated_school" name="graduated_school" style="width: 120px;" >
        </p>
        <p>
            <label for="student_ID">线上学号：</label>
            <input type="text" id="student_ID" name="student_ID" style="width: 65px;" >
        </p>
        <p>
            <label for="daily_conection">日报连接：</label>
            <input type="text" id="daily_conection" name="daily_conection" >
        </p>
        <p>
            <label for="wish">立愿：</label>
            <input type="text" id="wish" name="wish" >
        </p>
        <p>
            <label for="brother_name">辅导师兄：</label>
            <input type="text" id="brother_name" name="brother_name" style="width: 65px;" >
        </p>
        <p>
            <label for="channel">从哪里知道：</label>
            <input type="text" id="channel" name="channel" style="width: 80px;" >
        </p>
        <input type="submit" value="提交">
    </fieldset>
</form>
</body>
</html>
