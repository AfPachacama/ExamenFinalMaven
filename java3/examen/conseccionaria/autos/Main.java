package examen.conseccionaria.autos;

import java.util.ArrayList;
import java.util.List;
//import java.util.ArrayList;
import java.util.Scanner;

public class Main extends Autos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcion = 0;
		int claveleida;
		int clave = 123;
		
		Scanner lector = new Scanner(System.in);
//		String TextoDesdeTeclado = lector.next();
//		 
//		ArrayList<String> MiArrayList = new ArrayList<String>();
//		MiArrayList.add(TextoDesdeTeclado);
//

//		Integer numero1=1;
//		Integer numero2=4;
//		Integer numero3=8;
//		Integer numero4=20;
//
//		List<Integer> listaNueva = new ArrayList<Integer>();
//        listaNueva.add(numero1);
//        listaNueva.add(numero2);
//        listaNueva.add(numero3);
//        listaNueva.add(numero4);	
		Autos aut1 = new Autos();
		aut1.setMarca(null);
		aut1.setModelo(null);
		aut1.setPlaca(null);

		
		
		while(true) {
				System.out.println("***************************************");
				System.out.println("******** Conseccionaria Ambacar ********");
				System.out.println("     Elija las siguientes opciones    ");
				System.out.println("*****************************************");
				System.out.println("1. Ingresar Auto");
				System.out.println("2. Consultar Auto");
				System.out.println("3. Actualizar Kilometraje");
				System.out.println("4. Imprimir Reporte");
				System.out.println("5. SALIR");


				opcion = lector.nextInt();
				switch (opcion) {

				case 1:
					do {
						System.out.println("1.Auto Importado");
						System.out.println("2.Auto Nacional");
						opcion = lector.nextInt();
						switch (opcion) {
						case 1:
							System.out.println("Ingrese Marca");
//							  = teclado.nextInt();
						     
							break;
						case 2:
							System.out.println("Ingrese Marca");
							break;
						
						}
						
					} while (opcion != 0);
					System.out.println("Gracias por preferirnos");
					
					
					break;
				case 2:
					
					break;
				case 3:
					break;
				case 4:
					break;
				case 5:
					System.out.println("Gracias por visitar nuestra conssecionaria");
					System.out.println("-.-.-.-.-.-.-Alex Pachacama.-.-.-.-.-");

					System.exit(0);
					break;

				}

		}
	}
	}



	


