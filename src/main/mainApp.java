package main;

import objetos.Persona;

/* 
 * @author: Raul
 * */
public class mainApp {

	public static void main(String[] args) {
		//Haz una clase llamada Persona que siga las siguientes condiciones:
//		• Sus atributos son: nombre, edad, DNI, sexo (H hombre, M mujer), peso y altura. No 
//		queremos que se accedan directamente a ellos. Piensa que modificador de acceso es el 
//		más adecuado, también su tipo. Si quieres añadir algún atributo puedes hacerlo.
//		• Por defecto, todos los atributos menos el DNI serán valores por defecto según su tipo (0 
//		números, cadena vacía para String, etc.). Sexo sera hombre por defecto, usa una 
//		constante para ello.
//		• Se implantaran varios constructores:
//		o Un constructor por defecto.
//		o Un constructor con el nombre, edad y sexo, el resto por defecto.
//		o Un constructor con todos los atributos como parámetro.

		Persona persona1 = new Persona();
		Persona persona2 = new Persona("Raul", 22, 'H');
		Persona persona3 = new Persona("Raul", 22,"49382375M", 'H', 1.70, 60);
		
		System.out.println(persona1.toString());
		System.out.println(persona2.toString());
		System.out.println(persona3.toString());
		
	}

}
