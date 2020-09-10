<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
<title>deleting</title>
<style>
body {
  background-color: #34eb8f;
}
h1
{
color: blue;
}
table
{
background-color: grey;
}
.button {
  background-color: #48e0d4;
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
.button1 {
  background-color: green;
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
<tr>
<td>
<h1>Deleting by Id</h1>
<form action="deletebyId">
Id:<input type="text" name="playerId" value="${team.playerId}">
<center><input type="submit" value="deletebyid" class="button"></center>
</form>
<h1>deleting by name</h1>
<form action="deletebyName">
player Name:<input type="text" name="playerName" value="${team.playerName}">
<center><input type="submit" value="deletebyname" class="button"></center>
</form>
<h1>search by team</h1>
<form action="searchbyteam">
player Team:<input type="text" name="playerteam" value="${team.playerteam}">
<center><input type="submit" value="search team" class="button1"></center>
</form>
</td>
</tr>
</table>
</center>
</body>

</html>