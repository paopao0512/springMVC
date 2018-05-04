<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>查询个人信息</title>
</head>
<%@ taglib uri="/tags" prefix="date" %>
<body>
<form action="${pageContext.request.contextPath }/queryName.action"
      method="post">
    查询：
    <table width="100%" border=1>
        <tr>
            <td>根据名字查询: <input name="name"/></td>
            <%--<td>根据ID查询：<input name="id"></td>>--%>
            <td><input type="submit" value="查询"/></td>
        </tr>
    </table>
    学员：
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
                <td>${itemsList.name }</td>
                <td>${itemsList.QQ}</td>
                <td>${itemsList.iesson_type }</td>
                <td><date:date value ="${itemsList.enroiment_time}"/></td>
                <td>${itemsList.graduated_school }</td>
                <td>${itemsList.student_ID }</td>
                <td>${itemsList.daily_conection }</td>
                <td>${itemsList.wish }</td>
                <td>${itemsList.brother_name }</td>
                <td>${itemsList.channel}</td>
                <td><a href="${pageContext.request.contextPath } /editItem.action?id=${itemsList.id}">修改</a></td>

            </tr>
        <%--</c:forEach>--%>

    </table>
</form>
</body>

</html>