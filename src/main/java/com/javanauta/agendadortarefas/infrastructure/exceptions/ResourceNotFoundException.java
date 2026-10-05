package com.javanauta.agendadortarefas.infrastructure.exceptions;

public class ResourceNotFoundException extends  RuntimeException{

    public ResourceNotFoundException(String mensegem){
        super(mensegem);
    }

    public ResourceNotFoundException(String mengagem, Throwable throwable){
        super(mengagem, throwable);
    }
}
