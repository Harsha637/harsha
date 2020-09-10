<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
<title>search</title>
<style>
body {
  background-color: #a278d6;
}
h1
{
color: blue;
}
table
{
background-color: #abcacc;
}
.button {
  background-color: #4c178f;
  border: none;
  color: white;
  padding: 15px 32px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 16px;
  margin: 4px 2px;
  cursor: pointer;
}
.button1 {
  background-color: #2d8085;
  border: none;
  color: white;
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
<div>
<center>
<table border="2" cellpadding="20">
<tr>
<td>
<h1>
searching for id
</h1>

<form action="SearchbyId">
Id:<input type="text" name="playerId" value="${team.playerId}">
<center><input type="submit" value="search" class="button"></center>
</form>

<form action="updateData">

<br>
<br>
Player team: <input type="text" name="playerteam" value="${team.playerteam}">
<br>
Player Name: <input type="text" name="playerName" value="${team.playerName}">
<br>
<center><input type="submit" value="updateTeam" class="button1"></center>
</form>
<br>
<br>
<form action="home">
<center><input type="submit" value="Main menu" class="button"></center>
</form>

</td>
</tr>
</table>
</center>
</div>

</body>

</html>