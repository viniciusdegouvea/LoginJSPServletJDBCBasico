
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
</head>
<body>

	<form action="LoginServlet" method="post">

		Login: <input type="text" id="login" name="login"> <br />
		Senha: <input type="text" id="senha" name="senha"> <br /> <input
			type="submit" value="Testar" />

	</form>



</body>
</html>