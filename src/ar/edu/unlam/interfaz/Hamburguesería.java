package ar.edu.unlam.interfaz;

import java.util.Scanner;
import ar.edu.unlam.dominio.Bebidas;
import ar.edu.unlam.dominio.Combos;
import ar.edu.unlam.dominio.PEDIDO;
import ar.edu.unlam.dominio.Panes;
import ar.edu.unlam.dominio.Patys;
import ar.edu.unlam.dominio.Quesos;
import ar.edu.unlam.dominio.Verduras;
import ar.edu.unlam.dominio.Extras;
import ar.edu.unlam.dominio.Salsas;
import ar.edu.unlam.dominio.MetodosDePago;

public class Hamburguesería {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		PEDIDO pedidoArmado = new PEDIDO();

		String rojo = "\033[31m";
		String verde = "\033[32m";
		String amarillo = "\033[33m";
		String celeste = "\033[36m";
		String reiniciar = "\u001B[0m";

		char confirmar = ' ';
		int respuesta;
		char eleccion;
		char estandar;
		boolean esEstandar = false;
		String direccion = null;
		int direccion2 = 0;

		System.out.println(amarillo + "Bienvenido a:" + reiniciar);
		System.out.println(amarillo
				+ "  __    __       __       ___      ___  _______   ____  ____   _______    _______  ____  ____   _______   ________  _______   _______    __          __             _______   _______    ____    \r\n"
				+ " /\" |  | \"\\     /\"\"\\     |\"  \\    /\"  ||   _  \"\\ (\"  _||_ \" | /\"      \\  /\" _   \"|(\"  _||_ \" | /\"     \"| /\"       )/\"     \"| /\"      \\  |\" \\        /\"\"\\           |   __ \"\\ |   _  \"\\  /  \" \\   \r\n"
				+ "(:  (__)  :)   /    \\     \\   \\  //   |(. |_)  :)|   (  ) : ||:        |(: ( \\___)|   (  ) : |(: ______)(:   \\___/(: ______)|:        | ||  |      /    \\          (. |__) :)(. |_)  :)/__|| |   \r\n"
				+ " \\/      \\/   /' /\\  \\    /\\\\  \\/.    ||:     \\/ (:  |  | . )|_____/   ) \\/ \\     (:  |  | . ) \\/    |   \\___  \\   \\/    |  |_____/   ) |:  |     /' /\\  \\         |:  ____/ |:     \\/    |: |   \r\n"
				+ " //  __  \\\\  //  __'  \\  |: \\.        |(|  _  \\\\  \\\\ \\__/ //  //      /  //  \\ ___ \\\\ \\__/ //  // ___)_   __/  \\\\  // ___)_  //      /  |.  |    //  __'  \\        (|  /     (|  _  \\\\   _\\  |   \r\n"
				+ "(:  (  )  :)/   /  \\\\  \\ |.  \\    /:  ||: |_)  :) /\\\\ __ //\\ |:  __   \\ (:   _(  _|/\\\\ __ //\\ (:      \"| /\" \\   :)(:      \"||:  __   \\  /\\  |\\  /   /  \\\\  \\      /|__/ \\    |: |_)  :) /\" \\_|\\  \r\n"
				+ " \\__|  |__/(___/    \\___)|___|\\__/|___|(_______/ (__________)|__|  \\___) \\_______)(__________) \\_______)(_______/  \\_______)|__|  \\___)(__\\_|_)(___/    \\___)    (_______)   (_______/ (_______) \r\n"
				+ "                                                                                                                                                                                                 "
				+ reiniciar);

		do {
			System.out.println(
					amarillo + "Ingrese 'L' para pedir en el local O 'D' para pedir por delivery por un 15% adicional"
							+ reiniciar);
			eleccion = teclado.next().toUpperCase().charAt(0);
		} while (eleccion != 'D' && eleccion != 'L');

		if (eleccion == 'L')
			System.out.println(amarillo + "Usted eligio retirar el pedido en el local" + reiniciar);

		if (eleccion == 'D') {
			System.out.println(amarillo + "Ingrese la calle para enviar el pedido: (NO debe contener espacios)" + reiniciar);
			direccion = teclado.next(); 
			System.out.println(amarillo + "Ingrese el numero para enviar el pedido: " + reiniciar);
			direccion2 = teclado.nextInt();
			System.out.println(verde + "Al costo de su pedido se le acaba de agregar un 15%\n" + reiniciar);
		}

		System.out.println(amarillo + "      __\r\n" + "      /\r\n" + "   .-/-.\r\n" + "   |'-'|\r\n" + "   |   |\r\n"
				+ "   |   |   .-\"\"\"\"-.\r\n" + "   \\___/  /' .  '. \\   \\|/\\//\r\n"
				+ "         (`-..:...-')  |`\"\"`|\r\n" + "          ;-......-;   |    |\r\n"
				+ "           '------'    \\____/" + reiniciar);
		System.out.println(amarillo
				+ "\nGenial! Si compra nuestra HAMBURGUESA ESTANDAR (con un ingrediente de cada paso para crear su hamburguesa) incluyendo papas y gaseosa su compra sera de"
				+ reiniciar + verde + " $2200" + reiniciar);
		System.out.println(
				amarillo + "Le gustaria la hamburguesa estandar? S/N - (Si ingresa otra tecla, su respuesta sera NO)"
						+ reiniciar);
		estandar = teclado.next().toUpperCase().charAt(0);

