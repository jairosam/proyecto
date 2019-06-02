/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import PokemonAdapter.Pokemon;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author jairo
 */
public interface BaseDatos {
    
    public ResultSet consultar(String tipo) throws SQLException;
    public void registrar(Pokemon pokemon);
    public ResultSet validar(String consulta) throws SQLException;
    public ResultSet getPokemonByName(String nombre) throws SQLException; 
    
}
