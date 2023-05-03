package ejercicio5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Poligono> listpoligono = new ArrayList<>();
		int opc =0;
		
		while(opc!=4) {
			System.out.println("1. Introducir triangulo");
			System.out.println("2. Introducir rectangulo");
			System.out.println("3. Mostrar contenido del array");
			System.out.println("4. Salir");
			opc = sc.nextInt();
			
			switch(opc) {
			case 1:
				System.out.println("Introduzca los tres lados del triangulo");
				Triangulo trian = new Triangulo(3, sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
				listpoligono.add(trian);
				break;
			case 2:
				System.out.println("Introduzca dos lados del rectangulo");
				Rectangulo rect = new Rectangulo(2, sc.nextDouble(), sc.nextDouble());
				listpoligono.add(rect);
				break;
			case 3:
				for (int i = 0; i < listpoligono.size(); i++) {
		            System.out.println(listpoligono.get(i).toString() + ", área: " + listpoligono.get(i).area());
		        }
				break;
			case 4:
				System.out.println("Saliendo");
				break;
				default: System.out.println("Elija una de las opciones disponibles");
			}
		}
	
	sc.close();
	}

}
