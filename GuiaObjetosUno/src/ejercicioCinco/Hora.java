package ejercicioCinco;

import java.util.Scanner;

public class Hora {

    //Atributos
    private int hora;
    private int minuto;
    private int segundo;
    private Scanner in = new Scanner(System.in);

    //Constructores
    public Hora() {
    }

    public Hora(int paramHora, int paramMinuto, int paramSegundo) {
        while (paramHora < 0 || paramHora > 23) {
            System.out.println("Ingrese un parametro valido de hora hh: ");
            paramHora = in.nextInt();
        }
        while (paramMinuto < 0 || paramMinuto > 59) {
            System.out.println("Ingrese un parametro valido de minutos mm: ");
            paramMinuto = in.nextInt();
        }
        while (paramSegundo < 0 || paramSegundo > 59) {
            System.out.println("Ingrese un parametro valido de segundos ss: ");
            paramSegundo = in.nextInt();
        }
        this.hora = paramHora;
        this.minuto = paramMinuto;
        this.segundo = paramSegundo;
    }

    //Setters
    public void setHora(int paramHora) {
        this.hora = paramHora;
    }

    public void setMinuto(int paramMinuto) {
        this.minuto = paramMinuto;
    }

    public void setSegundo(int paramSegundo) {
        this.segundo = paramSegundo;
    }

    //Getters
    public int getHora() {
        return this.hora;
    }

    public int getMinuto() {
        return this.minuto;
    }

    public int getSegundo() {
        return this.segundo;
    }

    //Metodos.Solicitados
    public void mostrarHora() {
        String horaString = (this.hora < 10) ? ("0" + Integer.toString(this.hora)) : (Integer.toString(this.hora));
        String minutoString = (this.minuto < 10) ? ("0" + Integer.toString(this.minuto)) : (Integer.toString(this.minuto));
        String segundoString = (this.segundo < 10) ? ("0" + Integer.toString(this.segundo)) : (Integer.toString(this.segundo));
        System.out.println(horaString + ':' + minutoString + ':' + segundoString);
    }

    public Hora sumarSegundo(Hora paramHora) {
        if (paramHora.segundo == 59) {
            paramHora.segundo = 0;
            paramHora.minuto++;
            if (paramHora.minuto > 59) {
                paramHora.minuto = 0;
                paramHora.hora++;
                if (paramHora.hora > 23) {
                    paramHora.hora = 0;
                }
            }
        } else {
            paramHora.segundo++;
        }
        return paramHora;
    }

    public Hora sumarMinuto(Hora paramHora) {
        if (paramHora.minuto == 59) {
            paramHora.minuto = 0;
            paramHora.hora++;
            if (paramHora.hora > 23) {
                paramHora.hora = 0;
            }
        } else {
            paramHora.minuto++;
        }
        return paramHora;
    }
}
