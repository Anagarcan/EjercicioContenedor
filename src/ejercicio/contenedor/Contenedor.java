/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.contenedor;

import java.util.ArrayList;


public class Contenedor {

    private ArrayList <Envio> losEnvios; 

    public Contenedor() { 
        losEnvios = new ArrayList<>(); 
    }

    public void anyadir(Envio e) {
        for (int i = 0; i <= losEnvios.size() - 1; i++) {  
            if (e.getId() == losEnvios.get(i).getId()) 
            
            {
                throw new Error("No se pueden repetir los ID'S");
            }
        }
        losEnvios.add(e);
    }

    public Envio buscarEnvio(int id) { 

        for (int i = 0; i <= losEnvios.size() - 1; i++) {
            if (id == losEnvios.get(i).getId()) {
                return losEnvios.get(i);
            }
        }
        return null;
    }
}
