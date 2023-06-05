package com.api.invoice.uts.models.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.api.invoice.uts.models.entities.Cliente;
import com.api.invoice.uts.models.entities.Region;

public interface IClienteDao extends CrudRepository<Cliente, Long> {
	
	@Query("from Region")
	public List<Region> findAllRegiones();

}
