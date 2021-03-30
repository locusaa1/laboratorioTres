package ejercicioTres;

import java.util.ArrayList;
import java.util.UUID;

public class Cuenta {

    private UUID idCuenta;
    private double balance;
    private Cliente cliente;
    private ArrayList<String> registros;
    private double balanceDeudor;

    public Cuenta() {
        this.idCuenta = UUID.randomUUID();
        this.cliente = new Cliente();
        this.registros = new ArrayList<String>(10);
    }

    public Cuenta(double paramBalance, Cliente paramCliente) {
        this.idCuenta = UUID.randomUUID();
        this.balance = paramBalance;
        this.cliente = paramCliente;
        this.registros = new ArrayList<String>(10);
    }

    public void setBalance(double paramBalance) {
        this.balance = paramBalance;
    }

    public void setCliente(Cliente paramCliente) {
        this.cliente = paramCliente;
    }

    public UUID getIdCuenta() {
        return this.idCuenta;
    }

    public double getBalance() {
        return this.balance;
    }

    public Cliente getCliente() {
        return this.cliente;
    }

    public void mostrarCuenta() {
        System.out.println("idCuenta: " + getIdCuenta());
        System.out.println();
        this.cliente.mostrarCliente();
        System.out.println();
        System.out.println("Balance: " + getBalance());
    }

    public void depositar(Cliente depositador, double paramDeposito) {
        this.balance += paramDeposito;
        if (this.registros.size() == 10) {
            this.registros.remove(1);
        }
        this.registros.add("El cliente: " + depositador.getNombre() + ", ha depositado: " + paramDeposito + " pesos en su cuenta.");

    }

    public void extraer(double paramExtraccion) {
        if ((getBalance() - paramExtraccion) > -2000) {
            this.balance -= paramExtraccion;
            if (this.registros.size() == 10) {
                this.registros.remove(1);
            }
            this.registros.add("Usted ha retirado: " + paramExtraccion + " pesos en su cuenta.");
        } else {
            System.out.println("Saldo insudiciente.");
        }
    }

    public void mostrarRegistros() {
        for (int i = 0; i < this.registros.size();i++){
            System.out.println(this.registros.get(i));
            System.out.println();
        }
    }


}
