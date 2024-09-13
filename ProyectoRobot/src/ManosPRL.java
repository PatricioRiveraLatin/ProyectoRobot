
public class ManosPRL {
	private int NumeroDedosPRL;
	private String MaterialManoPRL;
	
	
	//Constructo
	public ManosPRL(int NumeroDedosPRL, String MaterialManosPRL) {
		this.NumeroDedosPRL = NumeroDedosPRL;
		this.MaterialManoPRL = MaterialManosPRL;
	}
	
	
	//Constructo vacio
	public ManosPRL() {
		
	}
	

	public int getNumeroDedosPRL() {
		return NumeroDedosPRL;
	}

	public void setNumeroDedosPRL(int numeroDedosPRL) {
		NumeroDedosPRL = numeroDedosPRL;
	}

	public String getMaterialManoPRL() {
		return MaterialManoPRL;
	}

	public void setMaterialManoPRL(String materialManoPRL) {
		MaterialManoPRL = materialManoPRL;
	}
	
	//Metodo
	
	public void moverManoPRL() {
		System.out.println("El Robot mueve la mano");

	}
	




	

}