		if (estandar == 'S') {
			esEstandar = true;
			System.out.println(
					amarillo + "Usted eligio la hamburguesa estandar. Solo podra elegir un ingrediente de cada paso."
							+ reiniciar);
		}

		System.out.println(amarillo + "\nYa llego el momento esperado!" + reiniciar);
		System.out.println(amarillo
				+ "  __   ____  _  _   __         ____  _  _        ____  ____  ____   __   ____   __  \r\n"
				+ " / _\\ (  _ \\( \\/ ) / _\\       (_  _)/ )( \\      (  _ \\(  __)(    \\ (  ) (    \\ /  \\ \r\n"
				+ "/    \\ )   // \\/ \\/    \\        )(  ) \\/ (       ) __/ ) _)  ) D (  )(   ) D ((  O )\r\n"
				+ "\\_/\\_/(__\\_)\\_)(_/\\_/\\_/       (__) \\____/      (__)  (____)(____/ (__) (____/ \\__/ \n"
				+ reiniciar);
//PANES

		System.out.println(amarillo + "\n------------PANES------------\n" + reiniciar);
		for (int i = 1; i <= Panes.values().length; i++) {
			System.out.println(
					amarillo + i + "- " + Panes.values()[i - 1] + reiniciar + verde + " ...GRATIS!" + reiniciar);
		}
		do {
			System.out.println(amarillo + "\nQue pan desea?" + reiniciar);
			respuesta = teclado.nextInt();

			switch (respuesta) {
			case 1:
				System.out.println(amarillo + "Usted eligio el pan de " + Panes.QUESO + "\n" + reiniciar);
				break;
			case 2:
				System.out.println(amarillo + "Usted eligio el pan de " + Panes.PAPA + "\n" + reiniciar);
				break;
			case 3:
				System.out.println(amarillo + "Usted eligio el pan de " + Panes.QUESO + "\n" + reiniciar);
				break;
			case 4:
				System.out.println(amarillo + "Usted eligio el pan " + Panes.INTEGRAL + "\n" + reiniciar);
				break;
			default:
				System.out.println(rojo + "Opcion invalida. Intente nuevamente" + "\n" + reiniciar);
				break;
			}
		} while (respuesta < 1 || respuesta > 4);

// MEDALLONES:

		int cantidadPatys = 0;
		Patys tipoCarnes = Patys.CARNE;

		do {
			System.out.println(amarillo + "\n------------MEDALLONES------------\n" + reiniciar);
			if (esEstandar == true) { // SI ES ESTANDAR, ADVERTIRLE AL CLIENTE QUE SOLO PODRÁ ELEGIR UN MEDALLÓN
				System.out.println(rojo + "\nATENCION:" + reiniciar + amarillo
						+ " Usted ha seleccionado la opcion ESTANDAR, podra elegir un medallon" + reiniciar);
			}
			do {
				mostrarMenuPatys(verde, amarillo, reiniciar);

				System.out.println(amarillo + "\nQue medallon desea?" + reiniciar);
				respuesta = teclado.nextInt();

				switch (respuesta) {
				case 1: {
					System.out.println(amarillo + "Usted eligio " + Patys.CARNE + "\n" + reiniciar);
					pedidoArmado.agregarPaty(tipoCarnes, 700);
					pedidoArmado.agregarMedallon(Patys.CARNE);
					cantidadPatys++;
					break;
				}
				case 2: {
					System.out.println(amarillo + "Usted eligio " + Patys.POLLO + "\n" + reiniciar);
					pedidoArmado.agregarPaty(tipoCarnes, 600);
					pedidoArmado.agregarMedallon(Patys.POLLO);
					cantidadPatys++;
					break;
				}
				case 3: {
					System.out.println(amarillo + "Usted eligio " + Patys.VEGETARIANO + "\n" + reiniciar);
					pedidoArmado.agregarPaty(tipoCarnes, 550);
					pedidoArmado.agregarMedallon(Patys.VEGETARIANO);
					cantidadPatys++;
					break;
				}
				default:
					System.out.println(rojo + "Opcion invalida. Intente nuevamente" + reiniciar);
					break;
				}
			} while (respuesta < 1 || respuesta > 3);

			if (esEstandar == false) {
				System.out.println(
						amarillo + "Costo actual: " + reiniciar + verde + " $" + pedidoArmado.getCosto() + reiniciar);
				do {
					System.out.println(amarillo
							+ "\t-Pulse A para agregar otro medallon\n\t-Pulse C para continuar con el paso siguiente\n"
							+ reiniciar);
					confirmar = teclado.next().toUpperCase().charAt(0);
					if ((confirmar != 'A') && (confirmar != 'C')) {
						System.out.println(rojo + "Opcion invalida. Intente nuevamente" + reiniciar);
					}
				} while ((confirmar != 'A') && (confirmar != 'C'));
			}
		} while ((confirmar == 'A') && cantidadPatys <= 3 && esEstandar == false);
		System.out.println(amarillo + "El/los medallon/es de su hamburguesa son: " + pedidoArmado.ingredientesMedallon()
				+ "\n" + reiniciar);

		if (cantidadPatys == 4) {
			System.out.println(amarillo + "Llego a la cantidad maxima de medallones permitidos (4)\n" + reiniciar);
			System.out.println(amarillo + "Los medallones de su hamburguesa son: " + pedidoArmado.ingredientesMedallon()
					+ "\n" + reiniciar);
			System.out.println(
					amarillo + "Costo actual: " + reiniciar + verde + "$" + pedidoArmado.getCosto() + reiniciar);
		}

// QUESOS:

