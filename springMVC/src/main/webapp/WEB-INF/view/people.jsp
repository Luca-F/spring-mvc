<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Form</title>
  <style>
      .error {
         color: #ff0000;
      }

      .errorblock {
         color: #000;
         background-color: #ffEEEE;
         border: 3px solid #ff0000;
         padding: 8px;
         margin: 16px;
      }
   </style>
</head>

<body>
<form:form method = "POST" action="/springMVC/addForm">
	<table>
		<tr>
			<td>
				<form:label path= "firstName">First Name</form:label> 
			</td>
			<td>
				<form:input path= "firstName" />
			</td>
			<td>
				<form:errors path="firstName" cssClass="error"/>
			</td>
		</tr>
		<tr>
			<td>
				<form:label path= "lastName">Last Name</form:label> 
			</td>
			<td>
				<form:input path= "lastName" />
			</td>
			<td>
				<form:errors path="lastName" cssClass="error"/>
			</td>
		</tr>
		<tr>
			<td>
				<form:label path= "id">ID</form:label> 
			</td>
			<td>
				<form:input path= "id" />
			</td>
			<td>
				<form:errors path="id" cssClass="error"/>
			</td>
		</tr>
		<tr>
		<td colspan="2">
		<input type="submit" value="Submit"/>
		</td>
		</tr>
	</table>

</form:form>

</body>
</html>