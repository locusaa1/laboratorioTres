package ejercicioDos;

import java.util.UUID;
import java.time.LocalDateTime;

public class Factura {

    private UUID idFactura;
    private LocalDateTime localDate;
    private Cliente cliente;
    private ItemDeVenta listaItems[];
    private double montoTotal;
    private double descuentoFinal;
    private double montoFinal;

    public Factura() {
        this.idFactura = UUID.randomUUID();
        this.localDate = LocalDateTime.now();
        this.cliente = new Cliente();
        this.listaItems = new ItemDeVenta[0];
        this.montoTotal = sumaTotalItems();
        this.descuentoFinal = montoTotal * cliente.getDescuento() / 100;
        this.montoFinal = montoTotal - descuentoFinal;
    }

    public Factura(double paramTotal, Cliente paramCliente) {
        this.idFactura = UUID.randomUUID();
        this.localDate = LocalDateTime.now();
        this.cliente = paramCliente;
        this.listaItems = new ItemDeVenta[0];
        this.montoTotal = paramTotal;
        this.descuentoFinal = montoTotal * cliente.getDescuento() / 100;
        this.montoFinal = montoTotal - descuentoFinal;
    }

    public Factura(Cliente paramCliente, ItemDeVenta paramListaItems[]) {
        this.idFactura = UUID.randomUUID();
        this.localDate = LocalDateTime.now();
        this.cliente = paramCliente;
        this.listaItems = paramListaItems;
        this.montoTotal = sumaTotalItems();
        this.descuentoFinal = montoTotal * cliente.getDescuento() / 100;
        this.montoFinal = montoTotal - descuentoFinal;
    }

    public void setCliente(Cliente paramCliente) {
        this.cliente = paramCliente;
    }

    public void setListaItems(ItemDeVenta paramLista[]) {
        this.listaItems = paramLista;
    }

    public void setMontoTotal(double paramMontoTotal) {
        this.montoTotal = paramMontoTotal;
    }

    public UUID getIdFactura() {
        return this.idFactura;
    }

    public LocalDateTime getLocalDate() {
        return this.localDate;
    }

    public Cliente getCliente() {
        return this.cliente;
    }

    public ItemDeVenta[] getListaItems() {
        return this.listaItems;
    }

    public double getMontoTotal() {
        return this.montoTotal;
    }

    public double getDescuentoFinal() {
        return this.descuentoFinal;
    }

    public double getMontoFinal() {
        return this.montoFinal;
    }

    public void mostrarFactura() {
        System.out.println("idFactura: " + getIdFactura());
        System.out.println("fecha: " + getLocalDate());
        System.out.println();
        System.out.println("Cliente de factura...");
        this.cliente.mostrarCliente();
        System.out.println("lista de items:");
        System.out.println();
        mostrarListaItems();
        System.out.println();
        System.out.println("montoTotal: " + getMontoTotal());
        System.out.println("descuentoFinal: " + getDescuentoFinal());
        System.out.println("montoFinal: " + getMontoFinal());
        System.out.println();
    }

    public double sumaTotalItems() {
        double sumaTotal = 0;
        for (int i = 0; i < this.listaItems.length; i++) {
            sumaTotal += this.listaItems[i].getPrecioUnitario();
        }
        return sumaTotal;
    }

    public void mostrarListaItems() {
        for (int i = 0; i < this.listaItems.length; i++) {
            listaItems[i].mostrarItemDeVenta();
            System.out.println();
        }
    }
}
