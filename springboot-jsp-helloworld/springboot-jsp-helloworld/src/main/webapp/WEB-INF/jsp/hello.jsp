<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
</head>
<body>
    <h2 class="hello-title">Hello ${name}!</h2>
  <script type="text/javascript">  
			function validate() {
				var letters = /^[A-Za-z]+$/;
				var inputtxt = document.getElementById("data").value;  
				if (inputtxt.value.match(letters)) {
					return true;
				} else {
					alert("message");
					return false;
				}
			}
		</script>
	<form action="/caseChange" method="get" onsubmit="validate();">
		Enter String : <input type="text" name="data" id="data"></input> <input
			type="submit" value="submit"></input>
	</form>
		  <h2>Input:: ${data}</h2>
		  <h2 >Result:: ${result}</h2>
		  <h2>Error:: ${error}</h2>
		  
</body>
</html>