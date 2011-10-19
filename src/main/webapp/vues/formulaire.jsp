<%@ taglib  uri="/WEB-INF/tld/struts-html.tld" prefix="html"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Formulaire</title>
</head>
<body>
	<h2>Personne Formulaire</h2><br>
	<html:form action="/main" >
		<table>
			<tr>
				<td>Nom</td>
				<td>
				<html:text property="nom" size="20"></html:text>
				</td>
			</tr>
			<tr>
				<td>Age</td>
				<td>
				<html:text property="age" size="5"></html:text>
				</td>
			</tr>
		</table>
		<table>
			<tr>
				<td><html:submit value="Envoyer"/></td>
				<td><html:reset value="Retablir"/></td>
				<td><html:button property="btnEffacer" value="Effacer" onclick="effacer()"/></td>
			</tr>
		</table>
	</html:form>
</body>
</html>