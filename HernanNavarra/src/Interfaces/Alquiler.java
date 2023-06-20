package Interfaces;

import Excepciones.AlquiCantException;

public interface Alquiler {
    public void alquilado() throws AlquiCantException;

    public void devuelto();
}
