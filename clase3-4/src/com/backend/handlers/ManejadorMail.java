package com.backend.handlers;

import com.backend.model.Mail;

public abstract class ManejadorMail {

    private ManejadorMail siguienteManejador;

    public ManejadorMail getSiguienteManejador() {
        return siguienteManejador;
    }

    public void setSiguienteManejador(ManejadorMail siguienteManejador) {
        this.siguienteManejador = siguienteManejador;
    }

    public abstract String procesarMail(Mail mail);
}
