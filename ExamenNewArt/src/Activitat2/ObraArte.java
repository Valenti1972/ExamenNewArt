package Activitat2;


// Cuando se trata de una escultura queremos guardar el material del que se compone
// (ENUM:piedra,marmol y arcilla)y las medidas: int alto, int  ancho y int profundo. 
// Si se trata de un cuadro (ENUM: Oleo, fresco y acuarela), luego la altura y el
// ancho del cuadro, hay que realizar dos subclases, una llamada Escultura con 4
// atributos y una llamada Cuadro con 3 atributos.

public class ObraArte {
		String Nombre;
		String Autor;
		float preciocompra;
		float precioventa;
		boolean vendida;
		
		//Constructor
		public ObraArte(String nombre, String autor, float preciocompra) {
			super();
			Nombre = nombre;
			Autor = autor;
			this.preciocompra = preciocompra;
		}

		@Override
		public String toString() {
			return "ObraArte [Nombre=" + Nombre + ", Autor=" + Autor + ", preciocompra=" + preciocompra
					+ ", precioventa=" + precioventa + ", vendida=" + vendida + "]";
		}

		public String getNombre() {
			return Nombre;
		}

		public String getAutor() {
			return Autor;
		}

		public float getPreciocompra() {
			return preciocompra;
		}

		public float getPrecioventa() {
			return precioventa;
		}

		public boolean isVendida() {
			return vendida;
		}

		public void setNombre(String nombre) {
			Nombre = nombre;
		}

		public void setAutor(String autor) {
			Autor = autor;
		}

		public void setPreciocompra(float preciocompra) {
			this.preciocompra = preciocompra;
		}

		public void setPrecioventa(float precioventa) {
			this.precioventa = precioventa;
		}

		public void setVendida(boolean vendida) {
			this.vendida = vendida;
		}
		
}		