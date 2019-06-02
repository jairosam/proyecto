/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import Interfaces.BaseDatos;
import Interfaces.CommandRegistro;
import PokemonAdapter.Pokemon;

/**
 *
 * @author jairo
 */
public class Registrar implements CommandRegistro{

    private BaseDatos base;
    
    public Registrar(BaseDatos base){
        this.base=base;
    }
    
    @Override
    public void execute(Pokemon pokemon) {
        base.registrar(pokemon);
    }
    
}
