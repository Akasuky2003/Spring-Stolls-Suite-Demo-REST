package pe.idat.DemoRest.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

@Entity
@Table(name="productos")
public class Producto {
	private static final long serialVersionUID=1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer productoid;
	
	@Column
	private String nombre;
	
	@Column
	private String marca;
	
	@Column
	private Double precio;
	@DateTimeFormat(pattern="yyyy-MM-dd",iso=ISO.DATE)
	
	private LocalDate fproducion;
	@DateTimeFormat(pattern="yyyy-MM-dd",iso=ISO.DATE)
	
	private LocalDate fvencimiento;
	@Column
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
	
	@PrePersist
	public void prePersist() {
		fproducion=LocalDate.now();
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
