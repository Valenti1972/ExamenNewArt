package Activitat4;

public class Escultura extends ObraArte {

			int alturaEscultura;
			int anchoEscultura;
			int profundidad;
			MatEscultura materialescultura;
			
			public Escultura(String nombre, String autor, float preciocompra, int alturaEscultura, int anchoEscultura,
					int profundidad, MatEscultura materialescultura) {
				super(nombre, autor, preciocompra);
				this.alturaEscultura = alturaEscultura;
				this.anchoEscultura = anchoEscultura;
				this.profundidad = profundidad;
				this.materialescultura = materialescultura;
			}
			
			
			@Override
			public String toString() {
				return "Escultura [alturaEscultura=" + alturaEscultura + ", anchoEscultura=" + anchoEscultura
						+ ", profundidad=" + profundidad + ", materialescultura=" + materialescultura + ", Nombre="
						+ Nombre + ", Autor=" + Autor + ", preciocompra=" + preciocompra + "]";
			}










			public int getAlturaEscultura() {
				return alturaEscultura;
			}
			public int getAnchoEscultura() {
				return anchoEscultura;
			}
			public int getProfundidad() {
				return profundidad;
			}
			public MatEscultura getMaterialescultura() {
				return materialescultura;
			}
			public void setAlturaEscultura(int alturaEscultura) {
				this.alturaEscultura = alturaEscultura;
			}
			public void setAnchoEscultura(int anchoEscultura) {
				this.anchoEscultura = anchoEscultura;
			}
			public void setProfundidad(int profundidad) {
				this.profundidad = profundidad;
			}
			public void setMaterialescultura(MatEscultura materialescultura) {
				this.materialescultura = materialescultura;
			}
			
			
			
			
			
			
			
		
		
}
