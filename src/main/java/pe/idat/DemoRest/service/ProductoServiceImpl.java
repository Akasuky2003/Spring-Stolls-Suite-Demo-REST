package pe.idat.DemoRest.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.idat.DemoRest.entity.Producto;
import pe.idat.DemoRest.repository.ProductoRepositorio;

@Service
public class ProductoServiceImpl implements ProductoService{
	@Autowired
	private ProductoRepositorio repositorio;

	@Override
	public void insert(Producto producto) {
		// TODO Auto-generated method stub
		repositorio.insert(producto);
		
	}

	@Override
	public void update(Producto producto) {
		// TODO Auto-generated method stub
		repositorio.update(producto);
		
	}

	@Override
	public void delete(Integer productoId) {
		// TODO Auto-generated method stub
		repositorio.delete(productoId);
		
	}

	@Override
	public Producto findById(Integer productoId) {
		// TODO Auto-generated method stub
		return repositorio.findById(productoId);
	}

	@Override
	public Collection<Producto> findAll() {
		// TODO Auto-generated method stub
		return repositorio.findAll();
	}

}
