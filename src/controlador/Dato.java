package controlador;

import modelo.Coche;
import modelo.Piloto;

public class Dato {
	
	
	public Piloto[] crearListadoPilotos() {
		
		Piloto piloto1 = new Piloto();
		Piloto piloto2 = new Piloto();
		Piloto piloto3 = new Piloto();
		Piloto [] listadoPilotos = {piloto1,piloto2,piloto3};
		return listadoPilotos;
		}
	
	public Coche[] crearListadoCoches() {
		
		Coche coche1 = new Coche();
		Coche coche2 = new Coche();
		Coche coche3 = new Coche();
		Coche [] listadoCoches = {coche1,coche2,coche3};
		return listadoCoches;
		}
	
	public void imprimeListadoPilotos() {
		Piloto [] listado = crearListadoPilotos();
		for (int i = 0; i < listado.length; i++) {
			System.out.println(listado[i].toString());
			
		}
	}
	public void imprimeListadoCoches() {
		Coche [] listado = crearListadoCoches();
		for (int i = 0; i < listado.length; i++) {
			System.out.println(listado[i].toString());
			
		}
	}

	public void imprimeListadoObjetos(Object [] listado) {
			for (int i = 0; i < listado.length; i++) {
			System.out.println(listado[i].toString());//esto se puede considerar una API y genera listados de
														//cualquier tipo de objeto, el unico requisito es que la clase 
														//del objet tenga toString.
			
		}
		
	}
	//***********************************trabajar con array de enteros*********************************************************

public int[] devuelmePares(int [] numeros) {
	int contador = 0;
	for (int i = 0; i < numeros.length; i++) {
		if (numeros[i]%2==0) {
			contador++;
		}
	}
	
	int [] pares = new int[contador];
	int indice = 0;
	for (int i = 0; i < numeros.length; i++) {
		if (numeros[i]%2==0) {
			pares[indice] = numeros[i];
			indice++;
		}
	}
	return pares;
}

//************************************************metodo para imprimir un array de numeros*****************


	public void  imprimeListadoNumeros(int [] numeros){
	
		 for (int i = 0; i < numeros.length; i++) {
				System.out.println(numeros[i]);
		}
	}






}
