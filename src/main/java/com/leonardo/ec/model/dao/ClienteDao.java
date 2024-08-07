package com.leonardo.ec.model.dao;

import com.leonardo.ec.model.entity.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface ClienteDao extends CrudRepository<Cliente, Integer> {


}
