/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.DelCieloCaenCosas.modelo;

import java.awt.Image;

/**
 * Representa un objeto de tipo Comida que cae desde la parte superior de la pantalla.
 * Esta clase extiende la clase {@link ObjetoQueCae} e indica que otorga puntos al jugador.
 * 
 * @author maribel ceballos
 * @version 20250518
 * @since 1.0
 */
public class Comida extends ObjetoQueCae {

    /**
     * Crea una nueva instancia de Comida.
     *
     * @param x        Posición horizontal inicial del objeto.
     * @param velocidad Velocidad de caída del objeto.
     * @param imagen   Imagen que representa visualmente la comida.
     */
    public Comida(int x, int velocidad, Image imagen) {
        super(x, velocidad, imagen);
    }

    /**
     * Retorna la cantidad de puntos que otorga este objeto al jugador.
     * 
     * @return 1 punto por cada comida recogida.
     */
    @Override
    public int getPuntos() {
        return 1;
    }
}