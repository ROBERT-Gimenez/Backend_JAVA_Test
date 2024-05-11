package com.backend.service;

import com.backend.handlers.*;
import com.backend.model.Mail;

public class MailService {
    private ManejadorMail primerManejador;
    public MailService(){
        //Gerencia
        primerManejador = new ManejadorGerencial();
        //Comercial
        ManejadorMail segundoManejador = new ManejadorComercial();
        primerManejador.setSiguienteManejador(segundoManejador);
        //Tecnico
        ManejadorMail tercerManejador = new ManejadorTecnico();
        segundoManejador.setSiguienteManejador(tercerManejador);
        //Spam
        ManejadorMail cuartoManejador = new ManejadorSpam();
        tercerManejador.setSiguienteManejador(cuartoManejador);
    }

    public String procesarMail(Mail mail){
        return primerManejador.procesarMail(mail);
    }
}
