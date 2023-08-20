/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.contenedor;

/**
 *
 * @author Ana
 */
public class EjercicioContenedor {

    public static void main(String[] args) {
        Contenedor c = new Contenedor();
        c.anyadir(new Carta(1001, "Gandia", "Valencia"));
        c.anyadir(new Carta(1000, "Gandia", "Catamarruc"));
        c.anyadir(new Paquete(1002, "Gandia", "Valencia", 100));
        c.anyadir(new Paquete(1003, "Gandia", "Murcia", 101));
        c.anyadir(new Carta(1004, "Gandia", "Castellón"));
        c.anyadir(new Paquete(1005, "Gandia", "Alicante", 150));
        System.out.println("destino de id = 1001:" + c.buscarEnvio(1001).getDestino());
    }

}
