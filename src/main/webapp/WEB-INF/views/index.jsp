<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>API Demo</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootswatch/4.1.3/minty/bootstrap.min.css" />


</head>
<body>
	
	<nav class="navbar navbar-expand-lg navbar-dark bg-primary">
  <a class="navbar-brand" href="#">API Demo</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarColor01" aria-controls="navbarColor01" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>

  <div class="collapse navbar-collapse" id="navbarColor01">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item active">
        <a class="nav-link" href="#">Home <span class="sr-only">(current)</span></a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="#">Tell Me</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="#">Test</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="#">About</a>
      </li>
    </ul>
    <form class="form-inline my-2 my-lg-0">
      <input class="form-control mr-sm-2" type="text" placeholder="Search">
      <button class="btn btn-secondary my-2 my-sm-0" type="submit">Search</button>
    </form>
  </div>
</nav>
<div class="container">
		<br>
		<h1 class="jumbotron">API Demo</h1>
		
		<!-- this adds a horizontal line on the page to separate the pieces -->
		<hr>
		<h4>${quotetest.type }</h4>

		<h3>${quotetest.value.quote }</h3>
		<a href="/"><button class="btn btn-primary">Random Quote</button></a>
		<br>
		<hr>
		<h1>Love Calculator</h1>
		<form action="/love">
			<input type="text" name="fname" placeholder="First Name"> <input
				type="text" name="sname" placeholder="Second Name"> <input
				type="submit" class="btn btn-primary" value="submit">
		</form>
		<hr>
		<h1>Recipe Finder</h1>
		<form action="/recipe">
			<input type="text" name="foodtype" placeholder="Keyword"> <input
				type="submit" class="btn btn-primary" value="submit">
		</form>
		<br>
	</div>
</body>
</html>