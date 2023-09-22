package modelo;

public class libro {
	int idLibro;
	String nombre;
	String autor;
	String isbn;
	int edicion;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public int getEdicion() {
		return edicion;
	}
	public void setEdicion(int edicion) {
		this.edicion = edicion;
	}
	public int getIdLibro() {
		return idLibro;
	}
	
	public libro(int idLibro, String nombre, String autor, String isbn, int edicion) {
		super();
		this.idLibro = idLibro;
		this.nombre = nombre;
		this.autor = autor;
		this.isbn = isbn;
		this.edicion = edicion;
	}
	
	@Override
	public String toString() {
		return "libro [idLibro=" + idLibro + ", nombre=" + nombre + ", autor=" + autor + ", isbn=" + isbn + ", edicion="
				+ edicion + "]";
	}

}
