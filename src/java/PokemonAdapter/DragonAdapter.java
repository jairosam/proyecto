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
public class DragonAdapter extends Pokemon implements GestionarPokemon{
    
    static DragonAdapter pokemon;
    
    private DragonAdapter(){
        super();
    }
    
    public static DragonAdapter getInstance(){
        if(pokemon==null){
            pokemon=new DragonAdapter();
        }
        return pokemon;
    }

    public String furia_dragon(){
        return "furia dragon";
    }
    
    public String garra_dragon(){
        return "garra dragon";
    }
    
    public String cola_dragon(){
        return "cola dragon";
    }
    
    @Override
    public void añadir_habilidad() {
        int random=(int)Math.random()*15;
        if(random>5){
            this.getHabilidades().add(furia_dragon());
            this.getHabilidades().add(garra_dragon());
        }else if(random>=5 && random<10){
            this.getHabilidades().add(garra_dragon());
            this.getHabilidades().add(cola_dragon());
        }else{
            this.getHabilidades().add(cola_dragon());
            this.getHabilidades().add(furia_dragon());
        }
    }

    @Override
    public void añadir_vulnerabilidad() {
        this.setVulnerable("Acero");
    }
}
