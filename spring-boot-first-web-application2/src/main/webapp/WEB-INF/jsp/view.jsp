<html>

<head>
<title>Second Web Application</title>
<style>
body {
	background-image: url("https://wallpaperaccess.com/full/2910375.jpg");
	text allign: center;
}



/*img {
  float: left;
  width: 25.33%;
  padding: 5px;
  width: 20%;
  height: 20%;
  margin-left:20;
  margin-top:20;
  display:flex;
}*/

img {
	width: 20%;
	height: 20%;
	display:flex;
	justify-content:center;
	margin-left:5px;
	margin-right:5px;
	allign-items:center;
	margin-left:40;
}
</style>
</head>

<body>
  
  <form method="POST" id="id1">
  <p id="id2">Please select any one option according to you:</p>
    <input type="radio" id="html" name="radioName" value="Stationary">
    <label for="Stationary"><img src="https://5.imimg.com/data5/YL/RI/OR/SELLER-95604177/stationeries-500x500-png-500x500.png" alt="Stationary" /></label><br>
    <input type="radio" id="css" name="radioName" value="Clothes">
    <label for="Clothes"><img src="https://images.unsplash.com/photo-1445205170230-053b83016050?ixid=MnwxMjA3fDB8MHxzZWFyY2h8MjF8fGNsb3RoZXN8ZW58MHx8MHx8&ixlib=rb-1.2.1&w=1000&q=80" alt="Clothes" /></label><br>
    <input type="radio" id="javascript" name="radioName" value="Sports">
    <label for="Sports"><img src="https://media.istockphoto.com/photos/various-sport-equipments-on-grass-picture-id949190756" alt="Sports" /></label><br><br>
    <input type="submit" value="Submit">
  </form>
  
  
	
</body>

</html>