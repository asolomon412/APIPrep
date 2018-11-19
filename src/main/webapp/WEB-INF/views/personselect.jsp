<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Select a Character</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootswatch/4.1.3/minty/bootstrap.min.css" />
</head>
<body>
	<div class="container">
		<form action="personspecs" method="post">
			<select name="person">
				<c:forEach var="p" items="${people }" varStatus="count">
					<option value="${count.index + 1}">${count.index + 1}. ${p.name }</option>
				</c:forEach>
			</select> <input class="btn btn-primary" type="submit" value="Submit">
		</form>
	</div>
</body>
</html>