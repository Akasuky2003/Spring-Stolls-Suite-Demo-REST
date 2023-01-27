package pe.idat.DemoRest.service;

import java.util.Collection;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.idat.DemoRest.entity.Producto;
import pe.idat.DemoRest.repository.ProductoRepositorio;

@Service
public class ProductoServiceImpl implements ProductoService{
	@Autowired
	private ProductoRepositorio repositorio;

	@Override
	@Transactional
	public void insert(Producto producto) {
		// TODO Auto-generated method stub
		repositorio.save(producto);
		
	}

	@Override
	@Transactional
	public void update(Producto producto) {
		// TODO Auto-generated method stub
		repositorio.save(producto);
		
	}

	@Override
	@Transactional
	public void delete(Integer productoId) {
		// TODO Auto-generated method stub
		repositorio.deleteById(productoId);
		
	}

	@Override
	@Transactional(readOnly=true)
	public Producto findById(Integer productoId) {
		// TODO Auto-generated method stub
		return repositorio.findById(productoId).orElse(null);
	}

	@Override
	@Transactional(readOnly=true)
	public Collection<Producto> findAll() {
		return repositorio.findAll();
	}

}
