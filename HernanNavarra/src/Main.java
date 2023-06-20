import Clases.*;
import Excepciones.AlquiCantException;
import Excepciones.ArchivoRotoException;

public class Main {
    public static void main(String[] args) throws AlquiCantException, ArchivoRotoException {
        //CARGA DE PRUEBA
        Libro uno = new Libro("prueba", 2015, "Juan", 1, true, 42);
        Libro dos = new Libro("prueba2", 2015, "JuanCarlos", 10, true, 20);
        Libro tres = new Libro("prueba3", 2015, "JuanCruz", 9, true, 10);
        Revista rev1 = new Revista("revistaPrueba", 2004, "PerezGomez", 10, true, 2, false);
        Revista rev2 = new Revista("revistaPrueba1", 1992, "Perez", 22, true, 4, false);
        Revista rev3 = new Revista("revistaPrueba2", 1922, "PerezGerth", 20, true, 1, false);
        Articulo art1 = new Articulo("artiPrueba", 2006, "JorgeDrexler", 2, true, "El resumen del articulo1");
        Articulo art2 = new Articulo("artiPrueba1", 2002, "JorgeChino", 2, true, "El resumen del articulo2");
        Articulo art3 = new Articulo("artiPrueba2", 1999, "Jorge", 2, true, "El resumen del articulo3");
        //CARGA GENERICO
        ClaseGenerica<BiblioBase> prueba = new ClaseGenerica<>();
        prueba.agregar(uno);
        prueba.agregar(dos);
        prueba.agregar(tres);
        prueba.agregar(art1);
        prueba.agregar(art2);
        prueba.agregar(art3);
        prueba.agregar(rev1);
        prueba.agregar(rev2);
        prueba.agregar(rev3);
        //CARGA BIBLIOTECA GENERAL
        BiblioGral pruebaGral = new BiblioGral(prueba);
        //Muestra y alquila
        pruebaGral.getStock().mostrar();
        pruebaGral.getStock().alquilar(uno); //Quitá uno en la cantidad de la revista y su disponibilidad pasa a ser false
        //Archivo
        //No me funcionó :,(
        pruebaGral.exportarDatos("PruebaDatos.json");
        pruebaGral.importarDatos("PruebaDatos.json");

    }
}