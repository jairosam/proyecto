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
public interface CommandConsulta {
    
    public ResultSet execute(String consulta) throws SQLException;

}