		System.out.println(amarillo + "\n------------QUESOS------------\n" + reiniciar);
		System.out.println(
				amarillo + "Desea algun queso en su hamburguesa? S/N - (Si ingresa otra tecla, su respuesta sera NO)"
						+ reiniciar);
		confirmar = teclado.next().toUpperCase().charAt(0);
		Quesos tipoQuesos = Quesos.AZUL;
		int cantidadQuesos = 0;
		if (confirmar == 'S') {
			do {
				if (esEstandar == true) { // SI ES ESTANDAR, ADVERTIRLE AL CLIENTE QUE SOLO PODRÁ ELEGIR UN QUESO
					System.out.println(rojo + "ATENCION:" + reiniciar + amarillo
							+ " Usted ha seleccionado la opcion ESTANDAR, solo podra elegir un queso" + reiniciar);
				}
				System.out.println(amarillo + "Elija los quesos que desea en su hamburguesa:\n" + reiniciar);

				do {
					mostrarMenu(verde, amarillo, reiniciar);
					System.out.println(amarillo + "\nQue queso desea?" + reiniciar);
					respuesta = teclado.nextInt();
					switch (respuesta) {
					case 1: 
						System.out.println(amarillo + "Usted eligio " + Quesos.CHEDDAR + reiniciar);
						pedidoArmado.agregarQueso(tipoQuesos, 100);
						pedidoArmado.agregarQuesos(Quesos.CHEDDAR);
						cantidadQuesos++;
						break;
					case 2: 
						System.out.println(amarillo + "Usted eligio " + Quesos.MUZZARELLA + reiniciar);
						pedidoArmado.agregarQueso(tipoQuesos, 100);
						pedidoArmado.agregarQuesos(Quesos.MUZZARELLA);
						cantidadQuesos++;
						break;
					case 3: 
						System.out.println(amarillo + "Usted eligio " + Quesos.AZUL + reiniciar);
						pedidoArmado.agregarQueso(tipoQuesos, 150);
						pedidoArmado.agregarQuesos(Quesos.AZUL);
						cantidadQuesos++;
						break;
					case 4: 
						System.out.println(amarillo + "Usted eligio " + Quesos.PROVOLONE + reiniciar);
						pedidoArmado.agregarQueso(tipoQuesos, 200);
						pedidoArmado.agregarQuesos(Quesos.PROVOLONE);
						cantidadQuesos++;
						break;
					case 5: 
						System.out.println(amarillo + "Usted eligio " + Quesos.PARMESANO + reiniciar);
						pedidoArmado.agregarQueso(tipoQuesos, 200);
						pedidoArmado.agregarQuesos(Quesos.PARMESANO);
						cantidadQuesos++;
						break;
					default:
						System.out.println(rojo + "Opcion invalida. Intente nuevamente" + reiniciar);
						break;
					}
				} while (respuesta < 1 || respuesta > 5);
				if (esEstandar == false) {
					System.out.println(amarillo + "Costo actual: " + reiniciar + verde + "$" + pedidoArmado.getCosto()
							+ reiniciar);
					do {
						System.out.println(amarillo
								+ "\t-Pulse A para agregar otro queso\n\t-Pulse C para continuar con los quesos elegidos\n"
								+ reiniciar);
						confirmar = teclado.next().toUpperCase().charAt(0);
						if ((confirmar != 'A') && (confirmar != 'C')) {
							System.out.println(rojo + "Opcion invalida... Intente nuevamente" + reiniciar);
						}
					} while ((confirmar != 'A') && (confirmar != 'C'));

				}
				System.out.println(amarillo + "El/los queso/s de su hamburguesa son: "
						+ pedidoArmado.ingredientesTipoQueso() + "\n" + reiniciar);
			} while ((confirmar == 'A') && cantidadQuesos <= 5 && esEstandar == false);
		}

		if (cantidadQuesos == 6) {
			System.out.println(rojo + "Llego a la cantidad maxima de quesos permitidos (6)\n" + reiniciar);
			System.out.println(amarillo + "Los quesos de su hamburguesa son: " + pedidoArmado.ingredientesTipoQueso()
					+ "\n" + reiniciar);
			System.out.println(
					amarillo + "Costo actual: " + reiniciar + verde + "$" + pedidoArmado.getCosto() + reiniciar);
		}

// VERDURAS:

		Verduras verdura = Verduras.LECHUGA;
		int cantidadVerduras = 0;

