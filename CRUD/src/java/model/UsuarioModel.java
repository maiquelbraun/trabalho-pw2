/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;
import java.util.List;
import dao.UsuarioDao;

/**
 *
 * @author Ederson
 */
public class UsuarioModel {
    
    private int id;
    private String nome;
    private Date dataNascimento;

  //getters e setters
    
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
   
   
    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    
     public void listar(){
        List<UsuarioModel> lista = new UsuarioDao().buscar();
        for(UsuarioModel usuario: lista){
            System.out.println(usuario.toString());
        }
    }
    
    
    
}
