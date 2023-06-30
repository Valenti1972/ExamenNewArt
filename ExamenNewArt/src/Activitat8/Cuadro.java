package Activitat8;

/* Igualmente usamos el StringBuilder para recorrer los atributos de esta clase simplificamos el nombre de los atributos.
 * 
 */
public class Cuadro extends ObraArte {
    private MatCuadro material;
    private int ancho;
    private int alto;

    public Cuadro(String descripcion, String autor, double preciocompra, int ancho, int alto, MatCuadro material) {
        super(descripcion, autor, preciocompra);
        this.ancho = ancho;
        this.alto = alto;
        this.material = material;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append(material).append("\t");
        sb.append(ancho).append(" x ").append(alto);
        return sb.toString();
    }
}

