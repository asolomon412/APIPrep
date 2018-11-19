<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Star Wars Character Results</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootswatch/4.1.3/minty/bootstrap.min.css" />
</head>
<body>
	<h1>Character Search Results</h1>
	<table class="table">
		<tr>
			<th>Name</th>
			<th>Height</th>
			<th>Mass</th>
			<th>Hair Color</th>

		</tr>

		<tr>
			<td>${person.name}</td>
			<td>${person.height}</td>
			<td>${person.mass}</td>
			<td>${person.hair_color}</td>
		</tr>

	</table>
</body>
</html>