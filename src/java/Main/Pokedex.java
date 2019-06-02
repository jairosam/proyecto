/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Datos.DBConexion;
import Datos.DBPokemon;
import Datos.InvokerConsulta;
import Datos.InvokerRegistro;
import Datos.Registrar;
import Datos.Validar;
import Interfaces.AbstractFactoryPokemon;
import Interfaces.CommandConsulta;
import Interfaces.CommandRegistro;
import PokemonAdapter.AguaAdapter;
import static PokemonAdapter.AguaAdapter.pokemon;
import PokemonAdapter.ElectricoAdapter;
import PokemonAdapter.FactoryPokemon;
import PokemonAdapter.Pokemon;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jairo
 */
public class Pokedex {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    }
    
}
