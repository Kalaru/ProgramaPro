package Unidad4;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Clase que crea los primas.
 * @author alumnodam
 *
 */

public class AreaPrisma_Act3_AlvaroSuarez {
	private static final int ValorBase = 0;
	private static final int ValorAltura = 0;
	static Prisma  pris;
	static int contador = 0;
	static ArrayList<Float> listaprismas = new ArrayList<>();

	/**
	 * 
	 * @param args
	 */
	
	public static void main(String[] args) {
		
		System.out.println("=======");
		System.out.println("PRISMAS");
		System.out.println("=======");
		IntroducirDatos();
		OrdenarLista();

	}

	public static void IntroducirDatos() {
		while (contador != 3) {
			pris = new Prisma(ValorBase, ValorAltura);
			int ValorBase = AleatorioBase();
			int ValorAltura = AleatorioAltura();
			pris.setBasetriangulo(ValorBase);
			pris.setAlturaPrisma(ValorAltura);
			ImprimirDatos();
			contador++;
			listaprismas.add(pris.areaTotal());
			
		}
	}

	public static void ImprimirDatos() {
		System.out.println("Creado el objeto Prisma con valores:");
		System.out.println("- Base: "+pris.getBasetriangulo());
		System.out.println("- Altura: "+pris.getAlturaPrisma());
		System.out.println("- AreaTotal: "+pris.areaTotal());
	}

	public static void OrdenarLista() {
		listaprismas.sort(null);
		Collections.reverse(listaprismas);
		System.out.println("=======");
		System.out.println("\nLas areas totales ordenadas de mayor a menor son:");
		for (Float x: listaprismas) {
			System.out.println("Prisma:"+listaprismas.indexOf(x)+" area total  "+x);
		}
	}
	
	/**
	 * Este metodo crea un numero aleatorio para la altura
	 * @return el numero creado.
	 */
	
	public static int  AleatorioAltura() {
		int AleatorioAltura = (int) (Math.random()*90)+11;
		return AleatorioAltura;
	}
	
	/**
	 * 
	 * @return
	 */

	public static int  AleatorioBase() {
		int AleatorioBase  = (int) (Math.random() * 9)+1;
		return AleatorioBase;
	}
}
