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
public class FuegoAdapter extends Pokemon implements GestionarPokemon{
    
    static FuegoAdapter pokemon;
    
    private FuegoAdapter(){
        super();
    }

    public static FuegoAdapter getInstance(){
        if(pokemon==null){
            pokemon=new FuegoAdapter();
        }
        return pokemon;
    }
    
    public String lanzallamas(){
        return "lanzallamas";
    }
    
    public String quemadura(){
        return "quemadura";
    }
    
    public String ascuas(){
        return "ascuas";
    }
    
    @Override
    public void añadir_habilidad() {
        int random=(int)Math.random()*15;
        if(random>5){
            this.getHabilidades().add(lanzallamas());
            this.getHabilidades().add(quemadura());
        }else if(random>=5 && random<10){
            this.getHabilidades().add(quemadura());
            this.getHabilidades().add(ascuas());
        }else{
            this.getHabilidades().add(lanzallamas());
            this.getHabilidades().add(ascuas());
        }
    }

    @Override
    public void añadir_vulnerabilidad() {
        this.setVulnerable("Agua");
    }
    
    
    
}
