package Activitat8;

/* Preparamos la salida de parametros tal como especifica la actividad 8. Creamos un metodo para calcular el beneficioTotal
 * de las obras de arte vendidas y colocamos las ventas en el inicio del main para que las tenga en cuenta.
*/ 

public class MainObraArte {
    static double presupuesto = 50000;
    static ObraArte[] obras;

    public static void main(String[] args) {

        ObraArte cuadro1 = new Cuadro("Mona Lisa", "Da Vinci", 1000, 30, 40, MatCuadro.OLEO);
        ObraArte cuadro2 = new Cuadro("El despertar", "Boticelli", 500, 90, 12, MatCuadro.FRESCO);
        ObraArte escultura1 = new Escultura("El Castillo", "Anonimo", 1000, 2, 3, 1, MatEscultura.MARMOL);
        ObraArte escultura2 = new Escultura("El amante", "Da Vinci", 4500, 5, 3, 1, MatEscultura.MARMOL);

        ObraArte[] obras = { cuadro1, cuadro2, escultura1, escultura2 };
        MainObraArte.obras = obras;

        long totalCuadros = 0;
        long totalEsculturas = 0;
        escultura1.vender(1500F);
        cuadro2.vender(600F);
        System.out.println("CODIGO\tDESCRIPCION\tAUTOR\tCOMPRAS\tVENDIDA\tVENTAS\tBENEFICIO\tMAT-PIN\tMEDIDAS");
        System.out.println("________________________________________________________________________________________________");
        for (ObraArte obraarte : obras) {
            System.out.println(obraarte);
            if (obraarte instanceof Cuadro) {
                totalCuadros++;
                System.out.println("Cuadro id = " + totalCuadros);
            } else if (obraarte instanceof Escultura) {
                totalEsculturas++;
                System.out.println("Esculturas id = " + totalEsculturas);
            }
        }
        System.out.printf("\nNum. Cuadros: %d, Num. Esculturas: %d, Total Obras: %d%n", totalCuadros,
                totalEsculturas, (totalCuadros + totalEsculturas));

        System.out.printf("\nPresupuesto Anual= %.2f, Compras = %.2f, Presupuesto restante = %.2f%n",
                getPresupuesto(), actualizarPresupuesto(), (getPresupuesto() - actualizarPresupuesto()));
        
        System.out.println("Ventas: " + ObraArte.getTotalVentas());
        System.out.println("Beneficio Operaciones : " + calcularBeneficioTotal() );
        
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
    
    		public static double calcularBeneficioTotal() {
    				double beneficioTotal = 0;
    				for (ObraArte obra : obras) {
    					if (obra.isVendida()) {
    						beneficioTotal += obra.beneficio();
    						}
    				}
    				return beneficioTotal;
    		}

   }


