package ejercicioCuatro;

public class CuentaBancaria {

    //Atributos
    //int id; mismo comentario con el item de venta
    private int dni;
    private String nombre;
    private String apellido;
    private double balance;

    //Constructores
    public CuentaBancaria() {
    }

    public CuentaBancaria(int paramDni, String paramNombre, String paramApellido, double paramBalance) {
        this.dni = paramDni;
        this.nombre = paramNombre;
        this.apellido = paramApellido;
        this.balance = paramBalance;
    }

    //Setters
    public void setDni(int paramDni) {
        this.dni = paramDni;
    }

    public void setNombre(String paramNombre) {
        this.nombre = paramNombre;
    }

    public void setApellido(String paramApellido) {
        this.apellido = paramApellido;
    }

    public void setBalance(double paramBalance) {
        this.balance = paramBalance;
    }

    //Getters
    public int getDni() {
        return this.dni;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public double getBalance() {
        return this.balance;
    }

    //Metodos.Solicitados
    public void mostrarCuentaBancaria() {
        System.out.println("DNI: " + getDni());
        System.out.println("Nombre: " + getNombre());
        System.out.println("Apellido: " + getApellido());
        System.out.println("Balance: " + getBalance());
    }

    /*public double acreditarEnCuenta(CuentaBancaria paramCuenta, double paramCredito) {
        paramCuenta.setBalance(paramCuenta.getBalance() + paramCredito);
        System.out.println("Se acredito en su cuenta: " + paramCredito);
        System.out.println("Su saldo luego de la transaccion es de: " + paramCuenta.getBalance());
        return paramCuenta.getBalance();
    }*/
    public double acreditarEnCuenta(double paramCredito) {
        setBalance(getBalance() + paramCredito);
        System.out.println("Se acredito en su cuenta: " + paramCredito);
        System.out.println("Su balance luego de la transaccion es de: " + getBalance());
        return getBalance();
    }

    /*public double debitarEnCuenta(CuentaBancaria paramCuenta, double paramDebito) {
        if ((paramCuenta.getBalance() - paramDebito) < 0) {
            System.out.println("El saldo en la cuenta es insuficiente.");
        } else {
            paramCuenta.setBalance(paramCuenta.getBalance() - paramDebito);
        }
        return paramCuenta.getBalance();
    }*/
    public double debitarEnCuenta(double paramDebito) {
        if ((getBalance() - paramDebito) < 0) {
            System.out.println("El saldo en la cuenta es insuficiente.");
        } else {
            setBalance(getBalance() - paramDebito);
            System.out.println("Se debitaron de la cuenta: " + paramDebito);
            System.out.println("El balance luego de la transaccion es de: " + getBalance());
        }
        return getBalance();
    }

}
