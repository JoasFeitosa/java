/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repositorio;

import Entidade.CPessoas;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Joás
 */
public class RepositorioPessoa implements IRepositorioPessoa {

    
    List<CPessoas> listaPessoas = new ArrayList<CPessoas>();
    
    @Override
    public boolean salvaPessoas(CPessoas pessoa) {
        try {
            listaPessoas.add(pessoa);
        } catch (Exception e) {
            return false;
        }
        
        return true;
    }

    @Override
    public boolean deletarPessoasPorID(long id) {
        for (CPessoas pessoa : listaPessoas) {
            if (pessoa.getId() == id){
                listaPessoas.remove(pessoa);
            }
        }
        
        return false;
    }

    @Override
    public List<CPessoas> listarPessoas() {
        return listaPessoas;
    }

    @Override
    public boolean alterarPessoas(CPessoas pessoa) {
        return false;
    }
    
}