		System.out.println(
				amarillo + "\nDesea agregarle ingredeintes frescos a su pedido? S/N - (Si ingresa otra tecla, su respuesta sera NO)"
						+ reiniciar);
		confirmar = teclado.next().toUpperCase().charAt(0);
		if (confirmar == 'S') {
			System.out.println(amarillo + "\n------------INGREDIENTES FRESCOS------------\n" + reiniciar);
			do {
				if (esEstandar == true) { 
					System.out.println(rojo + "ATENCION: " + reiniciar + amarillo
							+ "Usted ha seleccionado la opcion ESTANDAR, solo podra elegir una verdura" + reiniciar);
				}
				do {
					mostrarMenuVerduras(verde, amarillo, reiniciar);
					respuesta = teclado.nextInt();
					switch (respuesta) {
					case 1:
						pedidoArmado.agregarVerdura(verdura, 50);
						System.out.println(amarillo + "Usted eligio " + Verduras.LECHUGA + reiniciar);
						pedidoArmado.agregarVerduras(Verduras.LECHUGA);
						break;
					case 2:
						pedidoArmado.agregarVerdura(verdura, 60);
						System.out.println(amarillo + "Usted eligio " + Verduras.TOMATE + reiniciar);
						pedidoArmado.agregarVerduras(Verduras.TOMATE);
						break;
					case 3:
						pedidoArmado.agregarVerdura(verdura, 60);
						System.out.println(amarillo + "Usted eligio " +  Verduras.CEBOLLA_MORADA + reiniciar);
						pedidoArmado.agregarVerduras(Verduras.CEBOLLA_MORADA);
						break;
					case 4:
						pedidoArmado.agregarVerdura(verdura, 50);
						System.out.println(amarillo + "Usted eligio " + Verduras.ESPINACA + reiniciar);
						pedidoArmado.agregarVerduras(Verduras.ESPINACA);
						break;
					case 5:
						pedidoArmado.agregarVerdura(verdura, 80);
						System.out.println(amarillo + "Usted eligio " + Verduras.PEPINO + reiniciar);
						pedidoArmado.agregarVerduras(Verduras.PEPINO);
						break;
					case 6:
						System.out.println(amarillo + "Usted eligio " + Verduras.CEBOLLA_CARAMELIZADA + reiniciar);
						pedidoArmado.agregarVerdura(verdura, 150);
						pedidoArmado.agregarVerduras(Verduras.CEBOLLA_CARAMELIZADA);
						break;
					default:
						System.out.println(rojo + "Opcion invalida. Intente nuevamente" + reiniciar);
						break;
					}
				} while (respuesta < 1 || respuesta > 6);

				if (esEstandar == false) {
					System.out.println(amarillo + "Costo actual: $" + pedidoArmado.getCosto() + reiniciar);
					do {
						System.out.println(amarillo
								+ "\t-Pulse A para agregar otra verdura\n\t-Pulse C para continuar con las verduras elegidas\n"
								+ reiniciar);
						confirmar = teclado.next().toUpperCase().charAt(0);
						if ((confirmar != 'A') && (confirmar != 'C')) {
							System.out.println(rojo + "Opcion invalida. Intente nuevamente" + reiniciar);
						}
					} while ((confirmar != 'A') && (confirmar != 'C'));
				}
			} while ((confirmar == 'A') && cantidadVerduras <= 4);
			System.out.println(amarillo + "El/las verdura/s de su hamburguesa son: "
					+ pedidoArmado.ingredientesTipoVerduras() + "\n" + reiniciar);

			if (cantidadVerduras == 5) {
				System.out.println(rojo + "Llego a la cantidad maxima de verduras permitidas (5)\n" + reiniciar);
				System.out.println(amarillo + "\nSus verduras elegidas son: " + pedidoArmado.ingredientesTipoVerduras()
						+ "\n" + reiniciar);
				System.out.println(
						amarillo + "Costo actual: " + reiniciar + verde + "$" + pedidoArmado.getCosto() + reiniciar);
			}
		}

// EXTRAS:

		Extras extra = Extras.PANCETA;
		int cantidadExtras = 0;

		System.out.println(amarillo
				+ "\nDesea agregarle mas ingredientes a su pedido? S/N - (Si ingresa otra tecla, su respuesta sera NO)"
				+ reiniciar);
		confirmar = teclado.next().toUpperCase().charAt(0);
		if (confirmar == 'S') {
			System.out.println(amarillo + "\n------------INGREDIENTES EXTRAS------------\n" + reiniciar);
			do {
				if (esEstandar == true) { 
					System.out.println(rojo + "ATENCION: " + reiniciar + amarillo
							+ " Usted ha seleccionado la opcion ESTANDAR, solo podra elegir un ingrediente extra"
							+ reiniciar);
				}
				do {
					for (int i = 0; i < Extras.values().length; i++) {
						Extras extras = Extras.values()[i];
						System.out.println(amarillo + "\t" + (i + 1) + ": " + extras + verde + " - $"
								+ extra.getPrecio() + reiniciar);
					}
					respuesta = teclado.nextInt();

					switch (respuesta) {
					case 1:
						pedidoArmado.agregarExtras(extra, 200);
						System.out.println(amarillo + "Usted eligio " + Extras.PANCETA + reiniciar);
						pedidoArmado.agregarExtras(Extras.PANCETA);
						break;
					case 2:
						pedidoArmado.agregarExtras(extra, 150);
						System.out.println(amarillo + "Usted eligio " + Extras.HUEVO_FRITO + reiniciar);
						pedidoArmado.agregarExtras(Extras.HUEVO_FRITO);
						break;
					case 3:
						pedidoArmado.agregarExtras(extra, 180);
						System.out.println(amarillo + "Usted eligio " + Extras.HUEVO_POCHE + reiniciar);
						pedidoArmado.agregarExtras(Extras.HUEVO_POCHE);
						break;
					case 4:
						pedidoArmado.agregarExtras(extra, 100);
						System.out.println(amarillo + "Usted eligio " + Extras.CHAMPINIONES + reiniciar);
						pedidoArmado.agregarExtras(Extras.CHAMPINIONES);
						break;
					default:
						System.out.println(rojo + "Opcion invalida. Intente nuevamente" + reiniciar);
						break;
					}
				} while (respuesta < 1 || respuesta > 4);

				if (esEstandar == false) {
					System.out.println(amarillo + "Costo actual: " + reiniciar + verde + "$" + pedidoArmado.getCosto()
							+ reiniciar);
					do {
						System.out.println(amarillo
								+ "\t-Pulse A para agregar mas ingredientes\n\t-Pulse C para continuar con los ingredientes elegidos\n"
								+ reiniciar);
						confirmar = teclado.next().toUpperCase().charAt(0);
						if ((confirmar != 'A') && (confirmar != 'C')) {
							System.out.println(rojo + "Opcion invalida. Intente nuevamente" + reiniciar);
						}
					} while ((confirmar != 'A') && (confirmar != 'C'));
				}
			} while ((confirmar == 'A') && cantidadExtras <= 3);
			System.out.println(amarillo + "El/los extra/s de su hamburguesa son: "
					+ pedidoArmado.ingredientesTipoExtras() + "\n" + reiniciar);
		}

