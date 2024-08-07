package com.leonardo.ec.service.impl;

import com.leonardo.ec.model.entity.Cliente;
import com.leonardo.ec.service.IClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.leonardo.ec.model.dao.ClienteDao;
import java.util.Optional;

@Service
public class ClienteImpl implements IClient {

    @Autowired
    private ClienteDao clienteDao;

    @Override
    public Cliente save(Cliente cliente) {
        return clienteDao.save(cliente);
    }

    @Override
    public Cliente findById(Integer id) {
        return clienteDao.findById(id).orElse(null);
    }

    @Override
    public void delete(Cliente cliente) {

    }
}
