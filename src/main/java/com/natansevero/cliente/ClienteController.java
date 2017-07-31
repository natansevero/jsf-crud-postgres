/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.natansevero.cliente;

import java.io.Serializable;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author natan
 */
@Named
@SessionScoped
public class ClienteController implements Serializable {
    private Cliente cliente = new Cliente();
    private ClienteService clienteService = new ClienteService();
    
    private boolean editando;
    
    public String salvarCliente() {
        this.clienteService.salvar(cliente);
        this.cliente = new Cliente();
        return null;
    }
    
    public String removerCliente(Cliente clienteDelete) {
        this.clienteService.remover(clienteDelete);
        return null;
    }
    
    public String atualizarCliente() {
        this.clienteService.atualizar(cliente);
        this.editando = false;
        this.cliente = new Cliente();
        return null;
    }
    
    public String editarCliente(Cliente clienteEdit) {
        this.cliente = clienteEdit;
        this.editando = true;
        return null;
    }
    
    // List<Cliente> todosClientes()
    public List<Cliente> getTodosClientes() { 
        return this.clienteService.todosOsClientes();
    }
    
    public Cliente getCliente() {
        return cliente;
    }
    
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public boolean isEditando() {
        return editando;
    }

    public void setEditando(boolean editando) {
        this.editando = editando;
    }
    
    
}
