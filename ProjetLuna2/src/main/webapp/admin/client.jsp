<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <link rel="stylesheet" type="text/css" href="/css/index.css">
<title>Gestion des Clients</title>
</head>
<body>

<div id="menu">
<h1>Luna SARL</h1>
<div id="ajouter"><h1> <img alt="quitter" src="../css/images/gestion/Add-New-48.png" width="40px" id="ajout">Ajouter</h1></div>
<div id="rechercher"><h1> <img alt="quitter" src="../css/images/gestion/Search-48.png">Rechercher</h1></div>
<div id="modifier"><h1> <img alt="quitter" src="../css/images/gestion/Data-Edit-48.png">Modifier</h1></div>
<div id="supprimer"><h1> <img alt="quitter" src="../css/images/gestion/Garbage-Open-48.png">Supprimer</h1></div>
<div id="quitter"> <h1> <img alt="quitter" src="../css/images/connection/Stop-48.png">Quitter</h1></div>
</div>
<div id="client2" >
	<h1>Inserer un nouveau client !</h1>
	<s:form action="insert" method="post">
			
			<s:textfield name="client.nom" label="Nom" value="client.nom"/>
			<s:textfield name="client.prenom" label="Prenom" value="client.prenom" />
			<s:checkbox name="client.carte_fidele" fieldValue="true" value="client.carte_fidele" label="Carte de fidelité"/>
			<s:textfield name="adresse.codePostal" label="code Postal" value="adresse.codePostal"/>
			<s:textfield name="adresse.rue" label="Rue" value="adresse.rue" />
			<s:textfield name="adresse.ville" label="ville" value="adresse.ville"  />
			
			<s:submit name="Valider" value="Client" />
	</s:form>
<div id="allcli">
	<h2>All Customers</h2>


<table border="1px" cellpadding="8px">
	<tr>
		<th>Customer Id</th>
		<th>Name</th>
		<th>prenom</th>
		<th>Created Date</th>
		<th>carte fidelite</th>
		<th>rue</th>
		<th>ville</th>
		<th>Code Postal</th>
		<th>Modifier</th>
		<th>Supprimer</th>
	</tr>
	<s:iterator value="clients" >
		<tr>
<%-- 			<td><s:property value="code" /></td> --%>
<%-- 			<td><s:property value="nom" /></td> --%>
<%-- 			<td><s:property value="prenom" /></td> --%>
<%-- 			<td><s:property value="date" /></td> --%>
<%-- 			<td><s:property value="carte_fidele" /></td> --%>
<%-- 			<s:iterator value="adresses" > --%>
<%-- 			<td><s:property value="rue" /></td> --%>
<%-- 			<td><s:property value="ville" /></td> --%>
<%-- 			<td><s:property value="codePostal" /></td> --%>
<%-- 			</s:iterator> --%>
			<td><s:property value="code" /></td>
			<td><s:property value="nom" /></td>
			<td><s:property value="prenom" /></td>
			<td><s:property value="date" /></td>
			<td><s:property value="carte_fidele" /></td>			
				<td><s:property value="adresse.rue" /></td> 
 			<td><s:property value="adresse.ville" /></td> 
			<td><s:property value="adresse.codePostal" /></td>
			<th><a href="#">Modifier</a></th>
		<th><a  href="#">Supprimer</a></th>
		</tr>
	</s:iterator>
</table>

<br/>
</div>
	
</div>
</body>
</html>