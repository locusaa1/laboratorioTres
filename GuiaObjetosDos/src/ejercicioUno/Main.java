package ejercicioUno;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Autor joshuaBoch = new Autor("Joshua", "Boch", "joshua@gmail.com", 'j');
        Autor leo = new Autor("leo", "Gazaba", "asd@gmail.com", 'm');
        Autor asd = new Autor("asd", "asd", "asd@gmail.com", 'f');
        joshuaBoch.mostrarAutor();
        System.out.println();

        ArrayList<Autor> autores = new ArrayList<Autor>(3);
        autores.add(joshuaBoch);
        autores.add(leo);
        autores.add(asd);

        Libro effectiveJava = new Libro("Effective Java", 450, 150, autores.get(0));
        effectiveJava.mostrarMensaje();

        System.out.println("Se modificaran parametros del libro...");
        System.out.println();
        effectiveJava.modificarPrecio(50);
        effectiveJava.modificarUnidades(50);

        System.out.println("Nueva impresion del autor desde el libro effective java:");
        effectiveJava.getAutores().get(0).mostrarAutor();

        System.out.println("Libro con las modificaciones");
        effectiveJava.mostrarLibro();

        System.out.println();
        System.out.println("Libro con tres autores: ");
        System.out.println();
        effectiveJava.setAutores(autores);
        effectiveJava.mostrarMensaje();


    }
}
