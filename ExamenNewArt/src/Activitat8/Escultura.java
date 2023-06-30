package Activitat8;


public class Escultura extends ObraArte {
    private MatEscultura material;
    private int largo;
    private int ancho;
    private int alto;

    public Escultura(String descripcion, String autor, double preciocompra, int largo, int ancho, int alto, MatEscultura material) {
        super(descripcion, autor, preciocompra);
        this.largo = largo;
        this.ancho = ancho;
        this.alto = alto;
        this.material = material;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append(material).append("\t");
        sb.append(largo).append(" x ").append(ancho).append(" x ").append(alto);
        return sb.toString();
    }
}