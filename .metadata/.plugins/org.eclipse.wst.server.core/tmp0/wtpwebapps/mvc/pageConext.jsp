<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

<h2> pageContext ����� !!!</h2>

<% pageContext.setAttribute("str", "hello pageConext!!!"); %>
<% String str = (String) pageContext.getAttribute("str"); %>
<%= str%>
${str}


<h2>jsp������ ���Ǵ� ���尴ü</h2>
<p>
  �ٸ��ż��忡�� ���尴ü�� ����Ϸ��� pageConext��ü�� ����ؾ��� !!!
  ��ũ��Ʈ���� ǥ�������� �ۼ��Ѱ��� ���  _jspService�ż��忡�� �ڵ尡 ��������� 
  �� �ż���ȿ����� ���尴ü�� ����� �� �ִ�.
  jsp���� Ư¡
</p>
<%  pageContext.getRequest().getServletContext().getContextPath(); %>


</body>
</html>