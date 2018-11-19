<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootswatch/4.1.3/minty/bootstrap.min.css" />
</head>
<body>
	<div class="container">
		<%-- ${match } --%>
		<table class="table">
			<thead>
				<tr>
					<td>Title</td>
					<td>URL</td>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="job" items="${match.sr.items }">

					<tr>
						<td>${job.match.positionTitle }</td>
						<td><a href="${job.match.positionUri }"><button
									class="btn btn-primary">Position Details</button></a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>