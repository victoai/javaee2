<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>EL을 사용하여 ArrayList 반복 출력</title>
</head>
<body>
    <h1>ArrayList 반복 출력</h1>
    
    <!-- EL을 사용하여 Map에서 ArrayList를 가져옵니다. -->
    <c:set var="members" value="${myMap['memberList']}" />

    <!-- ArrayList를 반복하면서 Member 객체의 속성을 출력합니다. -->
    <c:forEach items="${members}" var="member">
          <p>아이디: ${member.id}</p>
          <p>비번: ${member.pw}</p>
    </c:forEach>
</body>
</html>
