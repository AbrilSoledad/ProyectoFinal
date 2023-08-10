
package ar.edu.unlam.dominio;

import java.util.Random;

public class PEDIDO {

	private int costo;
	private Panes pan;
	private Patys paty;
	private Quesos queso;
	private Extras extras;
	private Verduras verdura;
	private Salsas salsa;
	private Combos combo;
	private Bebidas bebida;
	private int contadorDePanes;
	private int contadorDeQuesos;
	private int contadorDePatys;
	private int contadorDeVerduras;
	private int contadorDeExtras;
	private int contadorDeSalsas;
	private int contadorDeCombos;
	private int contadorDeBebidas;
	private String[] arrayBebidas;
	private String[] panes;
	private String[] quesos;
	private String[] patys;
	private String[] verduras;
	private String[] arrayExtras;
	private String[] arraySalsas;
	private String[] arrayCombos;
	private static double PRECIO_CAJITA = 400;
	Random aleatorio = new Random();

	public PEDIDO() {
		this.setPan(Panes.QUESO);
		this.setPaty(Patys.CARNE);
		this.setQueso(Quesos.CHEDDAR);
		this.setVerdura(Verduras.CEBOLLA_MORADA);
		this.setExtras(Extras.PANCETA);
		this.setSalsa(Salsas.MAYONESA);
		this.setCombo(Combos.MEDIO);
		this.setBebida(Bebidas.AGUA);
		this.costo = 0;
		panes = new String[1];
		contadorDePanes = 0;
		patys = new String[3];
		contadorDePatys = 0;
		quesos = new String[6];
		contadorDeQuesos = 0;
		verduras = new String[5];
		contadorDeVerduras = 0;
		arrayExtras = new String[4];
		contadorDeExtras = 0;
		arraySalsas = new String[3];
		contadorDeSalsas = 0;
		arrayCombos = new String[1];
		contadorDeCombos = 0;
		arrayBebidas = new String[1];
		contadorDeBebidas = 0;
	}

	public int getCosto() {
		return this.costo;
	}

	public void setCosto(int nuevoCosto) {
		this.costo = nuevoCosto;
	}

	public void agregarPan(Panes pan) {
		this.setPan(pan);
		this.costo += 20;
	}

	public void agregarPaty(Patys carne, int precio) {
		this.setPaty(carne);
		this.costo += precio;
	}

	public void agregarQueso(Quesos queso, int costo) {
		this.setQueso(queso);
		this.costo += costo;
	}

	public void agregarVerdura(Verduras verdura, int precio) {
		this.setVerdura(verdura);
		this.costo += precio;
	}

	public void agregarExtras(Extras extras, int precio) {
		this.setExtras(extras);
		this.costo += precio;
	}

	public void agregarSalsa(Salsas salsa, int costo) {
		this.setSalsa(salsa);
		this.costo += costo;
	}

	public void agregarCombo(Combos combo, int costo) {
		this.setCombo(combo);
		this.costo += costo;
	}

	public void agregarBebida(Bebidas bebida) {
		this.setBebida(bebida);
	}

	public void agregarCajitaFeliz() {
		this.costo += PRECIO_CAJITA;
	}

	public double getPrecioCajita() {
		return PRECIO_CAJITA;
	}

	public void agregarPanes(Panes tipoPan) {
		if (contadorDePanes < panes.length) {
			panes[contadorDePanes] = tipoPan.toString();
			contadorDePanes++;
		}
	}

	public String ingredienteTipoPan() {
		String ingredientes = "[ ";
		for (int i = 0; i < contadorDePanes; i++) {
			ingredientes += panes[i];
		}
		ingredientes += " ]";
		return ingredientes;
	}

	public void agregarMedallon(Patys paty) {
		if (contadorDePatys < patys.length) {
			patys[contadorDePatys] = paty.toString();
			contadorDePatys++;
		}
	}

	public String ingredientesMedallon() {
		String ingredientes = "[ ";
		for (int i = 0; i < contadorDePatys; i++) {
			ingredientes += patys[i];
			if (i < contadorDePatys - 1) {
				ingredientes += ", ";
			} else if (i == contadorDePatys - 1)
				ingredientes += " ]";
		}
		return ingredientes;
	}

	public void agregarQuesos(Quesos tipoQueso) {
		if (contadorDeQuesos < quesos.length) {
			quesos[contadorDeQuesos] = tipoQueso.toString();
			contadorDeQuesos++;
		}
	}

	public String ingredientesTipoQueso() {
		String ingredientes = "[ ";
		for (int i = 0; i < contadorDeQuesos; i++) {
			ingredientes += quesos[i];
			if (i < contadorDeQuesos - 1) {
				ingredientes += ", ";
			} else if (i == contadorDeQuesos - 1)
				ingredientes += " ]";
		}
		return ingredientes;
	}

	public void agregarVerduras(Verduras tipoVerduras) {
		if (contadorDeVerduras < verduras.length) {
			verduras[contadorDeVerduras] = tipoVerduras.toString();
			contadorDeVerduras++;
		}
	}

	public String ingredientesTipoVerduras() {
		String ingredientes = "[ ";
		for (int i = 0; i < contadorDeVerduras; i++) {
			ingredientes += verduras[i];
			if (i < contadorDeVerduras - 1) {
				ingredientes += ", ";
			} else if (i == contadorDeVerduras - 1)
				ingredientes += " ]";
		}
		return ingredientes;
	}

