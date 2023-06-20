package Clases;

import Excepciones.ArchivoRotoException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.HashSet;

public class BiblioGral {
    ClaseGenerica<BiblioBase> stock = new ClaseGenerica<>();

    public BiblioGral() {
    }

    public BiblioGral(ClaseGenerica stock) {
        this.stock = stock;
    }

    public void agregar(BiblioBase aux) {
        if (!stock.buscar(aux)) {
            stock.agregar(aux);
        } else {

        }
    }

    public void quitar(BiblioBase aux) {
        stock.quitar(aux);
    }

    public ClaseGenerica<BiblioBase> getStock() {
        return stock;
    }

    public void setStock(ClaseGenerica<BiblioBase> stock) {
        this.stock = stock;
    }

    public void exportarDatos(String archivo) throws ArchivoRotoException {
        try {

            ObjectMapper mapper = new ObjectMapper();
            mapper.writeValue(new File(archivo), this);
            System.out.println("OK");
        } catch (IOException e) {
            throw new ArchivoRotoException();
        }
    }

    public static BiblioGral importarDatos(String archivo) throws ArchivoRotoException {
        try {

            ObjectMapper mapper = new ObjectMapper();

            BiblioGral aux = mapper.readValue(new File(archivo), BiblioGral.class);
            return aux;
        } catch (IOException e) {
            throw new ArchivoRotoException();
        }
    }
}
