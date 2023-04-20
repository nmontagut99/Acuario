package entidades;

public class Tanque {
	// Atributos
	private byte id;
	private String nombre;
	private String color;
	private double volumen;
	// Constructores
	public Tanque() {
		
	}
	public Tanque(byte id, String nombre, String color, double volumen) {
		
		this.id = id;
		this.nombre = nombre;
		this.color = color;
		this.volumen = volumen;
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
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getVolumen() {
		return volumen;
	}
	public void setVolumen(double volumen) {
		this.volumen = volumen;
	}
	
}
