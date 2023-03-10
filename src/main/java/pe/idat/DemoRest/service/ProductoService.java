package pe.idat.DemoRest.service;

import java.util.Collection;

import pe.idat.DemoRest.entity.Producto;

public interface ProductoService {
	public abstract void insert(Producto producto);
	public abstract void update(Producto producto);
	public abstract void delete(Producto producto);
	public abstract Producto findById(Integer productoId);
	public abstract Collection<Producto>findAll();

}
