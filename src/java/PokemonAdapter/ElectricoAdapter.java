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
public class ElectricoAdapter extends Pokemon implements GestionarPokemon{

    static ElectricoAdapter pokemon;
    
    private ElectricoAdapter(){
        super();
    }
    
    public static ElectricoAdapter getInstance(){
        if(pokemon==null){
            pokemon=new ElectricoAdapter();
        }
        return pokemon;
    }
    
    public String impactrueno(){
        return "impactrueno";
    }
    
    public String onda_trueno(){
        return "onda trueno";
    }
    
    public String puño_trueno(){
        return "puño trueno";
    }
    
    @Override
    public void añadir_habilidad() {
        int random=(int)Math.random()*10;
        if(random>5){
            this.getHabilidades().add(puño_trueno());
            this.getHabilidades().add(impactrueno());
        }else{
            this.getHabilidades().add(impactrueno());
            this.getHabilidades().add(onda_trueno());
        }
    }

    @Override
    public void añadir_vulnerabilidad() {
        this.setVulnerable("Roca");
    }
    
}
