package com.backend.service;

import com.backend.model.Persona;

import java.util.ArrayList;
import java.util.List;

public class GrupoService {

    private List<Persona> admitidos = new ArrayList<>();

    public GrupoService(List<Persona> admitidos ){
        this.admitidos = admitidos;
    }

    public List<Persona> getAdmitidos(){
        return admitidos;
    }

    public void setAdmitidos(List<Persona> admitidos) {
        this.admitidos = admitidos;
    }

    public void admitirPersona(Persona persona){
        if(persona.getNombre().length() >= 5 && persona.getEdad() > 18 ){
            admitidos.add(persona);
        }else {
            System.out.println(persona.getNombre()+" No cumple con los requisitos");
        }
    }
}
