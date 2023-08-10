package ar.edu.unlam.dominio;

public enum Quesos {
    CHEDDAR(100), MUZZARELLA(100), AZUL(150), PROVOLONE(200), PARMESANO(200);


    private double precio;
    Quesos(double precio) {
        this.precio = precio;
    }

    public double getPrecio() {
        return this.precio;
    } 

}