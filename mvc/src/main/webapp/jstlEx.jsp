<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

<c:set var="su" value="33444"/>
	<fmt:formatNumber  value="${su}"/> 	
	<h2> �迭���� ����ϱ�</h2>	
	 
	<c:set var="msg">apple, banana, orange, kiwi</c:set>
	<c:forEach var="item" items="${msg}">
	<c:out value="${item}"></c:out> 
</c:forEach>


<%
String[] message ={};
request.setAttribute("message", message);
%>
</body>
</html>