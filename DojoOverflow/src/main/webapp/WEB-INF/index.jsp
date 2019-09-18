<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isErrorPage="true" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
<title>Questions Dashboard</title>
</head>
<body>
	<div id="container">
		<h1>Questions Dashboard</h1>
			<c:forEach items="${question}" var="question">
				<table class="table table-striped table-bordered table-hover dark">
					<thead>
						<tr>
							<th scope="col">Tags</th>
							<th scope="col">Answers></th>
						</tr>
					</thead>
						<tr>
						    <td><c:out value="${question.tag}"/></td>
						    <td><c:out value="${question.answer}"/></td>
						</tr>
				</table>
			</c:forEach>
		<a href="/new"><h3 class="shiftright">New Question</h3></a>
	</div>
</body>
</html>