package ejercicioDos;

public class Main {

    public static void main(String[] args) {
        Empleado empleado = new Empleado(23456345, "Carlos", "Gutierrez", 25000);
        Empleado empleado2 = new Empleado(34234123, "Ana", "Sanchez", 27500);
        System.out.println("Primer empleado/a establecido:");
        empleado.mostrarEmpleado();
        System.out.println("");
        System.out.println("Segundo empleado/a establecido:");
        empleado2.mostrarEmpleado();
        System.out.println("");
        System.out.println("El salario de Carlos ha aumentado un 15%.");
        empleado.aumentarSalarioPorcentaje(15);
        double salarioAnual = empleado.calcularSalarioAnual();
        System.out.println("El actual salario de " + empleado.getNombre() + " " + empleado.getApellido() + " es ahora de: " + empleado.getSalario());
        System.out.println("El salario anual de " + empleado.getNombre() + " " + empleado.getApellido() + " con el nuevo aumento sera: " + salarioAnual);
    }
}
