package com.backend.test;

import com.backend.model.Empleado;
import com.backend.model.EmpleadoContratado;
import com.backend.model.EmpleadoEfectivo;
import com.backend.service.LiquidadorEfectivo;
import com.backend.service.LiquidadorSueldo;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LiquidadorSueldoTest {

    private LiquidadorSueldo liquidadorSueldo;

    @Test
    public  void liquidarSueldoDeEmpleadoEfectivo(){
        liquidadorSueldo = new LiquidadorEfectivo();
        Empleado empleado = new EmpleadoEfectivo("rober", "stalone", "CA-1234567", 5000, 1000, 100);

        String respuesEsperada = "La liquidacion es un archivo digital, Sueldo a liquidar : $ 5900.0";
        String respuesObtenida = liquidadorSueldo.liquidarSueldo(empleado);

        assertEquals(respuesEsperada , respuesObtenida);
    }
    @Test
    public  void NoliquidarSueldoDeEmpleadoContratadoConLiquidadorEfectivo(){
        liquidadorSueldo = new LiquidadorEfectivo();
        Empleado empleado = new EmpleadoContratado( "rober", "stalone", "CA-1234567", 500, 1000);

        String respuesEsperada = "la liquidacion no se pudo calcular";
        String respuesObtenida = liquidadorSueldo.liquidarSueldo(empleado);

        assertEquals(respuesEsperada , respuesObtenida);
    }
}