package ejercicio5;

abstract class Poligono {
	
	public int numLados;
	
	abstract double area();
    
	public Poligono(int numLados) {
		this.numLados=numLados;
	}
	
	public int getNumLados() {
		return numLados;
	}

	public void setNumLados(int numLados) {
		this.numLados = numLados;
	}
	
}
