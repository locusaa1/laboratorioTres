package ejercicioUno;

public class Rectangulo {

    //Atributos
    private double ancho = 1.0;
    private double alto = 1.0;

    //Constructores
    public Rectangulo() {
    }

    public Rectangulo(double paramAncho, double paramAlto) {
        this.ancho = paramAncho;
        this.alto = paramAlto;
    }

    //Setters
    public void setAncho(double paramAncho) {
        this.ancho = paramAncho;
    }

    public void setAlto(double paramAlto) {
        this.alto = paramAlto;
    }

    //Getters
    public double getAncho() {
        return ancho;
    }

    public double getAlto() {
        return alto;
    }

    //Metodos.Solicitados
    public double calcularArea() {
        return ancho * alto;
    }

    public double calcularPerimetro() {
        return 2 * (alto + ancho);
    }
}
