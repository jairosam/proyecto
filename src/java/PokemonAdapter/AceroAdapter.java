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
public class AceroAdapter extends Pokemon implements GestionarPokemon{

    static AceroAdapter pokemon;
    
    private AceroAdapter(){
        super();
    }
    
    public static AceroAdapter getInstance(){
        if(pokemon==null){
            pokemon=new AceroAdapter();
        }
        return pokemon;
    }
    
    public String cabeza_hierro(){
        return "cabeza de hierro";
    }
    
    public String cuerpo_pesado(){
        return "cuerpo pesado";
    }
    
    public String energia_pura(){
        return "energia_pura";
    }
    
    @Override
    public void añadir_habilidad() {
        int random=(int) Math.random()*15;
        if(random>5){
            this.getHabilidades().add(cabeza_hierro());
            this.getHabilidades().add(cuerpo_pesado());
        }else if(random>=5 && random<10){
            this.getHabilidades().add(energia_pura());
            this.getHabilidades().add(cabeza_hierro());
        }else{
            this.getHabilidades().add(cuerpo_pesado());
            this.getHabilidades().add(energia_pura());
        }
    }

    @Override
    public void añadir_vulnerabilidad() {
        this.setVulnerable("Fuego");
    }
    
}
