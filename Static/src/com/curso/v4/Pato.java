package com.curso.v4;

public class Pato {
	
	//VARIABLES DE INSTANCIA DE CLASE
	String nombre; //null
	
	//VARIABLE DE CLASE
	static int contador; //0
	
	Pato(String nombre) {
		this.nombre = nombre;
		++contador; //contador = contador + 1
	}

	@Override
	public String toString() {
		return "Pato [nombre=" + nombre + "]";
	}	

	//METODO DE CLASE
	static int getContador() {
		return contador;
	}

}
