<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>图书展示</title>
</head>
<link rel=stylesheet type="text/css" href="${pageContext.request.contextPath}/styles/index.css">
<body>
<table>
  <tr>
    <th colspan="3"><form action="getList.do" method="post">搜索：<input type="text" name="tname" value="${tname}"><input type="submit"></form></th>
  </tr>
  <tr>
    <th></th>
    <th>图书编号</th>
    <th>图书名称</th>
  </tr>
  <c:forEach items="${list}" var="ll">
    <tr>
      <th><input type="radio" name="check" value="${ll.tid}"></th>
      <th>${ll.tid}</th>
      <th>${ll.tname}</th>
    </tr>
  </c:forEach>
  <tr><th colspan="3">${page}</th></tr>
</table>
</body>
</html>
