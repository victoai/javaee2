<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>EL을 사용하여 Set 값 반복 출력</title>
</head>
<body>
    <h1>Set 값 반복 출력</h1>
    
    <!-- Set을 직접 사용하여 값을 출력합니다. -->
    <c:forEach items="${mySet}" var="element">
        <p>${element}</p>
    </c:forEach>
</body>
</html>

