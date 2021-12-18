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
<div class = "nav-wrapper">
				<div class= "left-side">
					<div class= "nav-link-wrapper active-nav-link">
						<a href= "loggedin.jsp">Home</a>
					</div>
					<div class = "nav-link-wrapper">
						<a href= "about.html">About</a>
					</div>
					<div class = "nav-link-wrapper">
						<a href= "https://www.google.com">Google</a>
					</div>
				</div>
				<div class = "right-side">
					<div class = "brand">
						WHITEEYE BANK
					</div>
					<div class = "">
						<a href= "./logout">Logout</a>
					</div>
				</div>		
			</div>
<form method="POST" action="./deposit">
<div class= "portfolio-items-wrapper1">
	<div class= "portfolio-item-wrapper">
		<div class= "portfolio-img-background1" style="background-image: url(images/portfolio1.jpg)"></div>
		<div class= "img-text-wrapper">
			<div class= "logo-wrapper">
				<img src= "images/logos/quip.png" alt="">
			</div>						
<table>
	
	<tr>
		<td>Deposit Amount</td>
		<td><input type="text" name="udeposit"/></td>
	</tr>
	<tr>
		<td><input type="submit" value="Deposit"/></td>
	</tr>
</table>
			<div class= "subtitle">
				Welcome to WhiteEye Bank
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