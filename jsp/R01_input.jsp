<%@ page language="java" contentType="text/html; charset=UTF-8"
		pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Insert title here</title>
	</head>
	<%

		//パスの取得
		String strPath = request.getContextPath();;

	%>
	<body>
		<h4>R01_input.jsp</h4><br />
		<form action="R01_output.jsp" method="get">
			<input type="text" name="txtName" /><br />
			<input type="submit" value="送信" />
		</form>
	</body>
</html>
