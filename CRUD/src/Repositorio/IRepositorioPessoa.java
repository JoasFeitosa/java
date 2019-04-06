/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repositorio;

import java.util.List;

import Entidade.CPessoas;

/**
 *
 * @author Joás
 */
public interface IRepositorioPessoa {
    public boolean salvaPessoas(CPessoas pessoa);
    public boolean deletarPessoasPorID(long id);
    public List<CPessoas> listarPessoas();
    public boolean alterarPessoas(CPessoas pessoa);
    
}
