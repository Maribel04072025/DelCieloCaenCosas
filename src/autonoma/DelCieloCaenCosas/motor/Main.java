/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.DelCieloCaenCosas.motor;

/**
 *
 * @author marib
 */
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame ventana = new JFrame("¡Atrapa comida, evita veneno!");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.add(new JuegoCae());
        ventana.pack();
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
    }
}
