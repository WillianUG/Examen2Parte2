package pe.edu.upeu.venta.venta.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.edu.upeu.venta.venta.dao.ProductoDao;
import pe.edu.upeu.venta.venta.entity.Producto;
import pe.edu.upeu.venta.venta.services.ProductoService;
@Service
public class ProductoServiceImp  implements ProductoService{
	 @Autowired
	 private ProductoDao productoDao;
	@Override
	@Transactional(readOnly = true)
	public List<Producto> findAll() {
		// TODO Auto-generated method stub
		return (List<Producto>) productoDao.findAll();
	}

	@Override
	public Producto findById(Long idproducto) {
		// TODO Auto-generated method stub
		return productoDao.findById(idproducto).orElse(null);
	}

	@Override
	public Producto save(Producto producto) {
		// TODO Auto-generated method stub
		return productoDao.save(producto);
	}

	@Override
	public void delete(Long idproducto) {
		// TODO Auto-generated method stub
		productoDao.deleteById(idproducto);
		
	}

}