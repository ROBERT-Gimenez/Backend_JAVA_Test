package com.backend.service;

import com.backend.model.Empleado;

public abstract class LiquidadorSueldo {

    public String liquidarSueldo(Empleado empleado){
        String respuesta ="la liquidacion no se pudo calcular";

        double sueldo = calcularSuedlo(empleado);

        if(sueldo > 0) {
            String recibo = generarRecibo(empleado);
            respuesta = recibo + ", Sueldo a liquidar : $ " + sueldo;
            System.out.println(depositar(empleado.getNumeroCuenta()));
        }

        return respuesta;
    }

    protected abstract double calcularSuedlo(Empleado empleado);
    protected abstract String generarRecibo(Empleado empleado);

    private String depositar (String numeroCuenta){
        return "Orden de deposito en la cuenta : "+numeroCuenta;
    }
}
