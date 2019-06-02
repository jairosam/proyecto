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
public class RocaAdapter extends Pokemon implements GestionarPokemon{
    
    static RocaAdapter pokemon;
    
    private RocaAdapter(){
        super();
    }
    
    public static RocaAdapter getInstance(){
        if(pokemon==null){
            pokemon=new RocaAdapter();
        }
        return pokemon;
    }
    
    public String terremoto(){
        return "terremoto";
    }
    
    public String corte(){
        return "corte";
    }

    public String tumba_rocas(){
        return "tumba rocas";
    }
    
    @Override
    public void añadir_habilidad() {
        int random=(int)Math.random()*15;
        if(random>5){
            this.getHabilidades().add(terremoto());
            this.getHabilidades().add(corte());
        }else if(random>=5 && random<10){
            this.getHabilidades().add(corte());
            this.getHabilidades().add(tumba_rocas());
        }else{
            this.getHabilidades().add(tumba_rocas());
            this.getHabilidades().add(terremoto());
        }
    }

    @Override
    public void añadir_vulnerabilidad() {
        this.setVulnerable("Planta");
    }
    
}
