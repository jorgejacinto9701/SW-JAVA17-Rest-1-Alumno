package com.centroinformacion.service;

import java.util.List;

import com.centroinformacion.entity.Proveedor;

public interface ProveedorService {
	
	public abstract List<Proveedor> listaProveedor();
	public abstract Proveedor instertaProveedor(Proveedor obj);

}
