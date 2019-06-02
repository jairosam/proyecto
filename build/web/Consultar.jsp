<%-- 
    Document   : Consultar
    Created on : 2/03/2019, 09:32:37 PM
    Author     : jairo
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="PokemonAdapter.FactoryPokemon"%>
<%@page import="Interfaces.AbstractFactoryPokemon"%>
<%@page import="PokemonAdapter.Pokemon"%>
<%@page import="Datos.InvokerConsulta"%>
<%@page import="Datos.DBPokemon"%>
<%@page import="Datos.Consultar"%>
<%@page import="Interfaces.CommandConsulta"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
CommandConsulta command=new Consultar(new DBPokemon());
InvokerConsulta invoker=new InvokerConsulta(command);
String tipo=request.getParameter("tipoConsulta");
ResultSet res=invoker.run(tipo);
%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>POKEMONS</title>
        <link rel="StyleSheet" type="text/css" href="indexCSS.css">
        <link rel="shortcut icon" type="image/png" href="imagenes/pokeball.png">
    </head>
    <body>
        <h1 align="center">Lista Pokemons tipo <% out.println(tipo); %></h1>
        <table align="center" border="+2">
            <tr><td>id</td><td>Nombre</td><td>Tipo</td><td>Vida</td><td>Ataque</td><td>Defensa</td>
                <td>descripcion</td><td>vulnerable</td></tr>
            <%while(res.next()){%>
            <tr>
                <td><%= res.getInt("id") %></td>
                <td><%= res.getString("nombre")%></td>
                <td><%= res.getString("tipo")%></td>
                <td><%= res.getString("vida")%></td>
                <td><%= res.getInt("ataque")%></td>
                <td><%= res.getInt("defensa")%></td>
                <td><%= res.getString("descripcion")%></td>
                <td><%= res.getString("vulnerable")%></td>
            </tr>
            <%}%>
        </table>
        <div align="center"><a href="index.jsp">Volver</a></div>
    </body>
</html>
