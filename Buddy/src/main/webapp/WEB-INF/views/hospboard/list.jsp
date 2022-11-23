<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<style type="text/css">
table, th, td {
	border: 1px solid #ccc;
}


</style>
</head>
<body>

<h1>스프링 MVC  테스트</h1>
<h3>부서 정보 목록</h3>
<hr>


<table>
<tr>
	<th>부서번호</th>
	<th>부서명</th>
	<th>부서위치</th>
</tr>

<c:forEach items="${deptList }" var="dept">
<tr>
	<td>${dept.deptno }</td>
	<td>${dept.dname }</td>
	<td>${dept.loc }</td>
</tr>
</c:forEach>
</table>





</body>
</html>