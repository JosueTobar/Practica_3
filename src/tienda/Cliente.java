package tienda;

import java.util.List;

public class Cliente {
	
	String nombre;
	
	
	
	public Cliente() {
		super();
	}
	
	public Cliente(String nombre, List<Producto> listap) {
		super();
		this.nombre = nombre;
		
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}
