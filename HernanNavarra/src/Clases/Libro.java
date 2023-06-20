package Clases;

import Excepciones.AlquiCantException;
import Interfaces.Alquiler;

public class Libro extends BiblioBase implements Alquiler {
    private int cantPag;

    public Libro(String titulo, int anio, String autor, int cant, boolean disponible, int cantPag) {
        super(titulo, anio, autor, cant, disponible);
        this.cantPag = cantPag;
    }

    public int getCantPag() {
        return cantPag;
    }

    public void setCantPag(int cantPag) {
        this.cantPag = cantPag;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "cantPag=" + cantPag +
                "} " + super.toString();
    }

    @Override
    public void alquilado() throws AlquiCantException {
        if (this.isDisponible() && this.getCant() > 0) {
            System.out.println("El libro " + this.getTitulo() + " ha sido alquilado con exito");
            this.setCant(this.getCant() - 1);
        } else {
            throw new AlquiCantException();
        }
    }

    @Override
    public void devuelto() {
        this.setCant(this.getCant() + 1);
        if (!this.isDisponible()) {
            this.setDisponible(true);
        }
    }
}
