package com.backend.test;

import com.backend.module.TipoUsuario;
import com.backend.module.Usuario;
import com.backend.service.impl.ProxyDescarga;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProxyDescargaTest {

    private ProxyDescarga proxyDescarga = new ProxyDescarga();

    @Test
    void deberiaIniciarDescargaCuandoElUsuarioEsPremium() {
        Usuario user = new Usuario(01, TipoUsuario.PREMIUM);
        String resp = "Iniciando descarga para el usuario 1";
        String respObtenida = proxyDescarga.descargarCancion(user);

        assertEquals(resp, respObtenida);
    }

    @Test
    void noDeberiaIniciarDescargaCuandoElUsuarioNoEsPremium(){
        Usuario user = new Usuario(02, TipoUsuario.FREE);
        String resp = "Deber ser usuario premium para poder descargar";
        String respObtenida = proxyDescarga.descargarCancion(user);

        assertEquals(resp,respObtenida);
    }
}