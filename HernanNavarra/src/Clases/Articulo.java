package Clases;

public class Articulo extends BiblioBase {
    private String resu;

    public Articulo(String titulo, int anio, String autor, int cant, boolean disponible, String resu) {
        super(titulo, anio, autor, cant, disponible);
        this.resu = resu;
    }

    public String getResu() {
        return resu;
    }

    public void setResu(String resu) {
        this.resu = resu;
    }

    @Override
    public String toString() {
        return "Articulo{" +
                "resu='" + resu + '\'' +
                "} " + super.toString();
    }
}
