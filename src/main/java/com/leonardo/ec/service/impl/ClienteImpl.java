package com.leonardo.ec.service.impl;

import com.leonardo.ec.model.dto.ClienteDto;
import com.leonardo.ec.model.entity.Cliente;
import com.leonardo.ec.service.IClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.leonardo.ec.model.dao.ClienteDao;
import org.springframework.transaction.annotation.Transactional;



@Service
public class ClienteImpl implements IClient {

    @Autowired
    private ClienteDao clienteDao;

    @Transactional
    @Override
    public Cliente save(ClienteDto clienteDto) {
        Cliente cliente = Cliente.builder()
                          .idCliente(clienteDto.getIdCliente())
                          .nombre(clienteDto.getNombre())
                          .apellido(clienteDto.getApellido())
                          .correo(clienteDto.getCorreo())
                          .fechaRegistro(clienteDto.getFechaRegistro())
                          .build();

        return  clienteDao.save(cliente);

    }

    @Transactional(readOnly = true)
    @Override
    public Cliente findById(Integer id) {
        return clienteDao.findById(id).orElse(null);
    }

    @Transactional
    @Override
    public void delete(Cliente cliente) {
        clienteDao.delete(cliente);
    }
}
