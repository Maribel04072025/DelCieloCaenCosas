/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.DelCieloCaenCosas.modelo;

/**
 *
 * @author marib
 */
import java.awt.Image;
import java.awt.Rectangle;

public abstract class ObjetoQueCae {
    protected int x, y, velocidad;
    protected Image imagen;

    public ObjetoQueCae(int x, int velocidad, Image imagen) {
        this.x = x;
        this.y = 0;
        this.velocidad = velocidad;
        this.imagen = imagen;
    }

    public void mover() {
        y += velocidad;
    }

    public Rectangle getBounds() {
        return new Rectangle(x, y, imagen.getWidth(null), imagen.getHeight(null));
    }

    public Image getImagen() {
        return imagen;
    }

    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }

    public abstract int getPuntos(); // +1 o -2
}