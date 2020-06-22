package pe.edu.upeu.venta.venta.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.venta.venta.entity.Producto;
@Repository

public interface ProductoDao  extends CrudRepository<Producto, Long>{

}