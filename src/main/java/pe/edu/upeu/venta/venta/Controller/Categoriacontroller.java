package pe.edu.upeu.venta.venta.Controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;

import pe.edu.upeu.venta.venta.entity.Categoria;
import pe.edu.upeu.venta.venta.services.CategoriaService;

@RequestMapping("/api")
@RestController

public class Categoriacontroller{
	@Autowired
	private CategoriaService categoriaService;
	@GetMapping("/categoria")
	public List<Categoria> readAll(){
		return categoriaService.findAll();
	}
	@GetMapping("categoria/{idcategoria}")
	public Categoria read(@PathVariable Long idcategoria) {
		return categoriaService.findById(idcategoria);
	}
	@PostMapping("/categoria")
	@ResponseStatus(HttpStatus.CREATED)
	public Categoria create(@RequestBody Categoria categoria) {
		return categoriaService.save(categoria);
	}
	@PutMapping("/categoria/{idcategoria}")
	public Categoria update(@RequestBody Categoria categoria, @PathVariable Long idcategoria) {
		Categoria editar_categoria = categoriaService.findById(idcategoria);

		editar_categoria.setNomcat(categoria.getNomcat());

		return categoriaService.save( editar_categoria);
	}
	@DeleteMapping("/eliminar/{idcategoria}")
	public void delete(@PathVariable Long idcategoria) {
		categoriaService.delete(idcategoria);
		System.out.print("Categoria Borrada");
	
	}

}