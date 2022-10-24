<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Saludo por formulario</title>
</head>
<body>

    <form action="<%=request.getContextPath()%>/actividad02" method="POST">
        <input type="text" name="nombre" placeholder="Introduce tu nombre" value="">
        <input type="submit" name="boton" value="Enviar">
    </form>
</body>
</html>
