package projectogithub;

import java.util.ArrayList;

public class Cliente {

	String nombre;
	String apellido;
	String dni;
	String direccion;
	int edad;
	ArrayList <Producto> compras = new ArrayList <Producto> ();
	
	public Cliente(String nombre, String apellido, String dni, String direccion, int edad) {
			super();
			this.nombre = nombre;
			this.apellido = apellido;
			this.dni = dni;
			this.direccion = direccion;
			this.edad = edad;
		}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}
		
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDni() {
		return dni;
	}
		
	public void setDni(String dni) {
		this.dni = dni;
	}

	
	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + "]";
	}
	
}

	
