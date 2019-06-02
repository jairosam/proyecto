/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import Datos.DBPokemon;
import Datos.InvokerConsulta;
import Datos.InvokerRegistro;
import Datos.Registrar;
import Datos.Validar;
import Interfaces.AbstractFactoryPokemon;
import Interfaces.CommandConsulta;
import Interfaces.CommandRegistro;
import PokemonAdapter.AceroAdapter;
import PokemonAdapter.AguaAdapter;
import PokemonAdapter.DragonAdapter;
import PokemonAdapter.ElectricoAdapter;
import PokemonAdapter.FactoryPokemon;
import PokemonAdapter.FuegoAdapter;
import PokemonAdapter.PlantaAdapter;
import PokemonAdapter.Pokemon;
import PokemonAdapter.RocaAdapter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author jairo
 */
public class PokemonServlet extends HttpServlet{

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            CommandRegistro commandRegister=new Registrar(new DBPokemon());
            CommandConsulta commandConsulta=new Validar(new DBPokemon());
            InvokerRegistro invokerRegistro=new InvokerRegistro(commandRegister);
            InvokerConsulta invokerConsulta=new InvokerConsulta(commandConsulta);
            AbstractFactoryPokemon crear_pokemon=new FactoryPokemon();
            String tipo=request.getParameter("tipo");
            
            Pokemon pokemon=crear_pokemon.crear_pokemon(tipo);
            pokemon.setNombre(request.getParameter("nombre").toLowerCase());
            pokemon.setTipo(tipo);
            pokemon.setAtaque(Integer.parseInt(request.getParameter("ataque")));
            pokemon.setDefensa(Integer.parseInt(request.getParameter("defensa")));
            pokemon.setVida(Integer.parseInt(request.getParameter("vida")));
            
            ResultSet validar=invokerConsulta.run(pokemon.getNombre());
            if(validar==null){
                switch (tipo) {
                    case "Agua":
                        AguaAdapter agua=(AguaAdapter) pokemon;
                        agua.añadir_habilidad();
                        agua.añadir_vulnerabilidad();
                        agua.describir();
                        invokerRegistro.run(pokemon);
                        pokemon.limpiar_habilidades();
                        break;
                    case "Dragon":
                        DragonAdapter dragon=(DragonAdapter) pokemon;
                        dragon.añadir_habilidad();
                        dragon.añadir_vulnerabilidad();
                        dragon.describir();
                        invokerRegistro.run(pokemon);
                        pokemon.limpiar_habilidades();
                        break;
                    case "Planta":
                        PlantaAdapter planta=(PlantaAdapter) crear_pokemon.crear_pokemon(tipo);
                        planta.añadir_habilidad();
                        planta.añadir_vulnerabilidad();
                        planta.describir();
                        invokerRegistro.run(pokemon);
                        pokemon.limpiar_habilidades();
                        break;
                    case "Fuego":
                        FuegoAdapter fuego=(FuegoAdapter) pokemon;
                        fuego.añadir_habilidad();
                        fuego.añadir_vulnerabilidad();
                        fuego.describir();
                        invokerRegistro.run(pokemon);
                        fuego.getHabilidades().clear();
                        break;
                    case "Electrico":
                        ElectricoAdapter electrico=(ElectricoAdapter) pokemon;
                        electrico.añadir_habilidad();
                        electrico.añadir_vulnerabilidad();
                        electrico.describir();
                        invokerRegistro.run(pokemon);
                        pokemon.limpiar_habilidades();
                        break;
                    case "Roca":
                        RocaAdapter roca=(RocaAdapter) pokemon;
                        roca.añadir_habilidad();
                        roca.añadir_vulnerabilidad();
                        roca.describir();
                        invokerRegistro.run(pokemon);
                        pokemon.limpiar_habilidades();
                        break;
                    case "Acero":
                        AceroAdapter acero=(AceroAdapter) pokemon;
                        acero.añadir_habilidad();
                        acero.añadir_vulnerabilidad();
                        acero.describir();
                        invokerRegistro.run(pokemon);
                        pokemon.limpiar_habilidades();
                        break;
                    default:
                        break;
                }
                response.sendRedirect("index.jsp");
            }else{
                out.println("<h1 align='center'>El pokemon ya se encuentra registrado en la"
                        + " Pokedex</h1>");
                out.println("<div align='center'><a href='index.jsp'>Volver</div>");
            }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
