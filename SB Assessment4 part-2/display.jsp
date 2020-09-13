<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
body {
    background-image: url("c.jpg");
    background-repeat: no-repeat;
 background-size: cover;
opacity: 0.6;
}
</style>
</head>
<body>
<center>
<h1> Details Registered Successfully</h1>

<p>${status}</p>
<form action="displayLogin" method="get">
	<input type="submit" value="LoginPage">
</form>
</center>
</body>
</html>