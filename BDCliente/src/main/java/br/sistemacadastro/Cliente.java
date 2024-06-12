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

public class Cliente {
    private String nome;
    private String CPF;
    public Cliente() {
        setNome("");
        setCPF("0");
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
    public String getNome() {
        return nome;
    }
    public String getCPF() {
        return CPF;
    }
}
