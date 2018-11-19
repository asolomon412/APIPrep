<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Cards</title>
</head>
<body>
	<h1>Cards</h1>
	<a href="/shuffle-cards">Shuffle</a>
	<a href="/draw-cards?count=2">Draw 2</a>
	<c:forEach var="card" items="${ cards }">
		<div>
			<h3>${card.value} of ${ card.suit }</h3>
			<img src="${ card.image }" />
		</div>
	</c:forEach>
</body>
</html>