package entidades;

public class Pez {
	private byte id;
	private String nombre;
	private String color;
	private double peso;
	
	private Tanque idTanque;
	private Especie idEspecie;
	
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
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public Tanque getIdTanque() {
		return idTanque;
	}
	public void setIdTanque(Tanque idTanque) {
		this.idTanque = idTanque;
	}
	public Especie getIdEspecie() {
		return idEspecie;
	}
	public void setIdEspecie(Especie idEspecie) {
		this.idEspecie = idEspecie;
	}
	
	
	
}
