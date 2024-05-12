package com.backend.service.impl;

import com.backend.module.Persona;
import com.backend.service.Vacunatorio;

import java.time.LocalDate;

public class VacunatorioProxy  implements Vacunatorio {
    private VacunatorioService vacunatorioService;


    @Override
    public String Vacunar(Persona persona) {

        String respuesta = "La fecha no se corresponde con la fecha asignada";
        if (validaFecha(persona.getFechaAsignada())){
            vacunatorioService = new VacunatorioService();
            return vacunatorioService.Vacunar(persona);
        }
        return respuesta;
    }

    private boolean validaFecha(LocalDate fecha){
        LocalDate hoy = LocalDate.now();
        return !hoy.isBefore(fecha);
    }

}
