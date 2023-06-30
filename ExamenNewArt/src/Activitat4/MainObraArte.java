package Activitat4;

// EN LA ACTIVIDAD 3 YA SE REALIZA TODO EL PROCESO DE CREACION DE 2 CUADROS Y 2 ESCULTURAS,
// Y SE GENERAN LOS CODIGOS DE LAS OBRAS DE ARTES, POR ELLO EL CODIGO ES EL MISMO.


public class MainObraArte {

	public static void main(String[] args) {
		
		long codigo=1;
		
		ObraArte cuadro1 = new Cuadro("Mona Lisa", "Da Vinci",15000 , 30 , 40 , MatCuadro.OLEO);
		ObraArte cuadro2 = new Cuadro("El despertar","Boticelli", 15000, 90, 12, MatCuadro.FRESCO);
		ObraArte escultura1 = new Escultura("El Castillo", "Anonimo", 20000, 2, 3, 1, MatEscultura.MARMOL);
		ObraArte escultura2 = new Escultura("El amante", "Da Vinci", 5000, 5, 3, 1, MatEscultura.MARMOL);
		
		ObraArte[] obras = {cuadro1, cuadro2, escultura1, escultura2};
		
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
       
	}
		
}
