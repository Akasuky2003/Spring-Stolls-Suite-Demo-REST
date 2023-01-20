package pe.idat.DemoRest.entity;

import java.time.LocalDate;

public class Producto {
	private Integer productoid;
	private String nombre;
	private String marca;
	private Double precio;
	private LocalDate fproducion;
	private LocalDate fvencimiento;
	private Integer stock;
	
	public Producto() {
		
	}
	public Producto(Integer productoid, String nombre, String marca, Double precio, LocalDate fproducion,
			LocalDate fvencimiento, Integer stock) {
		
		this.productoid = productoid;
		this.nombre = nombre;
		this.marca = marca;
		this.precio = precio;
		this.fproducion = fproducion;
		this.fvencimiento = fvencimiento;
		this.stock = stock;
	}
	public Integer getProductoid() {
		return productoid;
	}
	public void setProductoid(Integer productoid) {
		this.productoid = productoid;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	public LocalDate getFproducion() {
		return fproducion;
	}
	public void setFproducion(LocalDate fproducion) {
		this.fproducion = fproducion;
	}
	public LocalDate getFvencimiento() {
		return fvencimiento;
	}
	public void setFvencimiento(LocalDate fvencimiento) {
		this.fvencimiento = fvencimiento;
	}
	public Integer getStock() {
		return stock;
	}
	public void setStock(Integer stock) {
		this.stock = stock;
	}

}
