/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import Interfaces.CommandRegistro;
import PokemonAdapter.Pokemon;


/**
 *
 * @author jairo
 */
public class InvokerRegistro {
    
    private CommandRegistro command;
    
    public InvokerRegistro(CommandRegistro command){
        this.command=command;
    }
    
    public void run(Pokemon pokemon){
        command.execute(pokemon);
    }
    
}
