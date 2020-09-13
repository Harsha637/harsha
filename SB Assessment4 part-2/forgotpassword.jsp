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
background: url("enter.jpg");
background-repeat: no-repeat;
background-size: 50%;
opacity: 0.6;
}

</style>

<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- Add icon library -->
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

<style>
body {font-family: Arial, Helvetica, sans-serif;}
* {box-sizing: border-box;}

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



<form action="pass" method="get" style="max-width:300px;margin:auto">

   <center><h2 style="color: Black" > Please Enter The Details </h2></center>

   <div class="input-container">
    <i class="fa fa-user icon"></i>
    <input class="input-field" type="text" placeholder="User Id" name="userid"  onkeypress ="test(event)" required>
  </div>
	
	<div class="input-container">
    <i class="fa fa-book icon"></i>
  

      <select name="security_question">
     <option>security Question</option>
     <option>What is Your First name?</option>
     <option>What is your favourite colour?</option>
     <option>What is Your favourite Sport?</option>
     <option>What is your pet name?</option>
     <option>What is your first school name?</option>
     <option>What is your first child name?</option>
     <option>What is Your birth sign?</option>
     
      </select>
    </div>


  <div class="input-container">
    <i class="fa fa-user icon"></i>
    <input class="input-field" type="text" placeholder="Security Ans" name="security_answer"  onkeypress ="test(event)" required>


  </div>
 

  <button type="submit" class="btn">Proceed</button>
</form>


</body>
</html>