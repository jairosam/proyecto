/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PokemonAdapter;

import Interfaces.AbstractFactoryPokemon;
import java.util.ArrayList;

/**
 *
 * @author jairo
 */
public abstract class Pokemon{
    
    private String nombre;
    private String tipo;
    private int ataque,defensa;
    private String vulnerable;
    private ArrayList<String> habilidades;
    private String descripcion;
    private int vida;
    
    public Pokemon(){
        this.ataque=0;
        this.defensa=0;
        this.habilidades=new ArrayList<String>();
        this.nombre="";
        this.tipo="";
        this.descripcion="";
        this.vulnerable="";
        this.vida=0;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public String getVulnerable() {
        return vulnerable;
    }

    public void setVulnerable(String vulnerable) {
        this.vulnerable = vulnerable;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public ArrayList<String> getHabilidades() {
        return habilidades;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public void describir(){
        for(int i=0;i<this.getHabilidades().size()-1;i++){
            this.descripcion+="habilidades: "+this.getHabilidades().get(i)+", ";
        }
        int tamaño=this.getHabilidades().size()-1;
        this.descripcion+=this.getHabilidades().get(tamaño);
    }
    
    public void limpiar_habilidades(){
        for(int i=0;i<this.getHabilidades().size();i++){
            this.getHabilidades().remove(i);
        }
    }
}
