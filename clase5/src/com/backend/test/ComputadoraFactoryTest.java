package com.backend.test;

import com.backend.model.Computadora;
import com.backend.service.ComputadoraFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComputadoraFactoryTest {

    private ComputadoraFactory computadoraFactory = new ComputadoraFactory();

    @Test
    void noDeberiaAgregarLaComputadoraCuandoYaHayUnaConLaMismaEspecificacion(){
        Computadora computador1 =  computadoraFactory.obtenerComputadora(12, 500);
        Computadora computador2 = computadoraFactory.obtenerComputadora(12, 500);

        int stock = Computadora.getContador();

        assertEquals(1, stock);
    }

}