	public void agregarExtras(Extras tipoExtras) {
		if (contadorDeExtras < arrayExtras.length) {
			arrayExtras[contadorDeExtras] = tipoExtras.toString();
			contadorDeExtras++;
		}
	}

	public String ingredientesTipoExtras() {
		String ingredientes = "[ ";
		for (int i = 0; i < contadorDeExtras; i++) {
			ingredientes += arrayExtras[i];
			if (i < contadorDeExtras - 1) {
				ingredientes += ", ";
			} else if (i == contadorDeExtras - 1)
				ingredientes += " ]";
		}
		return ingredientes;
	}

	public void agregarSalsas(Salsas tipoSalsas) {
		if (contadorDeSalsas < arraySalsas.length) {
			arraySalsas[contadorDeSalsas] = tipoSalsas.toString();
			contadorDeSalsas++;
		}
	}

	public String ingredientesTipoSalsas() {
		String ingredientes = "[ ";
		for (int i = 0; i < contadorDeSalsas; i++) {
			ingredientes += arraySalsas[i];
			if (i < contadorDeSalsas - 1) {
				ingredientes += ", ";
			} else if (i == contadorDeSalsas - 1)
				ingredientes += " ]";
		}
		return ingredientes;
	}

	public void agregarCombos(Combos tipoCombo) {
		if (contadorDeCombos < arrayCombos.length) {
			arrayCombos[contadorDeCombos] = tipoCombo.toString();
			contadorDeCombos++;
		}
	}

	public String ingredienteTipoCombo() {
		String ingredientes = "[ ";
		for (int i = 0; i < contadorDeCombos; i++) {
			ingredientes += arrayCombos[i];
		}
		ingredientes += " ]";
		return ingredientes;
	}

	public void agregarBebidas(Bebidas tipoBebida) {
		if (contadorDeBebidas < arrayBebidas.length) {
			arrayBebidas[contadorDeBebidas] = tipoBebida.toString();
			contadorDeBebidas++;
		}
	}

	public String ingredienteTipoBebida() {
		String ingredientes = "[ ";
		for (int i = 0; i < contadorDeBebidas; i++) {
			ingredientes += arrayBebidas[i];
		}
		ingredientes += " ]";
		return ingredientes;
	}

	public String cajitaFeliz() {
		String[] arrayJuguetesSirenita = { "Ariel", "Principe Eric", "Sebastian", "Scuttle", "Flounder",
				"el Rey Triton", "Ursula", "Max" };
		int juguete = aleatorio.nextInt(arrayJuguetesSirenita.length);
		return arrayJuguetesSirenita[juguete];
	}

	@Override
	public String toString() {
		String result = " El resumen de su orden es: \n";

		for (int i = 0; i < panes.length; i++) {

			if (panes[i] != null && panes.length > 0)
				result += "\n |Pan/es elegido/s: " + panes[i] + "|";
		}

		for (int i = 0; i < patys.length; i++) {

			if (patys[i] != null && patys.length > 0)
				result += "\n |Paty/s elegido/s: " + patys[i] + "|";
		}

		for (int i = 0; i < quesos.length; i++) {

			if (quesos[i] != null && quesos.length > 0)
				result += "\n |Queso/s elegido/s: " + quesos[i] + "|";
		}

		for (int i = 0; i < arrayExtras.length; i++) {

			if (arrayExtras[i] != null && arrayExtras.length > 0)
				result += "\n |Extra/s elegido/s: " + arrayExtras[i] + "|";
		}

		for (int i = 0; i < verduras.length; i++) {

			if (verduras[i] != null && verduras.length > 0)
				result += "\n |Verdura/s elegida/s: " + verduras[i] + "|";
		}

		for (int i = 0; i < arraySalsas.length; i++) {

			if (arraySalsas[i] != null && arraySalsas.length > 0)
				result += "\n |Salsa/s elegida/s: " + arraySalsas[i] + "|";
		}

		for (int i = 0; i < arrayCombos.length; i++) {

			if (arrayCombos[i] != null && arrayCombos.length > 0)
				result += "\n |Combo elegido: " + arrayCombos[i] + "|";
		}

		for (int i = 0; i < arrayBebidas.length; i++) {

			if (arrayBebidas[i] != null && arrayBebidas.length > 0)
				result += "\n |Bebida elegida para el combo: " + arrayBebidas[i] + "|";
		}

		result += "\n |El costo total es de: $" + getCosto() + "|";
		return result;
	}

	public Panes getPan() {
		return pan;
	}

	public void setPan(Panes pan) {
		this.pan = pan;
	}

	public Patys getPaty() {
		return paty;
	}

	public void setPaty(Patys paty) {
		this.paty = paty;
	}

	public Quesos getQueso() {
		return queso;
	}

	public void setQueso(Quesos queso) {
		this.queso = queso;
	}

	public Extras getExtras() {
		return extras;
	}

	public void setExtras(Extras extras) {
		this.extras = extras;
	}

	public Verduras getVerdura() {
		return verdura;
	}

	public void setVerdura(Verduras verdura) {
		this.verdura = verdura;
	}

	public Salsas getSalsa() {
		return salsa;
	}

	public void setSalsa(Salsas salsa) {
		this.salsa = salsa;
	}

	public Combos getCombo() {
		return combo;
	}

	public void setCombo(Combos combo) {
		this.combo = combo;
	}

	public Bebidas getBebida() {
		return bebida;
	}

	public void setBebida(Bebidas bebida) {
		this.bebida = bebida;
	}

}