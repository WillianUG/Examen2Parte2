package pe.edu.upeu.venta.venta.serviceImp;

	import java.util.List;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;
	import org.springframework.transaction.annotation.Transactional;

import pe.edu.upeu.venta.venta.dao.CategoriaDao;
import pe.edu.upeu.venta.venta.entity.Categoria;
import pe.edu.upeu.venta.venta.services.CategoriaService;
	@Service
	public class CategoriaServiceImp implements CategoriaService{
		 @Autowired
		 private CategoriaDao categoriaDao;
		@Override
		@Transactional(readOnly = true)
		public List<Categoria> findAll() {
			// TODO Auto-generated method stub
			return (List<Categoria>) categoriaDao.findAll();
		}

		@Override
		@Transactional(readOnly = true)
		public Categoria findById(Long idcategoria) {
			// TODO Auto-generated method stub
			return categoriaDao.findById(idcategoria).orElse(null);
		}

		@Override
		@Transactional
		public Categoria save(Categoria categoria) {
			// TODO Auto-generated method stub
			return categoriaDao.save(categoria);
		}

		@Override
		public void delete(Long idcategoria) {
			// TODO Auto-generated method stub
			categoriaDao.deleteById(idcategoria);
			
		}

	}

