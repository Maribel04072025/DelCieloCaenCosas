/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.DelCieloCaenCosas.modelo;

import java.awt.Image;

/**
 * Representa un objeto de tipo Veneno que cae desde la parte superior de la pantalla.
 * Esta clase extiende la clase {@link ObjetoQueCae} e indica que penaliza al jugador con puntos negativos.
 * 
 * @author maribel ceballos 
 * @version 20250518
 * @since 1.0
 */
public class Veneno extends ObjetoQueCae {

    /**
     * Crea una nueva instancia de Veneno.
     *
     * @param x         Posición horizontal inicial del objeto.
     * @param velocidad Velocidad de caída del objeto.
     * @param imagen    Imagen que representa visualmente el veneno.
     */
    public Veneno(int x, int velocidad, Image imagen) {
        super(x, velocidad, imagen);
    }

    /**
     * Retorna la cantidad de puntos que afecta este objeto al jugador.
     * 
     * @return -2 puntos por cada veneno recogido.
     */
    @Override
    public int getPuntos() {
        return -2;
    }
}