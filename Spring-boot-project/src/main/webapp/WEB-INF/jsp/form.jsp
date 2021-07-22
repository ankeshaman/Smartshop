<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>

<head>
<title>First Web Application</title>
<style type="text/css">
  body{
      background-image:url("https://wallpaperaccess.com/full/2910375.jpg");
      margin: 10;  
      padding: 10;  
      font-family: 'Arial'; 
      margin-left:400;
      margin-right:400;
  }
  #id2{
       text-align:center;
       font-size: 40px;
       color:black;
       font-style:italic;
       font-weight:bold;
 }
 input[type=text],
 input[type=date],
 input[type=number] {
        width: 100%;
        padding: 12px 20px;
        margin: 8px 0;
        display: inline-block;
        border: 1px solid #ccc;
        box-sizing: border-box;
    }
 input[type=submit] {
        background-color: #4CAF50;
        color: white;
        padding: 14px 20px;
        margin: 8px 0;
        border: none;
        cursor: pointer;
        width: 100%;
    }
   a{
   font-size:40px;
   }
  #id1{
       color:black;
       font-size:20px;
  }
  .form-group{
       border: 1px solid black;
       padding: 1.5%;
       font-size:20px;
       color:black;
       
  }
 .form-control {
    min-width: 0;
    width: auto;
    display: inline;
    margin-left: ($spacer * 5);
}
</style>
</head>

<body style="background-color:grey;">
<p id="id2">welcome ${name}</p>
 <form:form method="POST" modelAttribute="todo" >
   <fieldset class="form-group">
       <form:label path="UserId">Product Code</form:label>
       <form:input path="UserId"  size="20" type="number" class="form-control" required="required"/>
       <form:label path="Point">Product Code</form:label>
       <form:input path="Point"  size="20" type="number" class="form-control" required="required"/>
   </fieldset>
   <!--Product Name:<input required placeholder="Product Name" type="text"/><br><br>
   Number of Items Available:<input placeholder="Number of Items Available" required type="number"/><br><br>
   Date of Manufacturing:<input placeholder="Date of Manufacturing" required type="date"/><br><br>
   Date of Expiry:<input placeholder="Date of Expiry" required type="date"/><br><br>
   <input type="submit"/>-->
   <button type="submit" class="btn btn-success">Add</button><br><br>
   <!--<a href="/list-todos">Click here</a> <p id="id1">to manage your list of product.</p>-->
 </form:form>
</body>

</html>