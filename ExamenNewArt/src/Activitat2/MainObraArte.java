package Activitat2;

public class MainObraArte {

	public static void main(String[] args) {
		
		
		ObraArte cuadro1 = new Cuadro("Mona Lisa", "Da Vinci",1000000 , 30 , 40 , MatCuadro.OLEO);
		ObraArte cuadro2 = new Cuadro("El despertar","Boticelli", 1000000, 90, 12, MatCuadro.FRESCO);
		ObraArte escultura1 = new Escultura("El Castillo", "Anonimo", 200000, 2, 3, 1, MatEscultura.MARMOL);
		ObraArte escultura2 = new Escultura("El amante", "Da Vinci", 150000, 5, 3, 1, MatEscultura.MARMOL);
		
		ObraArte[] obras = {cuadro1, cuadro2, escultura1, escultura2};
		
		long totalCuadros = 0;
		long totalEsculturas = 0;
			       
        for (ObraArte obraarte : obras) {
            System.out.println(obraarte);
            if (obraarte instanceof Cuadro) {
            	totalCuadros++; 
            }else if (obraarte instanceof Escultura) {
            	totalEsculturas++;
            }
        }
        System.out.println("\n"+"Numeros de Cuadros: " + totalCuadros);
        System.out.println("Numeros de Esculturas: " + totalEsculturas);
        System.out.println("Numeros de Obras de Arte: " + (totalCuadros+totalEsculturas));
	}
		
}
