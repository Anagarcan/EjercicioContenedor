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
public abstract class Envio {

    protected int id; 
    protected String origen;
    protected String destino;

    public Envio(int id, String origen, String destino) { 
        this.id = id;
        this.origen = origen;
        this.destino = destino;
    }

    public int getId() {
        return id;
    }

    public String getOrigen() {
        return origen;
    }

    public String getDestino() {
        return destino;
    }

}
