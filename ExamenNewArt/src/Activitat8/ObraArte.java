package Activitat8;


//Retocamos el to_String donde usamos el StringBuilder para recorrer cada obra

public class ObraArte {
    private String descripcion;
    private String autor;
    private double preciocompra;
    private boolean vendida;
    private float precioventa;
    private static double ventas;

    public ObraArte(String descripcion, String autor, double preciocompra) {
        this.descripcion = descripcion;
        this.autor = autor;
        this.preciocompra = preciocompra;
        this.vendida = false;
        this.precioventa = 0;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getAutor() {
        return autor;
    }

    public double getPreciocompra() {
        return preciocompra;
    }

    public boolean isVendida() {
        return vendida;
    }

    public float getPrecioventa() {
        return precioventa;
    }

    public static double getTotalVentas() {
        return ventas;
    }

    public void vender(float precioVenta) {
        this.precioventa = precioVenta;
        this.vendida = true;
        ventas += precioVenta;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%-20s", descripcion));
        sb.append(String.format("%-15s", autor));
        sb.append(String.format("%-10.2f", preciocompra));
        sb.append(String.format("%-10s", vendida));
        sb.append(String.format("%-10.2f", precioventa));
        sb.append(String.format("%-10.2f", beneficio()));
        return sb.toString();
    }
    
    public double beneficio() {
        if (vendida) {
            return precioventa - preciocompra;
        } else {
            return 0;
        }
    }
}

