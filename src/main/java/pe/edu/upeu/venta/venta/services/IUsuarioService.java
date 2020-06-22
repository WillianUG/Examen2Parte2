package pe.edu.upeu.venta.venta.services;

import pe.edu.upeu.venta.venta.entity.Usuario;

public interface IUsuarioService {

	public Usuario findByUsername(String username);
}
