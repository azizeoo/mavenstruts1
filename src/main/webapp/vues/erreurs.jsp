<%@ taglib  uri="/WEB-INF/tld/struts-html.tld" prefix="html"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Personne</title>
</head>
<body>
	<h2>Les erreurs suivante se sont produites</h2>
	<html:errors bundle="erreur" />
	<html:link page="/formulaire.do">
		retour au formulaire
	</html:link>
</body>
</html>