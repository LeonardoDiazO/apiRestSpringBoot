package com.leonardo.ec.service;

import com.leonardo.ec.model.dto.ClienteDto;
import com.leonardo.ec.model.entity.Cliente;

public interface IClient {

    Cliente save(ClienteDto cliente);

    Cliente findById(Integer id);

    void delete(Cliente cliente);
}
