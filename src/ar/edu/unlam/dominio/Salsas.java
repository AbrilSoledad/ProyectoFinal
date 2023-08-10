package ar.edu.unlam.dominio;

public enum Salsas {
	GUACAMOLE(150), MAYONESA(50), KETCHUP(50), BARBACOA(50), ALIOLI(120), PIMENTON(70), AHUMADA(70), CRIOLLA(80), CHIMICURRI(80);
	
	private double precio;
	
	private Salsas(double precio) {
		this.precio = precio;
	}
	
	public double getPrecio() {
		return precio;
	} 
}