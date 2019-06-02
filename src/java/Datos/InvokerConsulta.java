/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import Interfaces.CommandConsulta;
import PokemonAdapter.Pokemon;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author jairo
 */
public class InvokerConsulta {
    
    private CommandConsulta command;
    
    public InvokerConsulta(CommandConsulta command){
        this.command=command;
    }
    
    public ResultSet run(String consulta) throws SQLException{
        ResultSet res=command.execute(consulta);
        return res;
    }
}
