package Clases;

import Excepciones.AlquiCantException;

import java.util.LinkedList;

public class ClaseGenerica<T> {
    private LinkedList<T> lista = new LinkedList<>();

    public void agregar(T objeto) {
        if (lista.contains(objeto)) {
            lista.add(lista.indexOf(objeto), objeto);
        } else {
            lista.add(objeto);
        }
    }

    public void quitar(T objeto) {
        lista.remove(objeto);
    }

    public boolean buscar(T objeto) {
        if (lista.contains(objeto)) {
            System.out.println("El objeto se encuentra, es el siguiente:");
            objeto.toString();
            return true;
        } else {
            System.out.println("NO SE ENCUENTRA");
            return false;
        }
    }

    public void alquilar(T objeto) throws AlquiCantException {
        if (lista.contains(objeto)) {
            Object aux = lista.get(lista.indexOf(objeto));
            if (objeto instanceof Libro) {
                ((Libro) aux).alquilado();
                lista.set(lista.indexOf(objeto), (T) aux);
            } else if (objeto instanceof Revista) {
                ((Revista) aux).alquilado();
                lista.set(lista.indexOf(objeto), (T) aux);
            } else {
                System.out.println("No existe");
            }
        }
    }

    public void mostrar() {
        System.out.println(lista);
    }
}
