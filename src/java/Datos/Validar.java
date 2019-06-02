/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import Interfaces.BaseDatos;
import Interfaces.CommandConsulta;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author jairo
 */
public class Validar implements CommandConsulta{

    private BaseDatos base;
   
    public Validar(BaseDatos base){
        this.base=base;
    }
    
    @Override
    public ResultSet execute(String consulta) throws SQLException {
        ResultSet res=base.validar(consulta);
        return res;
    }
    
}
