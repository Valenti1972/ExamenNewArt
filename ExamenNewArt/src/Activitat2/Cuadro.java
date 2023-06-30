package Activitat2;


public class Cuadro extends ObraArte {
	int AlturaCuadro;
	int AnchoCuadro;
	MatCuadro material;
	public Cuadro(String nombre, String autor, float preciocompra, int alturaCuadro, int anchoCuadro,
			MatCuadro material) {
		super(nombre, autor, preciocompra);
		AlturaCuadro = alturaCuadro;
		AnchoCuadro = anchoCuadro;
		this.material = material;
	}
	public int getAlturaCuadro() {
		return AlturaCuadro;
	}
	public int getAnchoCuadro() {
		return AnchoCuadro;
	}
	public MatCuadro getMaterial() {
		return material;
	}
	public void setAlturaCuadro(int alturaCuadro) {
		AlturaCuadro = alturaCuadro;
	}
	public void setAnchoCuadro(int anchoCuadro) {
		AnchoCuadro = anchoCuadro;
	}
	public void setMaterial(MatCuadro material) {
		this.material = material;
	}
	@Override
	public String toString() {
		return "Cuadro [AlturaCuadro=" + AlturaCuadro + ", AnchoCuadro=" + AnchoCuadro + ", material=" + material
				+ ", Nombre=" + Nombre + ", Autor=" + Autor + ", preciocompra=" + preciocompra + "]";
	}
	
	
	
	
	
}
