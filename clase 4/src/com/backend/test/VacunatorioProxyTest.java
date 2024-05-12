package com.backend.test;

import com.backend.module.Persona;
import com.backend.service.impl.VacunatorioProxy;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class VacunatorioProxyTest {
    private VacunatorioProxy vacunatorioProxy = new VacunatorioProxy();

    @Test
    void siLaPersonaAsisteAntesDeLaFechaAsignada_noDeberiaSerVacunada(){
        //arrange
        Persona persona = new Persona("robert","42037181", LocalDate.of(2024, 7, 3), "AntiGripal");

        String resp = "La fecha no se corresponde con la fecha asignada";
        //act
        String respObtenida = vacunatorioProxy.Vacunar(persona);

        //assert

        assertEquals(resp, respObtenida);
    }
   @Test
    void siLaPersonaAsisteOPocoDespuesDeLaFechaAsignada_deberiaSerVacunada(){
        //arrange
        Persona persona = new Persona("robert","42037181", LocalDate.of(2024, 5, 3), "AntiGripal");

        String resp = "Se ha registrado a la persona con DNI 42037181, fue vacunada el dia 2024-05-12 con la vacuna AntiGripal";
        //act
        String respObtenida = vacunatorioProxy.Vacunar(persona);

        //assert
        assertEquals(resp, respObtenida);
    }

}