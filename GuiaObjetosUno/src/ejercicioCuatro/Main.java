package ejercicioCuatro;

public class Main {

    public static void main(String[] args) {
        CuentaBancaria cuentaCarlos = new CuentaBancaria(123,"Carlos","asd", 15000);
        cuentaCarlos.mostrarCuentaBancaria();
        cuentaCarlos.acreditarEnCuenta(2500);
        cuentaCarlos.debitarEnCuenta(1500);
        cuentaCarlos.debitarEnCuenta(30000);
    }
}