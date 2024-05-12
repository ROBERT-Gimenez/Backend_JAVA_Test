package com.backend.service.impl;

import com.backend.module.TipoUsuario;
import com.backend.module.Usuario;
import com.backend.service.Descarga;

public class ProxyDescarga implements Descarga {
    private ServicioDescarga servicioDescarga = new ServicioDescarga();

    @Override
    public String descargarCancion(Usuario user) {
        String resp = "Deber ser usuario premium para poder descargar";
        if(comprobarTipoDeUsuario(user.getTipoUsuario())){
            servicioDescarga = new ServicioDescarga();
            resp = servicioDescarga.descargarCancion(user);
        }
        return resp;
    }

    private boolean comprobarTipoDeUsuario(TipoUsuario tipoUsuario){
        return tipoUsuario.equals(TipoUsuario.PREMIUM);
    }
}
