package principal;

import java.io.DataOutputStream;

import controlador.Dato;
import modelo.Coche;
import modelo.Piloto;

public class Principal {

	public static void main(String[] args) {
		
	Coche coche1 = new Coche();//creo un objeto de tipo Coche llamado coche1
	System.out.println("Kms actuales: " + coche1.getKms());//obtengo el valor del atributo kms atraves de un get
		
	coche1.avanza();//llamo al metodo avanza() que aumenta el valor del atributo kms
	System.out.println("Kms actuales: " + coche1.getKms());
	
	
	System.out.println( coche1.llegasteAMeta());//llamamos a un metodo (dame vaso de agua) que nos devuelve si hemos llegado a la meta.
	
	
	coche1.avanza();
	coche1.avanza();
	System.out.println("Kms actuales: " + coche1.getKms());
	
	coche1.avanzaAlgo(7);//llamo al metodo avanzaAlgo(7) que aumenta en 7 el valor del atributo kms.
	System.out.println("Kms actuales: " + coche1.getKms());
	
	coche1.avanzaAlgo(0);//llamo al metodo avanzaAlgo(-1) que disminuye en 1 el valor del atributo kms.
	System.out.println("Kms actuales: " + coche1.getKms());
	
	System.out.println( coche1.llegasteAMeta());// ahora el metodo nos devuelve la informacion de llegada.
	
	
	
	Piloto piloto1 = new Piloto();//creo un objeto de la clase piloto llamado piloto1.
	//
	System.out.println("mi nombre es: " +  piloto1.getNombre());//pregunto el valor del atributo nombre del objeto piloto1
	
	
	piloto1.setNombre("pepe");//estableciendo nuevo nombre en el objeto piloto1
	
	System.out.println("mi nombre es: " +  piloto1.getNombre()   );
	
	
	System.out.println("eres apto para conducir?: " +  piloto1.puedoConducir());//llamo a un metodo que me devuelve un string
	
	piloto1.voyCopas();//llamo a un metodo void (cierra la puerta)que asignara a apto el valor false.
	
	System.out.println("eres apto para conducir?: " +  piloto1.puedoConducir());
	
		
	Piloto piloto2 = new Piloto();
	piloto2.setNombre("Abel");
	
	
	Piloto piloto3 = new Piloto();
	piloto3.setNombre("Javi");
	
	//**************************************ARRAYS******************************************//
	
	int [] numeros;//declaramos la variable numeros como array de enteros.
	numeros= new int[3];//creamos 3 celdas al array de enteros llamado numeros.
	numeros[0] = 10;//asignamos el valor 10 a la celda 0 del array.
	numeros[1] = 11;
	numeros[2] = 12;
	System.out.println(numeros[2]);
	
	int [] numeros1 = {10,11,12};//declaramos la variable numeros1 como array de enteros y despues
								 //hemos creado el array con valores en cada celda.
	
	Piloto [] listadoPilotos = {piloto1,piloto2,piloto3};//array que contiene objetos de la clase pilotos
	
	//String [] listadoNombresPilotos = {piloto1.getNombre(),piloto2.getNombre(),piloto3.getNombre()};//es un array de string con los nombres de los objetos pilotos.
	
	
	for (int i = 0; i < listadoPilotos.length; i++) {//este for recorre el array de objetos Piloto.
		
		System.out.println(listadoPilotos[i].getTodo());//sacamos por pantalla cada uno de los objetos
														//piloto que contiene el array gracias a [i] y nos
														//apoyamos en el metodo .getTodo() para obtener los atributos de los pilotos.
	//	System.out.println(listadoNombresPilotos[i]);
	}
	//*************************************************************************************************
	
	String cosas;
	boolean apto;
	double decimales;
	char caracter = 'a';
	
	//*************************este formato es para cuando queremos introducir valores desde variables****
	int [] listaNumeros = new int[3];
	listaNumeros[0]= 1;
	listaNumeros[1]= 2;
	listaNumeros[2]= 3;
	
	//************************************este formato para cuando sabemos los valores en concreto*********
	int [] listaNumeros1 = {2,4,6};
		
	
	System.out.println("-----------------------");
	
	Dato dato1 = new Dato();
	dato1.imprimeListadoPilotos();
	dato1.imprimeListadoCoches();
	dato1.imprimeListadoObjetos(listadoPilotos);
	
	dato1.imprimeListadoObjetos(dato1.crearListadoCoches());
	
	
	//**************************************llamada al metodo que nos devuelve un array de numeros pares****
	
	int[] numerosLista = {1,3,5,6,8,2,9,12,19,22};
	int [] listaNPares = dato1.devuelmePares(numerosLista);
	for (int i = 0; i < listaNPares.length; i++) {
		System.out.println(listaNPares[i]);
	}
	
	System.out.println("-----------------------");
	
	
	int[] numerosLista1 = {10,32,13,24,75,46,75,62,84,23,95,12,19,22};
	 listaNPares = dato1.devuelmePares(numerosLista1);
	 dato1.imprimeListadoNumeros(listaNPares);
	
		 
	}
}
