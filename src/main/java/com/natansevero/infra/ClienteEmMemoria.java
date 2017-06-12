/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.natansevero.infra;

import com.natansevero.cliente.Cliente;
import com.natansevero.cliente.Services;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author natan
 */
public class ClienteEmMemoria implements Services {
    
    private List<Cliente> clientes = new ArrayList<>();
    
    @Override
    public void salvar(Cliente cliente) {
        cliente.setId(clientes.size() + 1);
        this.clientes.add(cliente);
    }
    
    @Override
    public void remover(Cliente cliente) {
        this.clientes.remove(cliente);
    }
    
    @Override
    public void atualizar(Cliente cliente) {
        this.clientes.forEach((c) -> {
            if(c.getId() == cliente.getId()) c.setNome(cliente.getNome());
        });
    }
    
    @Override
    public List<Cliente> todosOsClientes(){
        return clientes;
    }
    
}
