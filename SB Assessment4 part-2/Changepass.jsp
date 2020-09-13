<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
body
{
background: url("forgot.jpg");
background-repeat: no-repeat;
background-size: 55%;
opacity: 0.6;
}

</style>


<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- Add icon library -->
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

<style>
body {
	font-family: Arial, Helvetica, sans-serif;
}

* {
	box-sizing: border-box;
}

.input-container {
	display: -ms-flexbox; /* IE10 */
	display: flex;
	width: 100%;
	margin-bottom: 15px;
}

.icon {
	padding: 10px;
	background: dodgerblue;
	color: white;
	min-width: 50px;
	text-align: center;
}

.input-field {
	width: 100%;
	padding: 10px;
	outline: none;
}

.input-field:focus {
	border: 2px solid dodgerblue;
}

/* Set a style for the submit button */
.btn {
	background-color: dodgerblue;
	color: white;
	padding: 15px 20px;
	border: none;
	cursor: pointer;
	width: 100%;
	opacity: 0.9;
}

.btn:hover {
	opacity: 1;
}
</style>
<script type="text/javascript">
	
</script>
</head>
<body>


<h2>${userId}</h2>
	<form action="changepass" method="get"
		style="max-width: 300px; margin: auto">
		<center>
			<h2 style="color: powderblue">CHANGE PASSWORD</h2>
		</center>
		<div class="input-container">
    
    <input class="input-field" type="hidden" placeholder="User Id" name="userid"  value="${userId}" onkeypress ="test(event)" required>
  </div>
		
		<div class="input-container">
			<i class="fa fa-key icon"></i> <input class="input-field"
				type="password" placeholder="Password" name="password" required>
		</div>
		<div class="input-container">
			<i class="fa fa-key icon"></i> <input class="input-field"
				type="password" placeholder="Conform Password" name="conformPass"
				required>
		</div>
		<button type="submit" class="btn">Login</button>
	</form>
	
</body>
</html>