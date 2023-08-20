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

    private int peso; //No es protegido porque no hay ninguna clase que herede de nosotros y tenga que acceder a ella

    public Paquete (int id, String origen, String destino, int peso) { //Constructor
        super(id, origen, destino); //A envio envía el id, origen y destino
        this.peso = peso; //Esto se queda en esta clase, sólo es característica (atributo de paquete)
    }

    public int getPeso() {
        return peso;
    }

}
