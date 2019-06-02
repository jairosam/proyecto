<%-- 
    Document   : consultaNombre
    Created on : 3/03/2019, 08:57:48 PM
    Author     : jairo
--%>


<%@page import="PokemonAdapter.Pokemon"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="Datos.InvokerConsulta"%>
<%@page import="Datos.DBPokemon"%>
<%@page import="Datos.ConsultaNombre"%>
<%@page import="Interfaces.CommandConsulta"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
CommandConsulta command=new ConsultaNombre(new DBPokemon());
InvokerConsulta invoker=new InvokerConsulta(command);
String nombre=request.getParameter("name");
ResultSet res=invoker.run(nombre);
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Pokemon</title>
        <link rel="StyleSheet" type="text/css" href="indexCSS.css">
        <link rel="shortcut icon" type="image/png" href="imagenes/pokeball.png">
    </head>
    <body>
        
        <table align="center">
            <%if(res.next()){%>
            <h1 align="center">pokemon <% out.println(nombre); %></h1>
            <tr>
                <td align="center" colspan="8">
                    <div align="center"><img src="imagenes/<%=nombre%>.png" width="350" height="350"/></div>
                </td>
            </tr>
            <tr><td>id</td><td>Nombre</td><td>Tipo</td><td>Vida</td><td>Ataque</td><td>Defensa</td>
                <td>descripcion</td><td>vulnerable</td></tr>        
            <tr>
                <td><%= res.getInt("id") %></td>
                <td><%= res.getString("nombre")%></td>
                <td><%= res.getString("tipo")%></td>
                <td><%= res.getString("vida")%></td>
                <td><%= res.getInt("ataque")%></td>
                <td><%= res.getInt("defensa")%></td>
                <td><%= res.getString("descripcion")%></td>
                <td><%= res.getString("vulnerable")%></td>>
            </tr>
            <%}else{%>
            <h1 align="center">El pokemon no se encuentra en la pokedex</h1>
            <%}%>
        </table>
    </body>
</html>
