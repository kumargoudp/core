<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script
	src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
<script>
       /* var set_delay = 5000,
        callout = function () {
            $.ajax({
                /* blah */
         /*   })/*
                    .done(function (response) {
                       alert("TEST");
                    })
                    .always(function () {
                        setTimeout(callout, set_delay);
                    });
       		 };
						callout();*/
						
						/*function pollServerForNewMail() {
	                        setTimeout(function(){
	                        $.ajax({ url: "/allmail.do", success: function(data){
	                            alert("TEST");
	                            poll();
	                        }, dataType: "string"});
	                    }, 10000);
	}
	        pollServerForNewMail() ; */
	      /*  var interval = 1000;  // 1000 = 1 second, 3000 = 3 seconds
	        function doAjax() {
	            $.ajax({
	                    type: 'POST',
	                    url: 'allmail.do',
	                   // data: $(this).serialize(),
	                    dataType: 'string',
	                    data: {},
	                    success: function (response) {
	                           // $('#result').html(data);// first set the value   
	                    	 console.log(response);
	                    	  alert(response);
	                    },
	                    complete: function (response) {
	                            // Schedule the next
	                            setTimeout(doAjax, interval);
	                    }
	            });
	        }
	        setTimeout(doAjax, interval);*/
	        var interval = 5000;  // 1000 = 1 second, 3000 = 3 seconds
	        function doAjax() {
	        $.post('allmail.do', function(data) {  
	        	$('#result').html(data);  
	        	});
	        }
	        setInterval(doAjax, interval);
        </script>
<style>
$size: 45px;
table {
	font-family: arial, sans-serif;
	border-collapse: collapse;
	width: 100%;
}

td, th {
	border: 1px solid #dddddd;
	text-align: left;
	padding: 8px;
}

tr:nth-child(even) {
	background-color: #dddddd;
}
.styInbox{
border:#000 1px solid;width:100px;height:20px;
background-color:#9A0912;
}
.sty{
color:#fff;
}
.half-circle {
    margin-left:23px;
    width: 50px;
    height: 20px; /* as the half of the width */
    background-color: #33FF9C;
    border-top-left-radius: 110px;  /* 100px of height + 10px of border */
    border-top-right-radius: 110px; /* 100px of height + 10px of border */
    border: 2px solid gray;
    border-bottom: 0;
}
</style>
</head>
</head>
<body>
	Test
	<form action="allmail.do">
		<!-- <input type="submit" value="Click"> -->
	</form>
	<div class="half-circle ">
	
	<center>11</center></div>
	<div class="styInbox">
	<center class="sty">INBOX</center>
	</div>
	<table>
	
		<c:forEach items="${allmails}" var="mail">
			<tr>
				<td><c:out value="${mail}" /></td>

			</tr>
		</c:forEach>
	</table>
	<div id="result" style="border:#000 1px solid;height: 200px"></div>
</body>
</html>