		if (cantidadExtras == 4) {
			System.out.println(rojo + "Llego a la cantidad maxima de extras permitidos (4)\n" + reiniciar);
			System.out.println(amarillo + "Los ingredientes extras de su hamburguesa son: " + pedidoArmado.ingredientesTipoExtras()
					+ "\n" + reiniciar);
			System.out.println(
					amarillo + "Costo actual: " + reiniciar + verde + "$" + pedidoArmado.getCosto() + reiniciar);
		}

		// SALSAS:

		Salsas salsa = Salsas.GUACAMOLE;

		System.out.println(
				amarillo + "Desea alguna salsa en su hamburguesa? S/N - (Si ingresa otra tecla, su respuesta sera NO)"
						+ reiniciar);
		confirmar = teclado.next().charAt(0);
		int cantidadSalsas = 0;

		if (confirmar == 'S' || confirmar == 's') {
			System.out.println(amarillo + "\n------------SALSAS------------\n" + reiniciar);
			do {
				if (esEstandar == true) { 
					System.out.println(rojo + "ATENCION: " + reiniciar + amarillo
							+ "Usted ha seleccionado la opcion ESTANDAR, solo podra elegir una salsa" + reiniciar);
				}
				cantidadSalsas++;
				System.out.println(amarillo + "Elija las salsas que desea en su hamburguesa:\n" + reiniciar);

				do {
					for (int i = 0; i < Salsas.values().length; i++) {
						salsa = Salsas.values()[i];
						System.out.println(amarillo + "\t" + (i + 1) + ": " + salsa + reiniciar + verde + " - $"
								+ salsa.getPrecio() + reiniciar);
					}
					System.out.println(amarillo + "\nQue salsa desea?" + reiniciar);
					respuesta = teclado.nextInt();

					switch (respuesta) {
					case 1: 
						System.out.println(amarillo + "Usted eligio " + Salsas.GUACAMOLE + reiniciar);
						pedidoArmado.agregarSalsa(salsa, 150); 
						pedidoArmado.agregarSalsas(Salsas.GUACAMOLE);
						break;
					case 2: 
						System.out.println(amarillo + "Usted eligio " + Salsas.MAYONESA + reiniciar);
						pedidoArmado.agregarSalsa(salsa, 50);
						pedidoArmado.agregarSalsas(Salsas.MAYONESA);
						break;
					case 3: 
						System.out.println(amarillo + "Usted eligio " + Salsas.KETCHUP + reiniciar);
						pedidoArmado.agregarSalsa(salsa, 50);
						pedidoArmado.agregarSalsas(Salsas.KETCHUP);
						break;
					case 4: 
						System.out.println(amarillo + "Usted eligio " + Salsas.BARBACOA + reiniciar);
						pedidoArmado.agregarSalsa(salsa, 50);
						pedidoArmado.agregarSalsas(Salsas.BARBACOA);
						break;
					case 5: 
						System.out.println(amarillo + "Usted eligio " + Salsas.ALIOLI + reiniciar);
						pedidoArmado.agregarSalsa(salsa, 120);
						pedidoArmado.agregarSalsas(Salsas.ALIOLI);
						break;
					case 6: 
						System.out.println(amarillo + "Usted eligio " + Salsas.PIMENTON + reiniciar);
						pedidoArmado.agregarSalsa(salsa, 70);
						pedidoArmado.agregarSalsas(Salsas.PIMENTON);
						break;
					case 7: 
						System.out.println(amarillo + "Usted eligio " + Salsas.AHUMADA + reiniciar);
						pedidoArmado.agregarSalsa(salsa, 70);
						pedidoArmado.agregarSalsas(Salsas.AHUMADA);
						break;
					case 8: 
						System.out.println(amarillo + "Usted eligio " + Salsas.CRIOLLA + reiniciar);
						pedidoArmado.agregarSalsa(salsa, 80);
						pedidoArmado.agregarSalsas(Salsas.CRIOLLA);
						break;
					case 9: 
						System.out.println(amarillo + "Usted eligi " + Salsas.CHIMICURRI + reiniciar);
						pedidoArmado.agregarSalsa(salsa, 80);
						pedidoArmado.agregarSalsas(Salsas.CHIMICURRI);
						break;
					default:
						System.out.println(rojo + "Opcin invalida. Intente nuevamente" + reiniciar);
						break;
					}
				} while (respuesta < 1 || respuesta > 9);

				if (esEstandar == false) {
					System.out.println(amarillo + "Costo actual: " + reiniciar + verde + "$" + pedidoArmado.getCosto()
							+ reiniciar);
					do {
						System.out.println(amarillo
								+ "\t-Pulse A para agregar otra salsa\n\t-Pulse C para continuar con las salsas elegidas\n"
								+ reiniciar);
						confirmar = teclado.next().toUpperCase().charAt(0);
						if ((confirmar != 'A') && (confirmar != 'C')) {
							System.out.println(rojo + "Opcion invalida. Intente nuevamente" + reiniciar);
						}
					} while ((confirmar != 'A') && (confirmar != 'C'));
				}
			} while ((confirmar == 'A') && cantidadSalsas <= 2);
			System.out.println(amarillo + "La/las salsa/s de su hamburguesa son: "
					+ pedidoArmado.ingredientesTipoSalsas() + "\n" + reiniciar);

			if (cantidadSalsas == 3) {
				System.out.println(rojo + "Llego a la cantidad maxima de salsas permitidas (3)\n" + reiniciar);
				System.out.println(amarillo + "Las salsas de su hamburguesa son: "
						+ pedidoArmado.ingredientesTipoSalsas() + "\n" + reiniciar);
				System.out.println(
						amarillo + "Costo actual: " + reiniciar + verde + "$" + pedidoArmado.getCosto() + reiniciar);
			}
		}

// COMBOS:

