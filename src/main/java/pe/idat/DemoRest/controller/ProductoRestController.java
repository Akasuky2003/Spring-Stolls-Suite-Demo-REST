package pe.idat.DemoRest.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
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

}
