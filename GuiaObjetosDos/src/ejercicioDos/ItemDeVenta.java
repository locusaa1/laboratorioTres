package ejercicioDos;

import java.util.UUID;

public class ItemDeVenta {

    private UUID idItem;
    private String nombre;
    private String desc;
    private double precioUnitario;

    public ItemDeVenta() {
        this.idItem = UUID.randomUUID();
    }

    public ItemDeVenta(String paramNombre, String paramDesc, double paramPrecioUnitario) {
        this.idItem = UUID.randomUUID();
        this.nombre = paramNombre;
        this.desc = paramDesc;
        this.precioUnitario = paramPrecioUnitario;
    }

    public void setNombre(String paramNombre) {
        this.nombre = paramNombre;
    }

    public void setDesc(String paramDesc) {
        this.desc = paramDesc;
    }

    public void setPrecioUntario(double paramPrecioUnitario) {
        this.precioUnitario = paramPrecioUnitario;
    }

    public UUID getIdItem() {
        return this.idItem;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getDesc() {
        return this.desc;
    }

    public double getPrecioUnitario() {
        return this.precioUnitario;
    }

    public void mostrarItemDeVenta() {
        System.out.println("idItem: " + getIdItem());
        System.out.println("nombre: " + getNombre());
        System.out.println("desc: " + getDesc());
        System.out.println("precioUnitario: " + getPrecioUnitario());
    }
}
