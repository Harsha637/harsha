<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
<title>Home</title>
<style>
table {
  background-color: grey;
}
body {
  background-color: #877617;
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
  background-color: #244cab;
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
<center>
<table border="1">
<tr rowspan="2">
<td colspan="10">
<h1><br>
---Team Registration -- 
</h1>
<form action="display">

 Team Name:<input type="text" name="teamName">
<br><br>
 TeamId:<input type="text" name="teamId"><br>
<br>
 City: <input type="text" name="city">
<br><br>
<br>
 Playername: <input type="text" name="pname">
<br><br>
<center><input type="submit" name="save Team" class="button"></center>
</form>

<form action="update">
<center><input type="submit" value="Update" class="button1"></center>
</form>

<form action="DeletePage"><br>
Team Id:<input type="text" name="teamId"><br>
<center><input type="submit" value="Delete" class="button1"></center>
</form>
</td>
</tr>
</table>
</center>
</body>
</html>