		Combos combo = Combos.MEDIO;
		Bebidas bebida = Bebidas.COCACOLA;

		if (!esEstandar) {
			System.out.println(amarillo
					+ "\nDesea agregarle un combo con gaseosa y papas fritas a su pedido? S/N - (Si ingresa otra tecla, su respuesta sera NO)"
					+ reiniciar);
			confirmar = teclado.next().toUpperCase().charAt(0);
		} else {
			System.out.println(
					amarillo + "Recuerde que el combo estandar incluye bebida y papas medianas..." + reiniciar);
			confirmar = 'N';
		}
		do {
			if (confirmar == 'S') {

				do {
					System.out.println(amarillo + "\n------------COMBOS------------\n" + reiniciar);
					for (int i = 0; i < Combos.values().length; i++) {
						Combos combos = Combos.values()[i];
						System.out.println(amarillo + "\t" + (i + 1) + ": " + combos + reiniciar + verde + " - $"
								+ combos.getCosto() + reiniciar);
					}
					respuesta = teclado.nextInt();
					switch (respuesta) {
					case 1:
						pedidoArmado.agregarCombo(combo, 800);
						pedidoArmado.agregarCombos(Combos.GRANDE);
						System.out.println(amarillo + "Usted eligio el combo: " + Combos.GRANDE + reiniciar);
						break;
					case 2:
						pedidoArmado.agregarCombo(combo, 650);
						pedidoArmado.agregarCombos(Combos.MEDIO);
						System.out.println(amarillo + "Usted eligio el combo: " + Combos.MEDIO + reiniciar);
						break;
					case 3:
						pedidoArmado.agregarCombo(combo, 500);
						pedidoArmado.agregarCombos(Combos.CHICO);
						System.out.println(amarillo + "Usted eligio el combo: " + Combos.CHICO + reiniciar);
						break;
					default:
						System.out.println(amarillo + "Opcion invalida. Intente nuevamente" + reiniciar);
						break;
					}
				} while (respuesta < 1 || respuesta > Combos.values().length);
				do {
					System.out.println(amarillo + "\n------------BEBIDAS------------\n" + reiniciar);
					for (int i = 0; i < Bebidas.values().length; i++) {
						Bebidas bebidas = Bebidas.values()[i];
						System.out.println(amarillo + "\t" + (i + 1) + ": " + bebidas + reiniciar);
					}
					respuesta = teclado.nextInt();
					switch (respuesta) {
					case 1:
						pedidoArmado.agregarBebida(bebida);
						pedidoArmado.agregarBebidas(Bebidas.COCACOLA);
						System.out.println(amarillo + "Usted eligio: " + Bebidas.COCACOLA + reiniciar);
						break;
					case 2:
						pedidoArmado.agregarBebida(bebida);
						pedidoArmado.agregarBebidas(Bebidas.FANTA);
						System.out.println(amarillo + "Usted eligio: " + Bebidas.FANTA + reiniciar);
						break;
					case 3:
						pedidoArmado.agregarBebida(bebida);
						pedidoArmado.agregarBebidas(Bebidas.SPRITE);
						System.out.println(amarillo + "Usted eligio: " + Bebidas.SPRITE + reiniciar);
						break;
					case 4:
						pedidoArmado.agregarBebida(bebida);
						pedidoArmado.agregarBebidas(Bebidas.AGUA);
						System.out.println(amarillo + "Usted eligio: " + Bebidas.AGUA + reiniciar);
						break;
					case 5:
						pedidoArmado.agregarBebida(bebida);
						pedidoArmado.agregarBebidas(Bebidas.JUGO);
						System.out.println(amarillo + "Usted eligio: " + Bebidas.JUGO + reiniciar);
						break;
					case 6:
						pedidoArmado.agregarBebida(bebida);
						pedidoArmado.agregarBebidas(Bebidas.COCAZERO);
						System.out.println(amarillo + "Usted eligio: " + Bebidas.COCAZERO + reiniciar);
						break;
					case 7:
						pedidoArmado.agregarBebida(bebida);
						pedidoArmado.agregarBebidas(Bebidas.POMELO);
						System.out.println(amarillo + "Usted eligio: " + Bebidas.POMELO + reiniciar);
						break;
					default:
						System.out.println(rojo + "Opcion invalida. Intente nuevamente" + reiniciar);
						break;
					}
				} while (respuesta < 1 || respuesta > 7);
				System.out.println(
						amarillo + "El combo elegido es el: " + pedidoArmado.ingredienteTipoCombo() + "\n" + reiniciar);
				System.out.println(amarillo + "La bebida elegida para el combo es : "
						+ pedidoArmado.ingredienteTipoBebida() + "\n" + reiniciar);
				System.out.println(
						amarillo + "Costo actual: " + reiniciar + verde + "$" + pedidoArmado.getCosto() + reiniciar);
			}
		} while (confirmar == 'S');

// CAJITA FELIZ		

