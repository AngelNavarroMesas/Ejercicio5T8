package ejercicio5;

public class Rectangulo extends Poligono{

	public double lado1, lado2;

	public Rectangulo(int numLados, double lado1, double lado2) {
		super(numLados);
		this.lado1 = lado1;
		this.lado2 = lado2;
	}

	public double getLado1() {
		return lado1;
	}

	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}

	public double getLado2() {
		return lado2;
	}

	public void setLado2(double lado2) {
		if(lado2==lado1) {
			System.out.println("Para que sea un rectangulo los lados no pueden ser iguales");
		}else {
			this.lado2 = lado2;
		}
	}
	
	
	
}
