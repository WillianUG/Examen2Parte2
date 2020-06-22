package pe.edu.upeu.venta.venta.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.venta.venta.entity.Categoria;
@Repository
public interface CategoriaDao extends CrudRepository<Categoria, Long>{

}
