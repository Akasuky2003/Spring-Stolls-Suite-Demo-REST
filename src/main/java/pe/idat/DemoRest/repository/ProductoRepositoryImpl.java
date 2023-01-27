package pe.idat.DemoRest.repository;

import java.time.LocalDate;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import pe.idat.DemoRest.entity.Producto;
@Repository
public class ProductoRepositoryImpl implements ProductoRepositorio {
	
	private final static Map<Integer,Producto>productos=new HashMap<>();
	static {
		Producto producto1=new Producto(1,"Jabón","Sapolio",14.0,LocalDate.now(),LocalDate.of(2023,2,10),20);
		Producto producto2=new Producto(2,"Patito","Sapolio",7.0,LocalDate.now(),LocalDate.of(2023,3,10),120);
		Producto producto3=new Producto(3,"Leche","Gloria",5.0,LocalDate.now(),LocalDate.of(2023,5,10),90);
		Producto producto4=new Producto(4,"Acido","Sapolio",17.0,LocalDate.now(),LocalDate.of(2023,3,10),50);
		
		productos.put(producto1.getProductoid(),producto1);
		productos.put(producto2.getProductoid(),producto2);
		productos.put(producto3.getProductoid(),producto3);
		productos.put(producto4.getProductoid(),producto4);
	}

	@Override
	public void insert(Producto producto) {
		// TODO Auto-generated method stub
		producto.setProductoid(productos.size()+1);//IDautogenerado
		//guardar nuevo producto
		productos.put(producto.getProductoid(),producto);
		
	}

	@Override
	public void update(Producto producto) {
		// TODO Auto-generated method stub
		productos.put(producto.getProductoid(),producto);
		
	}

	@Override
	public void delete(Integer productoId) {
		// TODO Auto-generated method stub
		productos.remove(productoId);
		
	}

	@Override
	public Producto findById(Integer productoId) {
		// TODO Auto-generated method stub
		return productos.get(productoId);
	}

	@Override
	public Collection<Producto> findAll() {
		// TODO Auto-generated method stub
		return productos.values();
	}

}
