package com.api.invoice.uts.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.api.invoice.uts.models.entities.Cliente;

public interface IClienteDao extends CrudRepository<Cliente, Long> {

}
