/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PokemonAdapter;

import Interfaces.AbstractFactoryPokemon;

/**
 *
 * @author jairo
 */
public class FactoryPokemon implements AbstractFactoryPokemon{

    @Override
    public Pokemon crear_pokemon(String tipo) {
        if(tipo.equals("Agua")){
            AguaAdapter pokemon=AguaAdapter.getInstance();
            return pokemon;
        }else if(tipo.equals("Dragon")){
            DragonAdapter pokemon=DragonAdapter.getInstance();
            return pokemon;
        }else if(tipo.equals("Fuego")){
            FuegoAdapter pokemon=FuegoAdapter.getInstance();
            return pokemon;
        }else if(tipo.equals("Roca")){
            RocaAdapter pokemon=RocaAdapter.getInstance();
            return pokemon;
        }else if(tipo.equals("Acero")){
            Pokemon pokemon=AceroAdapter.getInstance();
            return pokemon;
        }else if(tipo.equals("Planta")){
            Pokemon pokemon=PlantaAdapter.getInstance();
            return pokemon;
        }else if(tipo.equals("Electrico")){
            Pokemon pokemon=ElectricoAdapter.getInstance();
            return pokemon;
        }else{
            return null;
        }
    }
    
}
