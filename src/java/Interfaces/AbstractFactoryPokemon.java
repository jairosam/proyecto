/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import PokemonAdapter.Pokemon;

/**
 *
 * @author jairo
 */
public interface AbstractFactoryPokemon {
    
    public Pokemon crear_pokemon(String tipo);
    
}
