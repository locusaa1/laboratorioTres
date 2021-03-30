package ejercicioDos;

public class Main {
    public static void main(String[] args) {
        Cliente clientePrueba = new Cliente("Leonardo", "asd@gmail.com", 10);
        clientePrueba.mostrarCliente();
        System.out.println();

        Factura facturaPrueba = new Factura(1000, clientePrueba);
        facturaPrueba.mostrarFactura();
        System.out.println();

        ItemDeVenta[] listaPrueba=new ItemDeVenta[2];
        listaPrueba[0]=new ItemDeVenta("asd","tres letras",500);
        listaPrueba[1]=new ItemDeVenta("asdasd","seis letras",500);
        Factura facturaPruebaDos=new Factura(clientePrueba,listaPrueba);
        facturaPruebaDos.mostrarFactura();
    }
}
