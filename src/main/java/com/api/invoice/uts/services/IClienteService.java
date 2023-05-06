package com.api.invoice.uts.services;

import java.util.List;

import com.api.invoice.uts.models.entities.Cliente;

public interface IClienteService {
	
	public List<Cliente> findAll();
	
	public Cliente findById(Long id);
	
	public Cliente save(Cliente cliente);
	
	public void delete (Cliente cliente);

}
