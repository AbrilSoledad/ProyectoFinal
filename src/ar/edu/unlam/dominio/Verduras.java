package ar.edu.unlam.dominio;

public enum Verduras {
	LECHUGA(50), TOMATE(60), CEBOLLA_MORADA(60), ESPINACA(50), PEPINO(80), CEBOLLA_CARAMELIZADA(150);
	
	private double precio;
	
	private Verduras(double precio) {
		this.precio = precio;
	}
	
	public double getPrecio() {
		return precio;
	} 
}