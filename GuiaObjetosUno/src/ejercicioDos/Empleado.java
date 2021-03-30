package ejercicioDos;

public class Empleado {

    //Atributos
    private int dni;
    private String nombre;
    private String apellido;
    private double salario;

    //Constructores
    public Empleado() {
    }

    public Empleado(int paramDni, String paramNombre, String paramApellido, double paramSalario) {
        this.dni = paramDni;
        this.apellido = paramApellido;
        this.nombre = paramNombre;
        this.salario = paramSalario;
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

    public void setSalario(double paramSalario) {
        this.salario = paramSalario;
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

    public double getSalario() {
        return this.salario;
    }

    //Metodos.Solicitados
    public double calcularSalarioAnual() {
        return getSalario() * 12;
    }

    public void aumentarSalarioPorcentaje(double paramPorcentaje) {
        setSalario(getSalario() + getSalario() * (paramPorcentaje / 100));
    }

    public void mostrarEmpleado() {
        System.out.println("DNI: " + getDni());
        System.out.println("Nombre: " + getNombre());
        System.out.println("Apellido: " + getApellido());
        System.out.println("Salario: " + getSalario());
    }
}
