package Excepciones;

import java.io.IOException;

public class ArchivoRotoException extends IOException {
    public ArchivoRotoException() {
        super("EL ARCHIVO NO EXISTE O ESTÁ ROTO");
    }
}
