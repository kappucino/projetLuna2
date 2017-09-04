<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Modifier un client</title>
</head>
<body>
<s:form action="updateClient" method="post">
			
			<s:textfield name="client.code" label="code" disabled="true" value="%{client.code}"/>
			<s:textfield name="client.nom" label="Nom" value="%{client.nom}"/>
			<s:textfield name="client.prenom" label="Prenom" value="%{client.prenom}" />
 			
 			
			<s:checkbox name="client.carte_fidele" fieldValue="true"  label="Carte de fidelité" value="%{client.carte_fidele}"/>
			<s:textfield name="adresse.codePostal" label="code Postal" value="%{client.adresse.codePostal}"/>
			<s:textfield name="adresse.rue" label="Rue"  value="%{client.adresse.rue}"/>
			<s:textfield name="adresse.ville" label="ville"  value="%{client.adresse.ville}" />
			
			<s:submit name="Valider" value="Client" />
	</s:form>
</body>
</html>