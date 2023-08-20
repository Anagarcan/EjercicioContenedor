/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.contenedor;

import java.util.ArrayList;


public class Contenedor {

    private ArrayList <Envio> losEnvios; //ArrayList privado de tipo envio que se llama losEnvios

    public Contenedor() { //Si yo tengo que crear el contenedor significa que me va a tener que crear ese ArrayList para que esté vació 
        losEnvios = new ArrayList<>(); //Constructor
    }

    public void anyadir(Envio e) {
        for (int i = 0; i <= losEnvios.size() - 1; i++) { //Bucle para recorrer todo el ArrayList 
            if (e.getId() == losEnvios.get(i).getId()) //Necesito un get destino y un get origen 
            //como no es un metodo que devuelva no se pone return
            {
                throw new Error("No se pueden repetir los ID'S");
            }
        }
        losEnvios.add(e);
    }

    public Envio buscarEnvio(int id) { //no puedo crear un objeto de tipo envio porque es una clase abstracta

        for (int i = 0; i <= losEnvios.size() - 1; i++) {
            if (id == losEnvios.get(i).getId()) {
                return losEnvios.get(i);
            }
        }
        return null;
    }
}
