/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.natansevero.cliente;

import java.io.Serializable;

/**
 *
 * @author natan
 */
public class Cliente implements Serializable {
    private int id;
    private String nome;
    
    public Cliente(String nome) {
        this.nome = nome;
    }
    
    public Cliente() {
    
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
}
