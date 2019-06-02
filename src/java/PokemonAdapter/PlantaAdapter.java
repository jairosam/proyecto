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
public class PlantaAdapter extends Pokemon implements GestionarPokemon{
    
    static PlantaAdapter pokemon;
    
    private PlantaAdapter(){
        super();
    }
    
    public static PlantaAdapter getInstance(){
        if(pokemon==null){
            pokemon=new PlantaAdapter();
        }
        return pokemon;
    }    
    
    public String latigo_cepa(){
        return "latigo cepa";
    }
    
    public String somnifero(){
        return "somnifero";
    }
    
    public String polvo_veneno(){
        return "polvo_veneno";
    }
    
    @Override
    public void añadir_habilidad() {
        int random=(int)Math.random()*15;
        if(random<5){
            this.getHabilidades().add(somnifero());
            this.getHabilidades().add(latigo_cepa());
        }else if(random>=5 && random<10){
            this.getHabilidades().add(latigo_cepa());
            this.getHabilidades().add(polvo_veneno());
        }else{
            this.getHabilidades().add(somnifero());
            this.getHabilidades().add(polvo_veneno());
        }
    }

    @Override
    public void añadir_vulnerabilidad() {
        this.setVulnerable("Fuego");
    }
    
}
