package examen.conseccionaria.autos;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcion = 0;
		Scanner lector = new Scanner(System.in);

		System.out.print("Ingrese la clave: ");
		claveleida = Integer.parseInt(lector.next());
		if (clave == claveleida) {

			do {
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
				System.out.println("Para salir digite 0");
				opcion = lector.nextInt();
			} while (opcion != 0);
			System.out.println("Gracias por preferirnos");
		} else {
			System.out.println(" La Clave es incorrecta");
		}

	}


	}

}
