package com.cibertec.service;

import java.util.List;

import com.cibertec.entity.Opcion;
import com.cibertec.entity.Rol;
import com.cibertec.entity.Usuario;

public interface UsuarioService {

	public abstract List<Opcion> traerEnlacesDeUsuario(int idUsuario);

	public abstract List<Rol> traerRolesDeUsuario(int idUsuario);

	public abstract Usuario buscaPorLogin(String login);

	public abstract List<Usuario> listaJefePrestamistaTotales();

	public abstract List<Usuario> listaPrestamistaDeUnJefe(int idUsuario);

	public abstract List<Usuario> listaPrestamistariosDeUnPrestamista(int idUsuario);

}