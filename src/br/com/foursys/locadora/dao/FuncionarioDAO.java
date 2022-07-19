package br.com.foursys.locadora.dao;

import java.util.ArrayList;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import br.com.foursys.locadora.bean.Funcionario;
import br.com.foursys.locadora.util.HibernateUtil;

/**
 * Classe responsÃ¡vel por armazenar os mÃ©todos para acesso ao banco de dados
 * @author Victor Baptista
 * @since 27/04/2021
 * @version 1.0
 */
public class FuncionarioDAO extends GenericDAO{
    
    /*
    * MÃ©todo para consultar os alunos na tabela
    */
    public ArrayList<Funcionario> buscarPorNome(String nome) throws Exception{
        //lista auxiliar para retornar no método
        ArrayList<Funcionario> retorno = new ArrayList<Funcionario>();
        
        //classe auxiliar para armazenar a sessão com o banco de dados
        Session sessao = HibernateUtil.getSessionFactory().openSession();
        
        //classe auxiliar para consultar o banco de dados
        Criteria criteria = sessao.createCriteria(Funcionario.class);
        
        //adicionar critério de pesquisa
        criteria.add(Restrictions.like("nome", nome + "%"));
        
        //adicionando a ordenação da pesquisa
        criteria.addOrder(Order.asc("nome"));
        
        //valorizando o objeto de retorno do método com os registros da tabela
        retorno = (ArrayList<Funcionario>) criteria.list();
        
        //encerrando a conexão com o banco de dados
        sessao.close();
        
        //retornando a lista preenchida
        return retorno;
    }//fim do mÃ©todo buscarTodos
}//fim da classe
