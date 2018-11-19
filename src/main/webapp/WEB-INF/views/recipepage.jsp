<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>${recipeResult.q }</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootswatch/4.1.3/minty/bootstrap.min.css" />
<style type="text/css">
.caps {
	text-transform: capitalize;
}
</style>
</head>
<body>
	<div class="container">
		<%-- 	this was a test to make sure data was coming into the page
			${recipeResult.hits[0].recipes} 
			<img alt="recipe image" src="${recipeResult.hits[0].recipes.image }"> --%>
		<h1 class="jumbotron">
			<!-- this is passing the query string into the page as the title the span 
		is adding capitalization to the first letter -->
			<span class="caps">${recipeResult.q}</span>
		</h1>
		<form action="/recipe">
			<input type="text" name="foodtype" placeholder="Keyword"> <input
				type="submit" class="btn btn-primary" value="Search">
		</form>
<hr>
		<table class="table">
			<thead>
				<tr>
					<th>Recipe</th>
					<th>Image</th>
					<th>Recipe Link</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="r" items="${recipeResult.hits}">
					<tr>
						<td><span class="caps">${r.recipes.label}</span>
							<hr> <!-- added this for the array of diet labels --> <c:forEach
								var="label" items="${r.recipes.dietLabels}">
								<p style="font-size:.8em;">${label}</p>
							</c:forEach>
						</td>
						<!-- adding the link from the image to an image tag to render it -->
						<td><img alt="recipe image" src="${r.recipes.image}"></td>
						<!-- adding the url in the same way using the string returned from
						the API -->
						<%-- didn't like the formatting of this on the page						<td><c:forEach var="label" items="${r.recipes.dietLabels}" ><p>${label}</p></c:forEach></td> --%>
						<td><a href="${r.recipes.url}"><button
									class="btn btn-primary">See Recipe</button></a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>

</body>
</html>