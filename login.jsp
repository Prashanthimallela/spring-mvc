
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1>Login Page!</h1>
    	<form action="home" method="post">
	    	<input type = "text" name = "userName" placeholder = "Enter username"/><br><br>
	    	<input type = "password" name = "password" placeholder = "Enter Password"/><br><br>
	    	<input type = "submit" value = "LogIn"/><br><br>
   	    </form>
   	    <div style="color:red">${error}</div>

</body>
</html>