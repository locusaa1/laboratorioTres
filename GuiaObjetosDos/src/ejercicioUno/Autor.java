package ejercicioUno;

import java.util.Scanner;

public class Autor {

    //Atributos
    private String nombre;
    private String apellido;
    private String email;
    private char genero;
    private Scanner in = new Scanner(System.in);

    //Constructores
    public Autor() {
    }

    public Autor(String paramNombre, String paramApellido, String paramEmail, char paramGenero) {
        this.nombre = paramNombre;
        this.apellido = paramApellido;
        this.email = paramEmail;
        this.genero = (paramGenero == 'm' || paramGenero == 'f') ? paramGenero : confirmarGenero(paramGenero);
    }

    //Setters
    public void setNombre(String paramNombre) {
        this.nombre = paramNombre;
    }

    public void setApellido(String paramApellido) {
        this.apellido = paramApellido;
    }

    public void setEmail(String paramEmail) {
        this.email = paramEmail;
    }

    public void setGenero(char paramGenero) {
        this.genero = (paramGenero == 'm' || paramGenero == 'f') ? paramGenero : confirmarGenero(paramGenero);
    }

    //Getters
    public String getNombre() {
        return this.nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public String getEmail() {
        return this.email;
    }

    public char getGenero() {
        return this.genero;
    }

    //Metodos.Solicitados
    private char confirmarGenero(char paramGenero) {
        while ((paramGenero != 'm') && (paramGenero != 'f')) {
            System.out.println("Ingrese un caracter de genero valido: m - f");
            paramGenero = in.next().charAt(0);
        }
        return paramGenero;
    }

    public void mostrarAutor() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Apellido: " + getApellido());
        System.out.println("Email: " + getEmail());
        System.out.println("Genero: " + getGenero());
    }
}
