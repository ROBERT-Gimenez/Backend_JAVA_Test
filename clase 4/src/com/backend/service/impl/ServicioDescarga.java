package com.backend.service.impl;

import com.backend.module.Usuario;
import com.backend.service.Descarga;

public class ServicioDescarga implements Descarga {

    @Override
    public String descargarCancion(Usuario user) {
        return "Iniciando descarga para el usuario " + user.getId();
    }
}
