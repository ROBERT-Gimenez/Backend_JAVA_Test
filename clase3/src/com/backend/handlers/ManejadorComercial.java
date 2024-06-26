package com.backend.handlers;

import com.backend.model.Mail;

public class ManejadorComercial extends ManejadorMail {

    @Override
    public String procesarMail(Mail mail) {
        System.out.println("Area Comercial trabajando...");

        String respuesta;
        if (mail.getAsunto().equalsIgnoreCase("comercial") ||
            mail.getDestino().equals("comercial@colmena.com")) {
            respuesta = "area comercial procesando mail";
        }else{
            respuesta = getSiguienteManejador().procesarMail(mail);
        }

        return respuesta;
    }
}
