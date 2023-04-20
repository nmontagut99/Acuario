package entidades;

import java.util.Date;

public class Evento {
	private byte id;
	private Date fecha;
	private String nota;
	
	private Pez pez;

	public byte getId() {
		return id;
	}

	public void setId(byte id) {
		this.id = id;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getNota() {
		return nota;
	}

	public void setNota(String nota) {
		this.nota = nota;
	}

	public Pez getPez() {
		return pez;
	}

	public void setPez(Pez pez) {
		this.pez = pez;
	}
	
	
}
