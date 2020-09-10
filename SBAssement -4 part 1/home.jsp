<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
<title>Home</title>
<style>
body {
  background-color: #a278d6;
}
h1
{
color: green;
}
table
{
background-color: grey;
}
.button {
  background-color: #4CAF50;
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
  background-color: #4287f5;
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
<br>
<br>
<center>
<table border="1" cellpadding="15">
<tr>
<td>
<h1>
<b>Hello please register your Team!</b>  
</h1>
<form action="display">
Player Name:<input type="text" name="playerName">
<br><br>
  Player Id:<input type="text" name="playerId">
<br><br>
 playerteam: <input type="text" name="playerteam">
<br>
<center><input type="submit" name="saveTeam" class="button"></center>
</form>

<form action="search">
<center><input type="submit" value="update" class="button1"></center>
</form>
<br>
<form action="deleting">
<center><input type="submit" value="deleting" class="button1"></center>
</form>
</td>
</tr>
</table>
</center>
</body>
</html>