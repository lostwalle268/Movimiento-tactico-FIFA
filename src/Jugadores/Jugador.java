/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Jugadores;

/**
 *
 * @author tuori
 */
public class Jugador {
    
    private String nombre;
    private int velocidad;
    private int remate ;
    private int posecion;
    private int defensa = (remate + posecion)/ 2;
    public boolean balon;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
    
    
    
}
