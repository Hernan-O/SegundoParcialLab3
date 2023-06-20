package Clases;

import java.util.Objects;

public class BiblioBase {
    private String titulo;
    private int anio;
    private String autor;
    private int cant;
    private boolean disponible;

    public BiblioBase(String titulo, int anio, String autor, int cant, boolean disponible) {
        this.titulo = titulo;
        this.anio = anio;
        this.autor = autor;
        this.cant = cant;
        this.disponible = disponible;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        if (cant > 0) {
            this.cant = cant;
            this.setDisponible(true);
        } else {
            this.cant = 0;
            this.setDisponible(false);
        }
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    @Override
    public String toString() {
        return "BiblioBase{" +
                "titulo='" + titulo + '\'' +
                ", anio=" + anio +
                ", autor='" + autor + '\'' +
                ", cant=" + cant +
                ", disponible=" + disponible +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BiblioBase that = (BiblioBase) o;
        return anio == that.anio && cant == that.cant && disponible == that.disponible && Objects.equals(titulo, that.titulo) && Objects.equals(autor, that.autor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo, anio, autor, cant, disponible);
    }
}
