package com.backend.service;

import com.backend.handlers.ControlCalidad;
import com.backend.handlers.ControlEnvase;
import com.backend.handlers.ControlLote;
import com.backend.handlers.ControlPeso;
import com.backend.model.Articulo;

public class ControladorCalidad {

    //se encarga de iniciar el proceso, por ende la cadena
    private ControlCalidad controlCalidad;

    public ControladorCalidad() {
        //definir el orden de la cadena
        //inicio
        controlCalidad = new ControlEnvase();

        //segundo eslabon
        ControlCalidad controlLote = new ControlLote();
        controlCalidad.setSiguienteControl(controlLote);

        //tercer eslabon
        ControlCalidad controlPeso = new ControlPeso();
        controlLote.setSiguienteControl(controlPeso);
    }


    public void comprobarCalidad(Articulo articulo) {
        controlCalidad.comprobarCalidad(articulo);
    }

}