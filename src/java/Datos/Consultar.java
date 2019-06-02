/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import Interfaces.BaseDatos;
import Interfaces.CommandConsulta;
import PokemonAdapter.Pokemon;
import Interfaces.CommandRegistro;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author jairo
 */
public class Consultar implements CommandConsulta{
    
    private BaseDatos base;
    
    public Consultar(BaseDatos base){
        this.base=base;
    }

    @Override
    public ResultSet execute(String tipo) throws SQLException {
        ResultSet res=base.consultar(tipo);
        return res;
    }

}
