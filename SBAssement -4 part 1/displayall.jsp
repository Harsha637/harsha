<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
<title>Home</title>
<style type="text/css">
.button1 {
  background-color: #f0e000;
  border: none;
  color: black;
  padding: 15px 32px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 16px;
  margin: 4px 2px;
  cursor: pointer;
}
</style>
</head>
<body>
<br>
<br>
<br>
<center>
<table border="2" cellpadding="15">
<h1>Displaying all </h1> 
<c:forEach items="${status4}" var="status4">
<tr>
<td>${status4.playerId}</td>
<td>${status4.playerName}</td>
<td>${status4.playerteam}</td>
</tr>
</c:forEach>
</table>
<form action="home">
<input type="submit" value="Main menu" class="button1">
</form>
</center>


</body>
</html>