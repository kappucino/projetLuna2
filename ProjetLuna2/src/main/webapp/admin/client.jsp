<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="../css/index.css">
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
<div id="client2" style="width: 500px;
	height: 500px;
	margin-left: 45%;
	margin-top: 20%;
	background-repeat: no-repeat;
	position: absolute;
	overflow: hidden;">
	<s:form action="insert" method="post">
		
			<s:submit name="Valider" value="Client" />
	</s:form>
</div>
</body>
</html>