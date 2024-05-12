package com.backend.test;

import com.backend.model.Mail;
import com.backend.service.MailService;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MailServiceTest {

    private final MailService mailService = new MailService();

    @Test
    public void cuandoNoHayUnDestinoOAsuntoConUnDepartamentoValido_deberiaProcesarComoSpam(){
        Mail mail = new Mail("casa","casa" , "casa");
        String respuestaEsperada = "SPAM";
        String respuestaObtenida =mailService.procesarMail(mail);

        assertEquals(respuestaEsperada, respuestaObtenida);
    }

}