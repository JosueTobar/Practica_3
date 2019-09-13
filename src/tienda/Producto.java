package tienda;

public class Producto {
	String  categoria;
	String  nombre;
	float   precio;
	
	public Producto() {
		
	}

	public Producto(Integer idproducto, String categoria, String nombre, float precio) {
		this.categoria = categoria;
		this.nombre = nombre;
		this.precio = precio;
	}
	

	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}

}
