package entidades;

public class Especie {
	// Atributos
	private byte id;
	private String nombre;
	private String alimento;
	
	// Contructores
	
	public Especie(byte id, String nombre, String alimento) {
		
		this.id = id;
		this.nombre = nombre;
		this.alimento = alimento;
	}
	public Especie() {
		
	}
	
	// Metodos
	public byte getId() {
		return id;
	}
	public void setId(byte id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getAlimento() {
		return alimento;
	}
	public void setAlimento(String alimento) {
		this.alimento = alimento;
	}
	
	
}