		boolean agregoCajitaFeliz = false;
		System.out.println(celeste + "\n\nLlegan nadando a Cajita Feliz los nuevos juguetes de La Sirenita, de Disney!"
				+ reiniciar);
		System.out.println(celeste + "               _\r\n" + "            ,=\"` `\"\"=,       o\r\n"
				+ "           /   ,==\"\"\"'=;        , __\r\n"
				+ "   ~      /      ,--'/=,)  o    \\`\\\\\"._     _,\r\n"
				+ "         |   .='/ <@(@.=\"       / _  |||;._//)\r\n"
				+ "        /     (J    ^\\ \\     o_/@ @  ///  |=(\r\n"
				+ "      .'    .' \\  '='/  '-.  ( (`__,     ,`\\|\r\n"
				+ "     /     /    \\`-;_      \\  '.\\_/ |\\_.'   \r\n"
				+ "~   /      |   /` _  \\      )   `\"\"```\r\n" + "   | ,     ;  /`\\/ `\\ \\    /.-._///_\r\n"
				+ "   |/     '   \\_,\\__/\\ \\.-'.'----'`\r\n" + "    \\|     '.   \\     \\   /`-,   ~\r\n"
				+ "      `\\     _.-'\\    (`-`  .'\r\n" + "        `-.-' _.-')__./,--'\r\n"
				+ "     .--'`,-'`'\"\"`    ` \\\r\n" + "    /`\"`-`               |          ~\r\n"
				+ "   |                     /\r\n" + "~  |     .-'__         .'\r\n" + "    \\   ;'\"`  `\"\"----'`\r\n"
				+ "     \\   \\\r\n" + "      '.  `\\\r\n" + "        )   `-.            ~\r\n"
				+ "       /       `-._\r\n" + "      |     ,      `-,\r\n" + "   ~  \\   .' `''----`\r\n"
				+ "       `.(\r\n" + "         `" + reiniciar);
		System.out.println(celeste + "Quiere incluir una Cajita Feliz con su pedido por " + reiniciar + verde + "$"
				+ pedidoArmado.getPrecioCajita() + reiniciar + celeste
				+ " adicionales? S/N - (Si ingresa otra tecla, su respuesta sera NO)" + reiniciar);
		confirmar = teclado.next().toUpperCase().charAt(0);
		if (confirmar == 'S') {
			pedidoArmado.agregarCajitaFeliz();
			agregoCajitaFeliz = true;
			System.out.println(amarillo + "Cajita Feliz incluida por " + reiniciar + verde + "$"
					+ pedidoArmado.getPrecioCajita() + " adicionales" + reiniciar);
			System.out.println(
					amarillo + "Costo actual: " + reiniciar + verde + "$" + pedidoArmado.getCosto() + reiniciar);
		}

// RESUMEN Y SUBTOTAL	

		if (esEstandar == true)
			pedidoArmado.setCosto(2200);
		System.out.println(amarillo + "\n" + pedidoArmado.toString() + reiniciar);
		if (direccion != null)
			System.out.println(
					amarillo + "\nLa direccion a la cual enviar el pedido es: " + direccion + " " + direccion2 + reiniciar);
		System.out.println(amarillo + "\nSubtotal: " + reiniciar + verde + "$" + pedidoArmado.getCosto() + reiniciar);

//METODOS DE PAGO		

		double delivery = pedidoArmado.getCosto() * 0.15;
		double descuento = pedidoArmado.getCosto() * 0.1;
		boolean descuentoEfectivo = false;
		boolean recargoTarjeta = false;

		do {
			System.out.println(amarillo + "\n------------METODOS DE PAGO------------\n" + reiniciar);
			for (int i = 1; i <= MetodosDePago.values().length; i++) {
				System.out.println(amarillo + "Ingrese " + i + " para pagar en " + reiniciar + verde
						+ MetodosDePago.values()[i - 1] + reiniciar);
			}

			respuesta = teclado.nextInt();
			switch (respuesta) {
			case 1:
				System.out.println(verde + "Al abonar en efectivo tiene un 10% de descuento" + reiniciar);
				System.out.println(amarillo + "El importe ha abonar en efectivo es de: " + reiniciar + verde + " $"
						+ (pedidoArmado.getCosto() - descuento) + reiniciar);
				descuentoEfectivo = true;
				break;
			case 2:
				System.out.println(amarillo + "El importe ha abonar por MercadoPago es de: " + reiniciar + verde + " $"
						+ pedidoArmado.getCosto() + reiniciar);
				break;
			case 3:
				System.out.println(verde + "Al abonar con tarjeta de credito tiene un 10% de recargo" + reiniciar);
				System.out.println(amarillo + "El importe ha abonar con tarjeta de credito es de: $" + reiniciar + verde
						+ " $" + (pedidoArmado.getCosto() + descuento) + reiniciar);
				recargoTarjeta = true;
				break;
			case 4:
				System.out.println(amarillo + "El importe ha abonar con tarjeta de debito es de: " + reiniciar + verde
						+ " $" + pedidoArmado.getCosto() + reiniciar);
				break;
			case 5:
				System.out.println(amarillo + "El importe ha abonar por transferecia bancaria es de: " + reiniciar
						+ verde + " $" + pedidoArmado.getCosto() + reiniciar);
				break;
			default:
				System.out.println(rojo + "Ingrese un metodo de pago valido" + reiniciar);
				break;
			}
		} while (respuesta < 1 || respuesta > 5);

// TOTAL		

