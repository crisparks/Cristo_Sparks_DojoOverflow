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
<title>New Question</title>
</head>
<body>
	<div id="container">
		<h1>What is your question?</h1>
		<form:form action="addquestion" method="post" modelAttribute="questionObject">
			<h2>
				<form:label cssClass="box" path="question">Question:</form:label>
				<form:input cssClass="#" path="question"/>		
			</h2>
			<h2>Tags:&nbsp<input type="text" name="tagReq"></h2>
			<input id="btn" class="shiftright" type="submit" value="Submit"/>
		</form:form>
		<form:errors cssClass="red" path="questionObject.*"/> 
	</div>
</body>
</html>