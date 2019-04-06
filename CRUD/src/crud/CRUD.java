/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud;

import Repositorio.RepositorioPessoa;
import Entidade.CPessoas;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Joás
 */
public class CRUD {

    /**
     * @param args the command line arguments
     */
    static RepositorioPessoa rp = new RepositorioPessoa();
    public static void main(String[] args) {
        
      popularArray();
      listarPessoas();
      rp.deletarPessoasPorID(3);
      listarPessoas();
      
       
    }
    
    public static void popularArray(){
        
       CPessoas pessoa1 = new CPessoas();
       pessoa1.setId(1);
       pessoa1.setCpf(12345678);
       pessoa1.setIdade(20);
       pessoa1.setNome(""); 
       rp.salvaPessoas(pessoa1);
       
       CPessoas pessoa2 = new CPessoas();
       pessoa2.setId(2);
       pessoa2.setCpf(87654321);
       pessoa2.setIdade(20);
       pessoa2.setNome("");
       rp.salvaPessoas(pessoa2);
       
       CPessoas pessoa3 = new CPessoas();
       pessoa3.setId(3);
       pessoa3.setCpf(23456788);
       pessoa3.setIdade(20);
       pessoa3.setNome("");
       rp.salvaPessoas(pessoa3);
        
    }
    
    public static void listarPessoas (){
        List<CPessoas> lista = new ArrayList<CPessoas>();
        
        lista = rp.listarPessoas();
        
        for (CPessoas pessoa : lista){
            System.out.println("ID: "+pessoa.getId());
            System.out.println("CPF: "+pessoa.getCpf());
            System.out.println("Nome: "+pessoa.getNome());
            System.out.println("Idade: "+pessoa.getIdade());
            System.out.println("\n");
        }
    }
    
}
