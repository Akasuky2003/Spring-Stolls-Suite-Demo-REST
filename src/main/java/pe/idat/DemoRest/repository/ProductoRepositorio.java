package pe.idat.DemoRest.repository;

import java.util.Collection;

import pe.idat.DemoRest.entity.Producto;

public interface ProductoRepositorio {
	//Se define solo las operaciones a la base de datos Interface
	public abstract void insert(Producto producto);
	public abstract void update(Producto producto);
	public abstract void delete(Producto producto);
	public abstract Producto findById(Integer productoId);
	public abstract Collection<Producto>findAll();
	

}
