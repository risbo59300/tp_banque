<%@page import="persistance.entities.Etudiant"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Consultation de la liste des Etudiants</title>
</head>
<body>
	<% List<Etudiant> lEtudiant=(List<Etudiant>)request.getAttribute("listeE") ;%>
	<table id="table" border="1" bgcolor="yellow">
		<caption>Liste des Etudiants</caption>
		<thead >
			<tr>
				<th>Code</th>
				<th>nom</th>
				<th>moyenne</th>
			</tr>
		</thead>
		<tbody>
		<%
		for(int i=0;i<lEtudiant.size();i++){
		out.println("<tr>")	;
		
		out.println("<td>"+lEtudiant.get(i).getCode() +"</td>")	;
		out.println("<td>"+ lEtudiant.get(i).getNom()+"</td>")	;
		out.println("<td>"+lEtudiant.get(i).getMoyenne() +"</td>")	;
		out.println("</tr>")	;
		}
		%>
			
		</tbody>
	</table>
	
	
	
</body>
</html>