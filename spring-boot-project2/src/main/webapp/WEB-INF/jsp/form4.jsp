<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>

<head>
<title>First Web Application</title>
<style type="text/css">
  body  
{  
    margin: 0;  
    padding: 0;  
    background-color:#6abadeba;  
    font-family: 'Arial'; 
    background-image:url("https://wallpaperaccess.com/full/2910375.jpg"); 
}  
.login{  
        width: 382px;  
        overflow: hidden;  
        margin: auto;  
        margin: 20 0 0 450px;  
        padding: 80px;  
        background: #23463f;  
        border-radius: 15px ;  
          
}  
h2{  
    text-align: center;  
    color: #277582;  
    padding: 20px;  
}  
label{  
    color: #08ffd1;  
    font-size: 17px;  
}  
#Uname{  
    width: 300px;  
    height: 30px;  
    border: none;  
    border-radius: 3px;  
    padding-left: 8px;  
}  
#Pass{  
    width: 300px;  
    height: 30px;  
    border: none;  
    border-radius: 3px;  
    padding-left: 8px;  
      
}  
#log{  
    width: 300px;  
    height: 30px;  
    border: none;  
    border-radius: 17px;  
    padding-left: 7px;  
    color: blue;  
  
  
}  
span{  
    color: white;  
    font-size: 17px;  
}  
a{  
    float: right;  
    background-color: grey;  
}  
</style>
</head>

<body >
    
<h2>Login Page</h2><br>    
    <div class="login">    
    <form:form id="login" method="POST">    
        <label><b>Enter new password   
        </b>    
        </label>    
        <input type="password" name="password" id="Uname" placeholder="Enter new password">    
        <br><br>    
        <label><b>Confirm your new password     
        </b>    
        </label>    
        <input type="password" name="password" id="Pass" placeholder="Confirm your new password">   
        <br><br>
        <!-- <input type="button" id="log" onclick="window.location.href = '/add-todos';" value="Submit"/>     -->
        <input type="submit" name="log" id="log" value="Submit"> <br><br> 
        
        <br><br>    
        <input type="checkbox" id="check">    
        <span>Remember me</span>    
        <br><br>
        
            
         
    </form:form>     
</div>    
</body>

</html>