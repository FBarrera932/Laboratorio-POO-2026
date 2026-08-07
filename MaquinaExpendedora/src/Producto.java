
public class Producto {
	private String Codigo;
	private String Nombre;
	private String Leyenda;
	private int Precio;
	private int Cantidad;
	private TipoProductos tipo;
	
	public Producto (String Codigo, String Nombre, String Leyenda, int Precio, int Cantidad) {
		this.Codigo = Codigo;
		this.Nombre = Nombre;
		this.Leyenda = Leyenda;
		this.Precio = Precio;
		this.Cantidad = Cantidad;
	}
	public String getCodigo() {
		return Codigo;
	}
	public String getNombre() {
		return Nombre;
	}
	public String getLeyenda() {
		return Leyenda;
	}
	public int getPrecio() {
		return Precio;
	}
	public int getCantidad() {
		return Cantidad;
	}
	public TipoProductos gettipo() {
		return tipo;
	}
	/*
	private TipoProductos DeterminarTipo(String id) {
		char inicial = Codigo.charAt(0);
		TipoProductos tipoaux = null;
		
		switch(inicial) {
		
		case SANGUCHE:
			break;
		
		case BEBIDA:
			break;
		
		case GOLOSINA:
			break;
		
		case SALUBALE:
			break;
		return tipoaux;
	}
}*/
}
