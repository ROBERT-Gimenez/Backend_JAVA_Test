package com.backend.test;

import com.backend.model.Articulo;
import com.backend.service.ControladorCalidad;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ControlCalidadTest {


    private final ControladorCalidad controladorCalidad = new ControladorCalidad();

    @Test
    void alNoPasarElControlDeLote_noDeberiaPasarElControlDeCalidad() {
        //arrange
        Articulo art1 = new Articulo("Articulo 1", 800, 1250, "sano");

        //act
        controladorCalidad.comprobarCalidad(art1);

        //assert
        assertFalse(art1.isAceptado());
    }

    @Test
    void deberiaPasarElControlCalidad() {
        //arrange
        Articulo art2 = new Articulo("Articulo 2", 1500, 1200, "casi sano");

        //act
        controladorCalidad.comprobarCalidad(art2);

        //assert
        assertTrue(art2.isAceptado());
    }

}