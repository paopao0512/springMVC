<%--
  Created by IntelliJ IDEA.
  User: OneStar
  Date: 2018/5/3
  Time: 21:12
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="/tags" prefix="date" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath }/rest/${itemsList.id }" method="POST" >
    <table width="100%" border=1>
        <tr>
            <td>id</td>
            <td>名字</td>
            <td>QQ</td>
            <td>修真类型</td>
            <td>预计入学时间</td>
            <td>毕业学校</td>
            <td>学院学号</td>
            <td>日报连接</td>
            <td>愿望</td>
            <td>线上师兄</td>
            <td>从哪了解到</td>
            <td>操作</td>
        </tr>
        <%-- 调用modelAndView传过来的map,再找其中id为itemsList的--%>

        <%--<c:forEach items="${itemsList}" var="item">--%>
        <tr>
            <td>${itemsList.id }</td>
            <td><input type="text" name="name" style="width: 80px;" value="${itemsList.name }"></td>
            <td><input type="text" name="QQ" style="width: 100px;" value="${itemsList.QQ }"></td>
            <td><input type="text" name="iesson_type" style="width: 100px;" value="${itemsList.iesson_type }"></td>
            <td><input type="text" name="enroiment_time" value="<date:date value ="${itemsList.enroiment_time }"/>"></td>
            <td><input type="text" name="graduated_school" style="width: 120px;" value="${itemsList.graduated_school }"></td>
            <td><input type="text" name="student_ID" style="width: 65px;" value="${itemsList.student_ID }"></td>
            <td><input type="text" name="daily_conection" value="${itemsList.daily_conection }"></td>
            <td><input type="text" name="wish" value="${itemsList.wish }"></td>
            <td><input type="text" name="brother_name" style="width: 65px;" value="${itemsList.brother_name }"></td>
            <td><input type="text" name="channel" style="width: 80px;" value="${itemsList.channel }"></td>
            <td><input type="submit"></td>
        </tr>
        <%--</c:forEach>--%>

    </table>
</form>

</body>
</html>
