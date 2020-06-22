package pe.edu.upeu.venta.venta.services;

import java.util.List;

import pe.edu.upeu.venta.venta.entity.Categoria;

public interface CategoriaService {
	public List<Categoria> findAll();
	public Categoria findById(Long idcategoria);
	public Categoria save(Categoria categoria);
	public void delete(Long idcategoria);

}
