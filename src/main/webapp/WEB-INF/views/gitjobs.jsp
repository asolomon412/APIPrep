<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>GitHub Jobs</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootswatch/4.1.3/minty/bootstrap.min.css" />
</head>
<body>
	<h1>Github Jobs</h1>
	<table class="table">
		<thead>
			<tr>
				<td>Title</td>
				<td>Location</td>
				<td>Description</td>
			</tr>

		</thead>
		<tbody>
<c:forEach var="job" items="${githubresults}">
			<tr>
				<td>${job.title}</td>
				<td>${job.location}</td>
				<td>${job.description}</td>
			</tr>
</c:forEach>
		</tbody>

	</table>
</body>
</html>