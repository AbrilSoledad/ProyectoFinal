package ar.edu.unlam.dominio;

public enum Combos {
	
	GRANDE(800), MEDIO(650), CHICO (500);
	
	private double precio;
	
	private Combos(double precio) {
		this.precio = precio;
	}
	
	public double getCosto() {
		return precio;
	} 
	
}