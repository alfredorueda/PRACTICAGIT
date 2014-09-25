package practicaGit;

public class Coche {

	private String matricula;
	private int anyoFabricacion;
	private int cilindrada;
	private int caballos;
	private String marca;
	private String modelo;
	private String propietario;
	
	public Coche(String matricula, int anyoFabricacion, int cilindrada,
			int caballos, String marca, String modelo, String propietario) {
		super();
		this.matricula = matricula;
		this.anyoFabricacion = anyoFabricacion;
		this.cilindrada = cilindrada;
		this.caballos = caballos;
		this.marca = marca;
		this.modelo = modelo;
		this.propietario = propietario;
	}
	
	public String getMatricula() {
		return matricula;
	}

	public int getAnyoFabricacion() {
		return anyoFabricacion;
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public int getCaballos() {
		return caballos;
	}

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	public String getPropietario() {
		return propietario;
	}

	@Override
	public String toString() {
		return "\nCoche ["
				+ (matricula != null ? "matricula=" + matricula + ", " : "")
				+ "anyoFabricacion=" + anyoFabricacion + ", cilindrada="
				+ cilindrada + ", caballos=" + caballos + ", "
				+ (marca != null ? "marca=" + marca + ", " : "")
				+ (modelo != null ? "modelo=" + modelo + ", " : "")
				+ (propietario != null ? "propietario=" + propietario : "")
				+ "] \n";
	}
}