		if (descuentoEfectivo == false && recargoTarjeta == false && direccion != null) {
			System.out.println(amarillo + "\nTotal Final con el delivery a su domicilio: " + reiniciar + verde + "$"
					+ (pedidoArmado.getCosto() + delivery) + reiniciar);
		} else if (recargoTarjeta == true && direccion != null) {
			System.out.println(
					amarillo + "\nTotal Final con el recargo por pagar con tarjeta y el delivery a su domicilio: "
							+ reiniciar + verde + "$" + (pedidoArmado.getCosto() + descuento + delivery) + reiniciar);
		} else if (descuentoEfectivo == true && direccion != null) {
			System.out.println(
					amarillo + "\nTotal Final con el descuento por pagar en efectivo y el delivery a su domicilio: "
							+ reiniciar + verde + "$" + (pedidoArmado.getCosto() - descuento + delivery) + reiniciar);
		} else if (descuentoEfectivo == true) {
			System.out.println(amarillo + "\nTotal Final con el descuento por pagar en efectivo: " + reiniciar + verde
					+ "$" + (pedidoArmado.getCosto() - descuento) + reiniciar);
		} else if (recargoTarjeta == true) {
			System.out.println(amarillo + "\nTotal Final con el recargo por pagar con tarjeta: " + reiniciar + verde
					+ "$" + (pedidoArmado.getCosto() + descuento) + reiniciar);
		} else
			System.out.println(
					amarillo + "\nTotal Final: " + reiniciar + verde + "$" + pedidoArmado.getCosto() + reiniciar);

// FINAL

		System.out.println(
				amarillo + "\nConfirma su compra? S/N - (Si ingresa otra tecla, su respuesta sera NO)" + reiniciar);
		eleccion = teclado.next().toUpperCase().charAt(0);
		if (eleccion == 's' || eleccion == 'S') {
			System.out.println(verde + "\nCompra confirmada" + reiniciar);

			if (agregoCajitaFeliz == true) {
				System.out.println(celeste
						+ "\nQuiere abrir su Cajita Feliz y ver que juguete le toco? S/N - (Si ingresa otra tecla, su respuesta será NO)"
						+ reiniciar);
				confirmar = teclado.next().charAt(0);
				if (confirmar == 'S' || confirmar == 's')
					System.out.println(
							celeste + "A usted le toco el juguete de " + pedidoArmado.cajitaFeliz() + "!" + reiniciar);
			}

			System.out.println(amarillo
					+ " _  _  _  _   ___  _  _   __   ____         ___  ____   __    ___   __    __   ____   _   \r\n"
					+ "( \\/ )/ )( \\ / __)/ )( \\ / _\\ / ___)       / __)(  _ \\ / _\\  / __) (  )  / _\\ / ___) / \\  \r\n"
					+ "/ \\/ \\) \\/ (( (__ ) __ (/    \\\\___ \\      ( (_ \\ )   //    \\( (__   )(  /    \\\\___ \\ \\_/  \r\n"
					+ "\\_)(_/\\____/ \\___)\\_)(_/\\_/\\_/(____/       \\___/(__\\_)\\_/\\_/ \\___) (__) \\_/\\_/(____/ (_)  "
					+ reiniciar);
			System.out.println(amarillo + "\nY vuelva pronto!!!" + reiniciar);

		} else
			System.out.println(amarillo + "\nPerfectamente entendible, que tenga un buen día" + reiniciar);

		teclado.close();
	}

	private static void mostrarMenuVerduras(String verde, String amarillo, String reiniciar) {
		for (int i = 0; i < Verduras.values().length; i++) {
			Verduras verduras = Verduras.values()[i];
			System.out.println(amarillo + "\t" + (i + 1) + ": " + verduras + reiniciar + verde + " - $"
					+ verduras.getPrecio() + reiniciar);
		}
	}

	private static void mostrarMenuPatys(String verde, String amarillo, String reiniciar) {
		for (int i = 0; i < Patys.values().length; i++) {
			System.out.println(amarillo + "Ingrese " + (i + 1) + " para " + Patys.values()[i] + reiniciar + verde + " $"
					+ Patys.values()[i].getPrecio() + reiniciar);
		}
	}

	private static void mostrarMenu(String verde, String amarillo, String reiniciar) {
		for (int i = 0; i < Quesos.values().length; i++) {
			System.out.println(amarillo + "Ingrese " + (i + 1) + " para  " + Quesos.values()[i] + reiniciar + verde
					+ " $" + Quesos.values()[i].getPrecio() + reiniciar);
		}
	}

}
