package Clases;

import Excepciones.AlquiCantException;
import Interfaces.Alquiler;

public class Revista extends BiblioBase implements Alquiler {
    private int nEdicion;
    private boolean suscripcion;

    public Revista(String titulo, int anio, String autor, int cant, boolean disponible, int nEdicion, boolean suscripcion) {
        super(titulo, anio, autor, cant, disponible);
        this.nEdicion = nEdicion;
    }

    public int getnEdicion() {
        return nEdicion;
    }

    public void setnEdicion(int nEdicion) {
        this.nEdicion = nEdicion;
    }

    public boolean isSuscripcion() {
        return suscripcion;
    }

    public void suscribirse() {
        System.out.println("Está suscrito a la revista");
        this.suscripcion = true;
    }


    @Override
    public String toString() {
        return "Revista{" +
                "nEdicion=" + nEdicion +
                ", suscripcion=" + suscripcion +
                "} " + super.toString();
    }

    public void alquilado() {
        if (this.isDisponible() && this.getCant() > 0) {
            System.out.println("La revista " + this.getTitulo() + " ha sido alquilada con exito");
            this.setCant(this.getCant() - 1);
        } else {
            new AlquiCantException();
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
