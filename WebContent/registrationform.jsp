<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href= "lato" rel= "stylesheet">
<link rel= "stylesheet" href="styles.css">
</head>
<body>
<h2 style="color:red;" align="center">WhiteEye Bank</h2>
<h3 style="color:blue;" align="center">User Registration Form</h3>
<form method="POST" action="./register">
<div class= "portfolio-items-wrapper1">
	<div class= "">
		<div class= "portfolio-img-background1" style="background-image: url(images/portfolio1.jpg)"></div>
		<div class= "img-text-wrapper">
			<div class= "logo-wrapper">
				<img src= "images/logos/quip.png" alt="">
			</div>	
			<center>
				<table>
			<tr>
				<td>Customer Id</td>
				<td><input type="text" name="cid" /></td>
			</tr>
			<tr>
				<td>User Name</td>
				<td><input type="text" name="uname" /></td>
			</tr>
			<tr>
				<td>User Password</td>
				<td><input type="password" name="upwd" /></td>
			</tr>
			<tr>
				<td>User Email Id</td>
				<td><input type="text" name="uemail" /></td>
			</tr>
			<tr>
				<td>User Mobile No</td>
				<td><input type="text" name="umobile" /></td>
			</tr>
			<tr>
				<td>User Balance</td>
				<td><input type="text" name="ubalance" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="Registration" /></td>
			</tr>
		</table><h3 align="center">
				Already have an account?, click on <a href = "./loginform.jsp" style="text-decoration: none;">Login</a>
				</h3>
			</center>
			<div class= "subtitle">
				Welcome
			</div>
		</div>
	</div>
</div>
</form>
<!-- Footer -->
<div class="nav-wrapper">
        <div class="nav-link-wrapper">
      <a> &copy; 2021 WhiteEye Bank.  All rights reserved.  All trademarks are property of their respective owners.
       </a>     
            <br>
            <a href="" >Privacy Policy</a>
            &nbsp; | &nbsp;
            <a href="" >Legal</a>
     </div>
	<br>
    <div class="nav-link-wrapper">
        <a href="about.html">About</a>
    </div>

</div><!-- End Footer -->
</body>
</html>