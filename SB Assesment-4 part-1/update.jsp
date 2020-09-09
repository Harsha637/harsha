<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
<title>Update</title>
</head>
<body>
<table border="1">
<tr>
<td>
<h1>
 Updating Team Registration  
</h1>
<form action="searchForUpdate">
Team Id:<input type="text" name="teamId" value="${team.teamId}">
<input type="submit" value="search">
</form>

<form action="searchForUpdateName">
Team Id:<input type="text" name="teamName" value="${team.teamName}">
<input type="submit" value="search">
</form>


<form action="updateData">
Name:<input type="text" name="teamName" value="${team.teamName}">
<br>
<br>City: <input type="text" name="city" value="${team.city}">
<br>
Player Name:<input type="text" name="pname" value="${team.pname}">
<br>
<input type="submit" value="update Team">
</form>
</td>
</tr>
</table>
</body>
</html>