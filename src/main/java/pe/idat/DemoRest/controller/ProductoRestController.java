package pe.idat.DemoRest.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.idat.DemoRest.entity.Producto;
import pe.idat.DemoRest.service.ProductoService;

@RestController
@RequestMapping("/producto")
public class ProductoRestController {
	@Autowired
	private ProductoService productoService;
	
	
	public ProductoRestController(){
		
	}
	@GetMapping("/listar")
	public ResponseEntity<?>listar_GET(){
		Collection<Producto>productoDb=productoService.findAll();
		if(productoDb.isEmpty()) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<>(productoDb,HttpStatus.OK);
	}
	@PostMapping("/registrar")
	public ResponseEntity<?>registrar(@RequestBody Producto producto){
		productoService.insert(producto);
		return new ResponseEntity<>("Producto Registrado",HttpStatus.CREATED);
	}
	@PutMapping("/editar/{productoID}")
	public ResponseEntity<?>editar_PUT(@RequestBody Producto producto,@PathVariable Integer productoId){
		Producto productoDb=productoService.findById(productoId);
		if(productoDb!=null) {
			productoDb.setNombre(producto.getNombre());
			productoDb.setMarca(producto.getMarca());
			productoDb.setPrecio(producto.getPrecio());
			productoDb.setFvencimiento(producto.getFvencimiento());
			productoDb.setFproducion(producto.getFproducion());
			productoService.update(productoDb);
			return new ResponseEntity<>("Producto Actualizado",HttpStatus.OK);
		}
		return new ResponseEntity<>("Producto no encontrado",HttpStatus.NOT_FOUND);
	}
	@DeleteMapping("/borrar/{productoId}")
	public ResponseEntity<?>borrar_DELETE(@PathVariable Integer productoId){
		Producto productoDb=productoService.findById(productoId);
		if(productoDb!=null) {
			productoService.delete(productoId);
			return new ResponseEntity<>("Producto Eliminado",HttpStatus.OK);
		}
		return new ResponseEntity<>("Producto no encontrado",HttpStatus.NOT_FOUND);
	}
	@GetMapping("/buscar/{productoId}")
	public ResponseEntity<?>buscar_Get(@PathVariable Integer productoId){
		Producto productoDb=productoService.findById(productoId);
		if(productoDb!=null) {
		return new ResponseEntity<>(productoDb,HttpStatus.FOUND);
		}
		return new ResponseEntity<>("¡Producto no encontrado!",HttpStatus.NOT_FOUND);
		
	}

}
