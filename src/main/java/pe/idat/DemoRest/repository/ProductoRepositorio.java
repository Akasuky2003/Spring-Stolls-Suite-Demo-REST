package pe.idat.DemoRest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.idat.DemoRest.entity.Producto;
public interface ProductoRepositorio extends JpaRepository<Producto, Integer> {

}
