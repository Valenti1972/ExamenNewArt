package Activitat7;

/* EN ESTE CASO CALCULAMOS EL PRESUPUESTO GASTADO Y EL RESTANTE A GASTAR, REALIZADO EN EL 5 
 SIMPLEMENTE RENOMBRAMOS totalGastado POR compras, SE REDUCEN LOS SYSO Y MODIFICAMOS EL 
 to STRING. GENERAMOS UN METODO LLAMADO VENDER EN LA CLASE OBRAARTE Y MOSTRAMOS LA CANTIDAD 
 DE VENTAS TOTAL.
*/ 

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
		System.out.printf("\n" + "Num. Cuadros: %d, Num. Esculturas:"
				+ " %d, Total Obras: %d%n", totalCuadros,
				totalEsculturas,(totalCuadros+totalEsculturas));
        
		
		System.out.printf("\n" + "\n"+ "Presupuesto Anual= %.2f, Total gastado = %.2f, Presupuesto restante = %.2f%n",
                getPresupuesto(), actualizarPresupuesto(),
                (getPresupuesto() - actualizarPresupuesto()));
		escultura1.vender(1500F);
	    cuadro2.vender(600F);

	    System.out.println("\n" + "Total de ventas realizado: " + ObraArte.getTotalVentas());
	    System.out.println("\n" + "Nuevo presupuesto restante tras las ventas " + 
	    (getPresupuesto() - (actualizarPresupuesto())+ (ObraArte.getTotalVentas())));
	}

	public static double getPresupuesto() {
		return presupuesto;
	}

	public static void setPresupuesto(double presupuesto) {
		MainObraArte.presupuesto = presupuesto;
	}
	
	public static double actualizarPresupuesto() {
        double compras = 0;
        for (ObraArte obraarte : MainObraArte.obras) {
            compras += obraarte.getPreciocompra();
        }
        return compras;
    }
}
