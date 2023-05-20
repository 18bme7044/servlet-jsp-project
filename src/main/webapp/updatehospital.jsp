<%@page import="servlet.jsp.dto.Hospital"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%Hospital hsp=(Hospital)request.getAttribute("edit"); %>
	
<form action="update1" method="post">
id:<input type="text" name="id" value="<%=hsp.getId()%>" readonly="readonly"><br><br>
name:<input type="text" name="name" value="<%=hsp.getName()%>"><br><br>
web:<input type="text" name="website" value="<%=hsp.getWebsite()%>"><br><br>
number:<input type="text" name="number" value="<%=hsp.getContact_no()%>"><br><br>
<button>submit</button>

</form>
</body>
</html>