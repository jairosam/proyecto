<%-- 
    Document   : index
    Created on : 25/02/2019, 09:14:59 PM
    Author     : jairo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Inicio</title>
        <link rel="StyleSheet" type="text/css" href="Form.css">
        <link rel="shortcut icon" type="image/png" href="imagenes/pokeball.png">
    </head>
    <div align="center"><img src="imagenes/pokeball.png" width="300" height="300"/></div>
    <body>
        <h1 align="center">BIENVENIDO A TU POKEDEX</h1>
        <form id="registro" name="pokemon" action="PokemonServlet" method="post">
            <table align="center" border="+2">
                <tr>
                    <td>Nombre:</td>
                    <td><input type="text" id="nombre" name="nombre" required></td>
                </tr>
                <tr>
                    <td>Tipo:</td>
                    <td align="center">
                        <select name="tipo" id="tipo">
                            <option>Agua</option>
                            <option>Dragon</option>
                            <option>Planta</option>
                            <option>Fuego</option>
                            <option>Electrico</option>
                            <option>Roca</option>
                            <option>Acero</option>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td>PTOS vida</td>
                    <td align="center"><input type="number" min="0" max="100" name="vida" id="vida" required></td>
                </tr>
                <tr>
                    <td>PTOS Ataque</td>
                    <td align="center"><input min="0" max="100" type="number" id="ataque" name="ataque" required></td>
                </tr>
                <tr>
                    <td>PTOS Defensa</td>
                    <td align="center"><input min="0" max="100" type="number" id="defensa" name="defensa" required></td>
                </tr>
                <tr>
                    <td align="center" colspan="2"><input type="submit" ></td>
                </tr>
            </table>
        </form>
        <h1 align="center">Filtra los pokemons</h1>
        <h3 align="center">Por tipo</h3>
        <form id="consulta" name="consulta" method="post" action="Consultar.jsp">
            <table align="center">
                <tr><td>
                    <select id="tipoConsulta" name="tipoConsulta">
                        <option>Agua</option>
                        <option>Dragon</option>
                        <option>Planta</option>
                        <option>Fuego</option>
                        <option>Electrico</option>
                        <option>Roca</option>
                        <option>Acero</option>
                    </select>
                </td></tr>
                <tr>
                    <td><input type="submit" value="Consultar"></td>
                </tr>
            </table>
        </form>
        <h3 align="center">Por nombre</h3>
        <form id="consultaName" name="consultaName" action="consultaNombre.jsp" method="post">
            <table align="center">
                <tr>
                    <td>Consulta Por Nombre</td>
                    <td><input type="text" name="name" id="name" required></td>
                </tr>
                <tr>
                    <td align="center" colspan="2"><input type="submit" value="Consultar"</td>
                </tr>
            </table>
        </form>
    </body>
</html>
