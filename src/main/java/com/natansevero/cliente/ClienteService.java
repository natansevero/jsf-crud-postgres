/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.natansevero.cliente;

import com.natansevero.infra.ClienteEmMemoria;
import com.natansevero.infra.ClienteJDBC;
import java.util.List;

/**
 *
 * @author natan
 */
public class ClienteService {
    
    private final Services cliente = new ClienteEmMemoria();
//    private final Services cliente = new ClienteJDBC();
    
    public void salvar(Cliente cliente) {
        this.cliente.salvar(cliente);
    }
    
    
    public void remover(Cliente cliente) {
        this.cliente.remover(cliente);
    }
    
    
    public void atualizar(Cliente cliente) {
        this.cliente.atualizar(cliente);
    }
    
    
    public List<Cliente> todosOsClientes(){
        return this.cliente.todosOsClientes();
    }
    
}
