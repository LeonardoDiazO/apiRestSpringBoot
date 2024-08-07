package com.leonardo.ec.service;

import com.leonardo.ec.model.entity.Cliente;

public interface IClient {

    Cliente save(Cliente cliente);

    Cliente findById(Integer id);

    void delete(Cliente cliente);
}
