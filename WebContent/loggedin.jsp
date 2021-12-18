<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>WhiteEye Bank</title>
		<link href= "lato" rel= "stylesheet">
		<link rel= "stylesheet" href="styles.css"></head>
<body>
<% 
String uname= (String)session.getAttribute("uname"); 
%>
<!-- Header -->
		<div class= "container">
			<div class = "nav-wrapper">
				<div class= "left-side">
					<div class = "brand">
						<a href="loggedin.jsp" style="text-decoration: none;">WHITEEYE BANK</a>
					</div>
					<div class= "nav-link-wrapper active-nav-link">
						<a href= "loggedin.jsp">Home</a>
					</div>
					<div class = "nav-link-wrapper">
						<a href= "about.html">About </a>
					</div>
					<div class = "nav-link-wrapper">
						<a href= "https://www.google.com">Google</a>
					</div>
				</div>
				<div class = "right-side">
					<div class = "nav-link-wrapper">
						<a href="loggedin.jsp">Search</a>
					</div>
					<div class = "">
						<a href= "./logout" style="text-decoration: none;">Logout</a>
					</div>
				</div>		
			</div>
<!-- End of Header -->
			
			<div class= "nav-wrapper">
				<div class = "left-side">
					<div class = "nav-link-wrapper">
						<a href="deposit.jsp">Deposit</a>
					</div>
					<div class = "nav-link-wrapper">
						<a href="withdraw.jsp">Withdraw</a>
					</div>
					<div class = "nav-link-wrapper">
						<a href="./transfer.jsp">Transfer Money</a>
					</div>
					<div class = "nav-link-wrapper">
						<a href="./balance">Check Balance</a>
					</div>
					<div class = "nav-link-wrapper">
						<a href="./transactions.jsp">Previous Transactions</a>
					</div>
				</div>
			</div>
		</div>
			<div class= "portfolio-items-wrapper">
				<div class= "portfolio-item-wrapper">
					<div class= "portfolio-img-background" style="background-image: url(images/portfolio1.jpg)"></div>
					<div class= "img-text-wrapper">
						<div class= "logo-wrapper">
							<img src= "images/logos/quip.png" alt="">
						</div>	
						<div class= "subtitle">
							This is a subtitle. This is a subtitle. This is a subtitle. This is a subtitle. This is a subtitle. This is a subtitle. This is a subtitle. This is a subtitle. This is a subtitle. This is a subtitle.
						
						</div>
					</div>
				</div>
				<div class= "portfolio-item-wrapper">
					<div class= "portfolio-img-background" style="background-image: url(images/portfolio13.jpg)"></div>
					<div class= "img-text-wrapper">
						<div class= "logo-wrapper">
							<img src= "images/logos/dailysmarty.png" alt="">
						</div>	
						<div class= "subtitle">
							This is a subtitle2.<% out.println(uname); %>
						</div>
					</div>
				</div>
				<div class= "portfolio-item-wrapper">
					<div class= "portfolio-img-background" style="background-image: url(images/portfolio14.jpg)"></div>
					<div class= "img-text-wrapper">
						<div class= "logo-wrapper">
							<img src= "images/logos/devcamp.png" alt="">
						</div>	
						<div class= "subtitle">
							This is a subtitle3.
						</div>
					</div>
				</div>
				<div class= "portfolio-item-wrapper">
					<div class= "portfolio-img-background" style="background-image: url(images/portfolio15.jpg)"></div>
					<div class= "img-text-wrapper">
						<div class= "logo-wrapper">
							<img src= "images/logos/quip.png" alt="">
						</div>	
						<div class= "subtitle">
							This is a subtitle4.
						</div>
					</div>
				</div>
				<div class= "portfolio-item-wrapper">
					<div class= "portfolio-img-background" style="background-image: url(images/portfolio16.jpg)"></div>
					<div class= "img-text-wrapper">
						<div class= "logo-wrapper">
							<img src= "images/logos/quip.png" alt="">
						</div>	
						<div class= "subtitle">
							This is a subtitle5.
						</div>
					</div>
				</div>
				<div class= "portfolio-item-wrapper">
					<div class= "portfolio-img-background" style="background-image: url(images/portfolio17.jpg)"></div>
					<div class= "img-text-wrapper">
						<div class= "logo-wrapper">
							<img src= "images/logos/quip.png" alt="">
						</div>	
						<div class= "subtitle">
							This is a subtitle6.
						</div>
					</div>
				</div>
				<div class= "portfolio-item-wrapper">
					<div class= "portfolio-img-background" style="background-image: url(images/portfolio7.jpg)"></div>
					<div class= "img-text-wrapper">
						<div class= "logo-wrapper">
							<img src= "images/logos/quip.png" alt="">
						</div>	
						<div class= "subtitle">
							This is a subtitle6.
						</div>
					</div>
				</div>
				<div class= "portfolio-item-wrapper">
					<div class= "portfolio-img-background" style="background-image: url(images/portfolio8.jpg)"></div>
					<div class= "img-text-wrapper">
						<div class= "logo-wrapper">
							<img src= "images/logos/quip.png" alt="">
						</div>	
						<div class= "subtitle">
							This is a subtitle6.
						</div>
					</div>
				</div>
				<div class= "portfolio-item-wrapper">
					<div class= "portfolio-img-background" style="background-image: url(images/portfolio9.jpg)"></div>
					<div class= "img-text-wrapper">
						<div class= "logo-wrapper">
							<img src= "images/logos/quip.png" alt="">
						</div>	
						<div class= "subtitle">
							This is a subtitle6.
						</div>
					</div>
				</div>			
			</div>
	
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

	<script>
		const portfolioItems = document.querySelectorAll('.portfolio-item-wrapper')
		portfolioItems.forEach(portfolioItem => {
			portfolioItem.addEventListener('mouseover', () => {
				console.log(portfolioItem.childNodes[1].classList);
				portfolioItem.childNodes[1].classList.add('img-darken');
			})
			portfolioItem.addEventListener('mouseout', () => {
				portfolioItem.childNodes[1].classList.remove('img-darken');
			})
		})

	</script>
</html>