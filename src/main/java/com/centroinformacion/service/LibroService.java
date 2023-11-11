package com.centroinformacion.service;

import java.util.List;

import com.centroinformacion.entity.Libro;


public interface LibroService {
	
	public abstract List<Libro> listaLibro();
	public abstract Libro insertarLibro(Libro obj);

}
