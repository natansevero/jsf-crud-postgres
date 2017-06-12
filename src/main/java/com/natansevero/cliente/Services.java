/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.natansevero.cliente;

import java.util.List;

/**
 *
 * @author natan
 */
public interface Services {
    void salvar(Cliente cliente);
    void remover(Cliente cliente);
    void atualizar(Cliente cliente);
    List<Cliente> todosOsClientes();
}
