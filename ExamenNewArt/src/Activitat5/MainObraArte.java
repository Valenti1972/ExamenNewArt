package Activitat5;

// EN ESTE CASO CALCULAMOS EL PRESUPUESTO GASTADO Y EL RESTANTE A GASTAR.

public class MainObraArte {
	
	static double presupuesto=50000;
	static ObraArte[] obras;
	public static void main(String[] args) {
		
		long codigo=1;
		
		ObraArte cuadro1 = new Cuadro("Mona Lisa", "Da Vinci",1000 , 30 , 40 , MatCuadro.OLEO);
		ObraArte cuadro2 = new Cuadro("El despertar","Boticelli", 1000, 90, 12, MatCuadro.FRESCO);
		ObraArte escultura1 = new Escultura("El Castillo", "Anonimo", 2000, 2, 3, 1, MatEscultura.MARMOL);
		ObraArte escultura2 = new Escultura("El amante", "Da Vinci", 4500, 5, 3, 1, MatEscultura.MARMOL);
		
		ObraArte[] obras = {cuadro1, cuadro2, escultura1, escultura2};
		MainObraArte.obras = obras; 
		
		long totalCuadros = 0;
		long totalEsculturas = 0;
		for (ObraArte obraarte : obras) {
            System.out.println(obraarte);
            if (obraarte instanceof Cuadro) {
            	totalCuadros++; 
                codigo=totalCuadros + totalEsculturas;
                System.out.println("Cuadro id = " + codigo);
            }else if (obraarte instanceof Escultura) {
            	totalEsculturas++;
            	codigo=totalCuadros + totalEsculturas;
            	System.out.println("Esculturas id = " + codigo);
            }
        }
        System.out.println("\n"+"Numeros de Cuadros: " + totalCuadros);
        System.out.println("Numeros de Esculturas: " + totalEsculturas);
        System.out.println("Numeros de Obras de Arte: " + (totalCuadros+totalEsculturas));
        System.out.println("Presupuesto Anual= " + getPresupuesto());
        System.out.println("Total gastado = " + MainObraArte.actualizarPresupuesto());
        System.out.println("Presupuesto restante =" + (presupuesto - MainObraArte.actualizarPresupuesto()));
   	}

	public static double getPresupuesto() {
		return presupuesto;
	}

	public static void setPresupuesto(double presupuesto) {
		MainObraArte.presupuesto = presupuesto;
	}
	
	public static double actualizarPresupuesto() {
        double totalGastado = 0;
        for (ObraArte obraarte : MainObraArte.obras) {
            totalGastado += obraarte.getPreciocompra();
        }
        return totalGastado;
    }
	
	
	

}
