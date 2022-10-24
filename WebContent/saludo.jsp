<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Saludo</title>
</head>
<body>
	<%
		String nombre;
		try {
			nombre = (String) request.getAttribute("nombre_attr");
		} catch (Exception e) {
			nombre = null;
		}

		if (nombre != null) {
			out.print("<h1>Hola "+request.getAttribute("nombre_attr")+"</h1>");
		}else{
			out.print("<a href=\"./formulario_web.jsp\">Debes usar el formulario_web</a>");
		}
	%>
</body>
</html>