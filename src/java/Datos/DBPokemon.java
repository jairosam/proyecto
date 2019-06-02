/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import Interfaces.BaseDatos;
import PokemonAdapter.Pokemon;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jairo
 */
public class DBPokemon implements BaseDatos{
    
    DBConexion db;
    
    public DBPokemon(){
        db=new DBConexion();
    }

    @Override
    public void registrar(Pokemon pokemon) {
        String sql="insert into pokemon (nombre,"
                + "tipo,"
                + "vida,"
                + "ataque,"
                + "defensa,"
                + "descripcion,"
                + "vulnerable)"
                + "values(?,?,?,?,?,?,?)";
        try {
            PreparedStatement pstm=db.getConexion().prepareStatement(sql);
            pstm.setString(1, pokemon.getNombre());
            pstm.setString(2, pokemon.getTipo());
            pstm.setInt(3, pokemon.getVida());
            pstm.setInt(4, pokemon.getAtaque());
            pstm.setInt(5, pokemon.getDefensa());
            pstm.setString(6, pokemon.getDescripcion());
            pstm.setString(7, pokemon.getVulnerable());
            
            pstm.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    @Override
    public ResultSet consultar(String tipo) throws SQLException {
        String sql="select * from pokemon where tipo = ?";
        PreparedStatement pstm=db.getConexion().prepareStatement(sql);
        pstm.setString(1, tipo);
        ResultSet res=pstm.executeQuery();
        return res;
    }

    @Override
    public ResultSet validar(String nombre) throws SQLException {
        String sql="select * from pokemon where nombre = ?";
        PreparedStatement pstm=db.getConexion().prepareStatement(sql);
        pstm.setString(1, nombre);
        ResultSet res=pstm.executeQuery();
        if(res.next()){
            return res;
        }else{
            return null;
        }
    }

    @Override
    public ResultSet getPokemonByName(String nombre) throws SQLException {
        String sql="select * from pokemon where nombre = ?";
        PreparedStatement pstm=db.getConexion().prepareStatement(sql);
        pstm.setString(1, nombre);
        ResultSet res=pstm.executeQuery();
        return res;
    }
    
}
