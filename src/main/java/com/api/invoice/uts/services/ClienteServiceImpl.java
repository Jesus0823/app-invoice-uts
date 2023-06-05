 package com.api.invoice.uts.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.api.invoice.uts.models.dao.IClienteDao;
import com.api.invoice.uts.models.dao.IFacturaDao;
import com.api.invoice.uts.models.dao.IProductoDao;
import com.api.invoice.uts.models.entities.Cliente;
import com.api.invoice.uts.models.entities.Factura;
import com.api.invoice.uts.models.entities.Producto;
import com.api.invoice.uts.models.entities.Region;


@Service
public class ClienteServiceImpl implements IClienteService{
	
	@Autowired //Sirve para detectar la conexion de dependencias
	private IClienteDao clienteDao;
	
	
	@Autowired
	private IFacturaDao facturaDao;
	
	@Autowired
	private IProductoDao productoDao;

	@Override
	@Transactional(readOnly=true)
	public List<Cliente> findAll() {
		return (List<Cliente>) clienteDao.findAll();
		
	}

	@Override
	@Transactional(readOnly=true)
	public Cliente findById(Long id) {
		return  clienteDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public Cliente save(Cliente cliente) {
		 return clienteDao.save(cliente);
	}

	@Override
	@Transactional
	public void delete(Cliente cliente) {
		clienteDao.delete(cliente);
		
	}
	
	@Override
	@Transactional(readOnly = true)
	public List<Region> findAllRegiones() {
		return clienteDao.findAllRegiones();
	}
	
	@Override
	@Transactional(readOnly=true)
	public Factura findFacturaById(Long id) {
		return facturaDao.findById(id).orElse(null);
		
	}

	@Override
	@Transactional
	public Factura saveFactura(Factura factura) {
		return facturaDao.save(factura);
	}

	@Override
	@Transactional
	public void deleteFacturaById(Long id) {
		facturaDao.deleteById(id);
		
	}

	@Override
	@Transactional(readOnly = true)
	public List<Producto> findProductoByNombre(String term) {
		return productoDao.findByNombreContainingIgnoreCase(term);
	}

	@Override
	public List<Factura> findFacturaAll() {
		 return (List<Factura>) facturaDao.findAll();
	}
	
	
}
