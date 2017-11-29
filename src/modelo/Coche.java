package modelo;

public class Coche {
	
	//***********************aqui colocamos los atributos o variables*************************
	
	private String color;//atributo
	private int kms;//atributo
	
	//***********************aqui colocamos los constructores( algunas veces no lo necesita)*************************
	
	public Coche() {//constructor
		color = "rojo";
		kms = 0;
	}
	
	//***********************aqui colocamos los metodos*************************
	
	public void avanza() {//metodo similar ( a cierra puerta) void hace pero no devuelve
		kms += 5;
	}
	
	
	
	public void avanzaAlgo(int kilometros) {//metodo al que le pasamos por parametro un valor entero desde la llamada
		if(kilometros>=0) {
			
			kms += kilometros;
		}else {
			System.out.println("por favor solo introduce valores positivos");
		}
				
		
	}
	
	
	
	
	public String llegasteAMeta() {//metodo que devuelve un String(dame vaso de agua  no es void)
		
		if (kms<20) {
			return "no has llegado a la meta";
		}else {
			return "lleguaste a la meta";
		}
		
		
				
				
				
		
	}
	
	
	//***********************************aqui colocamos los getter y setters****************************************

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getKms() {
		return kms;
	}

	public void setKms(int kms) {
		this.kms = kms;
	}

	@Override
	public String toString() {
		return "Coche [color=" + color + ", kms=" + kms + "]";
	}
	
	
	
		
	
	
	
	

}
