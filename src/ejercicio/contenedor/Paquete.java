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
public class Paquete extends Envio {

    private int peso;

    public Paquete (int id, String origen, String destino, int peso) { 
        super(id, origen, destino); 
        this.peso = peso; 
    }

    public int getPeso() {
        return peso;
    }

}
