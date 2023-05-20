<%@page import="servlet.jsp.dto.Hospital"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%List<Hospital> list=(List<Hospital>)request.getAttribute("addlist"); %>
	<table border="2px">
	<tr>
	<th>ID</th>
	<th>NAME</th>
	<th>PH.NO</th>
	<th>CONTACT</th>
	<th>EDIT</th>
	<th>DELETE</th>
	</tr>
	<%for(Hospital hsp:list){ %>
	<tr>
	<td><%=hsp.getId()%></td>
	<td><%=hsp.getName()%></td>
	<td><%=hsp.getContact_no()%></td>
	<td><%=hsp.getWebsite()%></td>
	<td><button><a href="update?id=<%=hsp.getId()%>">Edit</a></button></td>
	<td><button><a href="delete?id=<%=hsp.getId()%>">Delete</a></button></td>
	</tr>
	<%} %>
	
	</table>
	
</body>
</html>