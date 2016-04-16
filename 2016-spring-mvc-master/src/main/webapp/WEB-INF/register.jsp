<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html>
<body>
<jsp:include page="../home.html"/>
	<h2>Java Home Registration</h2>
	<form:form action="register.htm" method="POST" commandName="reg">
	    <form:errors path="name"/>
	    <form:errors path="course"/>
	    <form:errors path="phone"/>
	    Name: <form:input path="name"/>
		Course: <form:input path="course"/>
		Phone: <form:input path="phone"/>
		<input type="submit" value="Register">
	</form:form>
</body>
</html>
