package com.backend.service.impl;

import com.backend.module.Persona;
import com.backend.service.Vacunatorio;

import java.time.LocalDate;

public class VacunatorioService implements Vacunatorio {

    @Override
    public String Vacunar(Persona persona) {
        System.out.println("Recibiendo a " + persona.getNombre() + "...");
        return "Se ha registrado a la persona con DNI " + persona.getDni() + ", fue vacunada el dia " + LocalDate.now() + " con la vacuna " + persona.getVacuna();
    }
}
