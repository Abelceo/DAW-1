package modelo;

public class Piloto {
	
	//*******************atributos**************//
	private String nombre;
	private String equipo;
	private int edad;
	private boolean apto;
	
	
	//******************constructor/es*********//
	public Piloto() {
		 nombre = "anonimo";
		 equipo = "sin equipo";
		 edad = 30;
		 apto = true;
	}
	
	//*****************metodos*****************//
	public String puedoConducir() {
	
		if (apto == true) {
			return "si";
		}else {
			return "no";
			
		}
		
	}

	public void voyCopas() {
		System.out.println("estoy tomando copas");
		apto = false;//esta variable es importante porque delimita si el piloto puede o no conducir.
	}
	
	
	//****************getters y setters*****************//
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEquipo() {
		return equipo;
	}

	public void setEquipo(String equipo) {
		this.equipo = equipo;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public boolean isApto() {
		return apto;
	}

	public void setApto(boolean apto) {
		this.apto = apto;
	}
	
	
	
	
	//******************************metodo que me devuelve todo los atributos de pilotos********//
	
	public String getTodo() {
		return nombre + " " + equipo + " " + edad + " " + puedoConducir();
	}

	@Override
	public String toString() {
		return "Piloto [nombre=" + nombre + ", equipo=" + equipo + ", edad=" + edad + ", apto=" + apto + "]";
	}
	
	
	
	
	
	
	
	
	
	
}
