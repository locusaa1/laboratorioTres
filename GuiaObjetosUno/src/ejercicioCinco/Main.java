package ejercicioCinco;

public class Main {

    public static void main(String[] args) {
        Hora horaNueva = new Hora(23, 59, 58);
        horaNueva = horaNueva.sumarSegundo(horaNueva);
        horaNueva.mostrarHora();
        horaNueva = horaNueva.sumarMinuto(horaNueva);
        horaNueva.mostrarHora();
        horaNueva = horaNueva.sumarSegundo(horaNueva);
        horaNueva.mostrarHora();
    }
}
