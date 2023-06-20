package Excepciones;

public class AlquiCantException extends RuntimeException {
    public AlquiCantException() {
        super("NO HAY CANTIDAD SUFICIENTE");
    }
}
