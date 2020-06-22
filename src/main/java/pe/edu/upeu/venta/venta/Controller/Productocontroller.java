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

import pe.edu.upeu.venta.venta.entity.Producto;
import pe.edu.upeu.venta.venta.services.ProductoService;
@RequestMapping("/api2")
@RestController
public class Productocontroller {
	@Autowired
	private ProductoService productoService;
	@GetMapping("/producto")
	public List<Producto> readAll(){
		return (List<Producto>) productoService.findAll();
	}
	@GetMapping("producto/{idproducto}")
	public Producto read(@PathVariable Long idproducto) {
		return productoService.findById(idproducto);
	}
	@PostMapping("/producto")
	@ResponseStatus(HttpStatus.CREATED)
	public Producto create(@RequestBody Producto producto) {
		return productoService.save(producto);
	}
	@PutMapping("/producto/{idproducto}")
	public Producto update(@RequestBody Producto producto, @PathVariable Long idproducto) {
		Producto editar_producto = productoService.findById(idproducto);
        
		editar_producto.setNomprod(producto.getNomprod());
		editar_producto.setPrecio(producto.getPrecio());
	    editar_producto.setCantidad(producto.getCantidad());
	    
	    


		return productoService.save( editar_producto);
	}
	@DeleteMapping("/eliminar/{idproducto}")
	public void delete(@PathVariable Long idproducto) {
		productoService.delete(idproducto);
		System.out.print("Producto Borrado");
	
	}
}
