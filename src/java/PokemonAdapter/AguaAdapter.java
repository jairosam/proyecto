/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PokemonAdapter;

import Interfaces.GestionarPokemon;

/**
 *
 * @author jairo
 */
public class AguaAdapter extends Pokemon implements GestionarPokemon{
    
    public static AguaAdapter pokemon;
    
    private AguaAdapter(){
        super();
    }
    
    public static AguaAdapter getInstance(){
        if(pokemon==null){
            pokemon=new AguaAdapter();
        }
        return pokemon;
    }
    
    public String hidro_bomba(){
        return "Hidro bomba";
    }

    public String chorro_agua(){
        return "chorro de agua";
    }
    
    public String burbujas(){
        return "burbujas";
    }
    
    @Override
    public void añadir_habilidad() {
        int random=(int)Math.random()*15;
        if(random>5){
            this.getHabilidades().add(hidro_bomba());
            this.getHabilidades().add(burbujas());
        }else if(random>=5 && random<10){
            this.getHabilidades().add(burbujas());
            this.getHabilidades().add(chorro_agua());
        }else{
            this.getHabilidades().add(chorro_agua());
            this.getHabilidades().add(hidro_bomba());
        }
    }

    @Override
    public void añadir_vulnerabilidad() {
        this.setVulnerable("Electrico");
    }
   
}
