package ar.edu.unlam.dominio;

public enum Extras {
	PANCETA(200), HUEVO_FRITO(150), HUEVO_POCHE(180), CHAMPINIONES(100);
	
	private double precio;
	
	private Extras(double precio) {
		this.precio = precio;
	}
	
	public double getPrecio() {
		return precio;
	} 
}