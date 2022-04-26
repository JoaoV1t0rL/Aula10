<%-- 
    Document   : index
    Created on : 25 de abr. de 2022, 20:57:36
    Author     : Vitor
--%>

<%@page import="Classes.Horario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    Horario hora = new Horario();
    
    hora.setTempo(23, 04, 25);
    
    Horario horaD = new Horario();
    horaD.setTempo(15, 40, 00);
%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Tarefa10</title>
    </head>
    <body>
        <a href="outros.jsp">Minhas informações</a>
        <hr>
        <h1>Teste</h1>
        <h2>Horario de entrada: <%= hora.retornoString() %></h2>
        <h2>Horario intervalo: <%= horaD.retornoString() %> </h2>
        

    </body>
</html>
