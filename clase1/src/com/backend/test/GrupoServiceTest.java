package com.backend.test;

import com.backend.model.Persona;
import com.backend.service.GrupoService;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

    class GrupoServiceTest {

    private final GrupoService GRUPO_SERVICE = new GrupoService(new ArrayList<>());

    @Test
    public void dadasCincoPersonas_deberiaResultarUnaColleccionDDosObjetos(){
        //arrange
        Persona persona1 = new Persona("Juan",20);
        Persona persona2 = new Persona("perdo",20);
        Persona persona4 = new Persona("ana",20);
        Persona persona5 = new Persona("LUZ",20);
        Persona persona3 = new Persona("JULIAN",20);

        //act
        GRUPO_SERVICE.admitirPersona(persona1);
        GRUPO_SERVICE.admitirPersona(persona2);
        GRUPO_SERVICE.admitirPersona(persona3);
        GRUPO_SERVICE.admitirPersona(persona4);
        GRUPO_SERVICE.admitirPersona(persona5);
        //assert
        assertEquals(2, GRUPO_SERVICE.getAdmitidos().size());

    }
}