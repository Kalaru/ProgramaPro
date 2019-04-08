package Unidad4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MonedaLanzadorCambio {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		Moneda camb = new Moneda(); //Creamos un operador para el objeto Moneda
		double dinero = 0.0;
		boolean seguir = true;

		while (seguir) {//Establecemos un bucle para realizar las preguntas pertientes sobre el cambio de moneda
			try {
				System.out.println("El valor actual del cambio es: " + camb.getCambio() + "¿Desea cambiarlo?"
						+ "\nPulsa 1 para si" + "\nPulsa 2 para no cambiar el valor e introducir la cantidad a cambiar"
								+ "\nPulse 3 si no desea realizar ninguna operación y salir de la aplicación");
				int opcion = teclado.nextInt();

				switch (opcion) {
				case 1:
					System.out.println("Introduce el nuevo valor del cambio ");
					double cambio = teclado.nextDouble();
					camb.setCambio(cambio);//Aqui le pasamos el cambio establecido
					break;
				case 2:
					System.out.println("¿Que desea?" + "\nPulse 1 Para cambiar de Euros a dolares"
							+ "\nPulse 2 Para cambiar de Dolares a Euros");
					int opcion2 = teclado.nextInt();
					if (opcion2 == 1) {
						System.out.println("Introduzca la cantidad de Euros y le mostraremos su valor en Dolares");
						dinero = teclado.nextDouble();
						System.out.println("Su cambio es: "+camb.EurosDolares(dinero)+" Dolares");//Aqui le pasamos al metodo EurosDolares()
					} else if (opcion2 == 2) {
						System.out.println("Introduzca la cantidad de Dolares y le mostraremos su valor en Euros");
						dinero = teclado.nextDouble();
						System.out.println("Su cambio es: "+camb.DolaresEuros(dinero)+" Euros");//Aqui le pasamos al metodo DolaresEuros()
					}else {
						System.out.println("Este parámetro no está contemplado");
					}
					break;
				case 3:
					seguir = false;
					break;
				default:
					System.out.println("Estos parámetros no son válidos");
					break;
				}
			} catch (InputMismatchException e) {
				System.out.println("Estos parámetros no son válidos");
				teclado.nextLine();
			}
		}
		System.out.println("Gracias por confiar en nosotros");
		teclado.close();
	}

}
