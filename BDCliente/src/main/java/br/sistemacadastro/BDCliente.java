/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.sistemacadastro;
/**
 *
 * @author luciorocha
 */

import java.util.List;
import java.util.ArrayList;

public class BDCliente {
    public List<Cliente> lista;
    public BDCliente() {
        lista = new ArrayList<>();
    }
    public void inserir(Cliente cliente) {
        lista.add(cliente);
    }
    public Cliente consultar(String CPF) {
        for (Cliente i : lista) {
            if (i.getCPF().equals(CPF)) {
                return i;
            }
        }
        return null;
    }
    public Cliente atualizar(Cliente cliente) {
        Cliente i = consultar(cliente.getCPF());
        System.out.println(i);
        if (i != null) {
            lista.remove(i);
            lista.add(cliente);
        }
        return i;
    }
    public boolean remover(String CPF) {
        boolean result = false;
        Cliente i = consultar(CPF);
        System.out.println(i);
        if (i != null) {
            lista.remove(i);
            result = true;
        }
        return result;
    }
}