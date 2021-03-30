package ejercicioTres;

public class Main {
    public static void main(String[] args) {
        Cliente clientePrueba = new Cliente("Leonardo",'m');
        Cliente clienteDeposito = new Cliente("Carlos",'m');
        clientePrueba.mostrarCliente();
        System.out.println();
        Cuenta cuentaPrueba = new Cuenta(10000,clientePrueba);
        cuentaPrueba.extraer(11000);
        System.out.println();
        cuentaPrueba.extraer(5000);
        System.out.println();
        cuentaPrueba.depositar(clienteDeposito,4000);
        System.out.println();
        cuentaPrueba.mostrarCuenta();
        System.out.println();
        cuentaPrueba.mostrarRegistros();

    }
}
