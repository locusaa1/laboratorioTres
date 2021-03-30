package ejercicioUno;

public class Main {

    public static void main(String[] args) {
        Rectangulo rectangulo = new Rectangulo(4, 2);
        System.out.println("El rectangulo se inicializa con " + rectangulo.getAncho() + " de ancho y " + rectangulo.getAlto() + " de alto");
        System.out.println("El area del rectangulo es: " + rectangulo.calcularArea() + ". Y el perimetro del rectangulo es: " + rectangulo.calcularPerimetro() + ".");

        System.out.println("Se modificaron los atributos del recrangulo...");
        rectangulo.setAncho(8);
        rectangulo.setAlto(4);

        System.out.println("El rectangulo se inicializa con " + rectangulo.getAncho() + " de ancho y " + rectangulo.getAlto() + " de alto");
        System.out.println("El area del rectangulo es: " + rectangulo.calcularArea() + ". Y el perimetro del rectangulo es: " + rectangulo.calcularPerimetro() + ".");

        System.out.println("Se inicializa otro rectangulo con el constructor predeterminado.");
        Rectangulo rectangulo2 = new Rectangulo();
        System.out.println("El ancho predeterminado es " + rectangulo2.getAncho() + ". Y " + rectangulo2.getAlto() + " de alto");
    }
}
