/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.DelCieloCaenCosas.modelo;

import java.awt.Image;
import java.awt.Rectangle;

/**
 * Clase abstracta que representa un objeto que cae desde la parte superior de la pantalla.
 * Esta clase es la base para elementos como {@link Comida} y {@link Veneno}.
 * Define la posición, velocidad, imagen y comportamiento básico de movimiento.
 * 
 * @author maribel ceballos
 * @version 20250518
 * @since 1.0
 */
public abstract class ObjetoQueCae {
    
    /** Posición horizontal del objeto */
    protected int x;
    
    /** Posición vertical del objeto */
    protected int y;
    
    /** Velocidad con la que el objeto cae */
    protected int velocidad;
    
    /** Imagen que representa visualmente al objeto */
    protected Image imagen;

    /**
     * Crea un nuevo objeto que cae desde la parte superior de la pantalla.
     *
     * @param x         Posición horizontal inicial del objeto.
     * @param velocidad Velocidad de caída del objeto.
     * @param imagen    Imagen que representa visualmente el objeto.
     */
    public ObjetoQueCae(int x, int velocidad, Image imagen) {
        this.x = x;
        this.y = 0;
        this.velocidad = velocidad;
        this.imagen = imagen;
    }

    /**
     * Mueve el objeto hacia abajo según su velocidad.
     */
    public void mover() {
        y += velocidad;
    }

    /**
     * Retorna los límites del objeto como un rectángulo.
     * Se utiliza normalmente para detectar colisiones.
     *
     * @return Un {@link Rectangle} que representa el área ocupada por el objeto.
     */
    public Rectangle getBounds() {
        return new Rectangle(x, y, 60, 60); 
    }

    /**
     * Retorna la imagen del objeto.
     *
     * @return Imagen del objeto.
     */
    public Image getImagen() {
        return imagen;
    }

    /**
     * Retorna la posición vertical actual del objeto.
     *
     * @return Valor entero que indica la coordenada Y.
     */
    public int getY() {
        return y;
    }

    /**
     * Retorna la posición horizontal actual del objeto.
     *
     * @return Valor entero que indica la coordenada X.
     */
    public int getX() {
        return x;
    }

    /**
     * Método abstracto que retorna los puntos asociados al objeto.
     * Las subclases deben implementar este método para definir si 
     * el objeto suma o resta puntos al jugador.
     *
     * @return Puntos que otorga o penaliza el objeto.
     */
    public abstract int getPuntos(); // +1 o -2
}