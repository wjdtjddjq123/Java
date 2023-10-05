<%@ page contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> member insert &amp; List </title>
	<link href="/myproject" rel="stylesheet">
</head>
<body>
	<h2>회원가입 &amp; 및 전체 회원 조회</h2>
	<hr>
	<h3>[회원가입]</h3>
	<form method="post" id="insertMember">
		<fieldset>
			<legend>회원정보입력</legend>
			<lable for="id">아이디</lable>
			<input type="email" name="id" id="id" required placeholder="ex)example@gmail.com"><br>
			
			<lable for="passwd">비밀번호</lable>
			<input type="password" name="passwd" id="id" required placeholder="4글자 이상"><br>
			
			<lable for="passwd">비밀번호 확인</lable>
			<input type="password" id="passwd" required placeholder="동일비밀번호 입력"> <br>

			<lable for="name">이름</lable>
			<input type="text" name="name" id="name" required placeholder="2글자 이상">::: 		
						
						
			<input type="submit" value="가입">
		</fieldset>
	</form>
	<div id="msg">
	
	</div>
	<hr>
	<h3>[전체 회원 조회]</h3>
	<table>
		<tr>
			<th>번호</th>
			<th>아이디</th>
			<th>이름</th>
			<th>등록일</th>
			<th>회원정보 수정</th>
		</tr>
		<tr>
			<td>1</td>
			<td>longlee@daum.net</td>
			<td>이성구</td>
			<td>2023-10-05 14:23:42</td>
			<td><button>수정</button></td>
		</tr>
	</table>
</body>
</html>