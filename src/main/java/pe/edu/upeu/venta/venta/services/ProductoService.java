package pe.edu.upeu.venta.venta.services;


import java.util.List;

import pe.edu.upeu.venta.venta.entity.Producto;

public interface ProductoService {
	public List<Producto> findAll();
	public Producto findById(Long idproducto);
	public Producto save(Producto producto);
	public void delete(Long idproducto);

}