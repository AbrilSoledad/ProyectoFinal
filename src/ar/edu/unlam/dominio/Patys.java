package ar.edu.unlam.dominio;

public enum Patys {
	CARNE(700), POLLO(600), VEGETARIANO(550);
	
	private double precio;

	private Patys(double precio) {
		this.precio = precio;
	}

	public double getPrecio() {
		return precio;
	}
}