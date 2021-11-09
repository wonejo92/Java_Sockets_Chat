/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comunicacion.SOCKETS;

/**
 *
 * @author ismae
 */
public class main { 
    public static void main(String[] args) {
        Cliente cli = new Cliente();
        Cliente2 cli2 = new Cliente2();
        Servidor ser = new Servidor();
        ser.setVisible(true);
        cli.setVisible(true);
        cli2.setVisible(true);
    }
}
