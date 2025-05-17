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

public class Veneno extends ObjetoQueCae {
    public Veneno(int x, int velocidad, Image imagen) {
        super(x, velocidad, imagen);
    }

    @Override
    public int getPuntos() {
        return -2;
    }
}
