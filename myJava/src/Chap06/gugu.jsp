<%@ page contentType="text/html; charset=UTF-8"
%>

<%
	String gugu = "<table>";
	
	for(int i=1; i<=9; i++ ){
		gugu += "<tr>";
		for(int j=2; j<10; j++){
			if(i==0){
				gugu+= "<th> ["+ i +"단] </th> ";
			}
			else{
				gugu+= "<td>" + i + " * " + j + " = " + i*j +"</td>";	
			}		
		}		
		gugu += "</tr>";
	}
	gugu+="</table>";
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> 수평 구구단 </title>
</head>
<style>
	tabla,td{
	border : 2px solid gray;
	
	border-collapse:collapse;
	}
	td, th{ 
	text-align: center;
	}
	
</style>
<body>

<h2>scriptlet example3</h2>
<hr>
<h4>이 곳에 수평 구구단 결과를 출력하는 코드를 작성하세요.</h4>
<hr>
</body>
</html>