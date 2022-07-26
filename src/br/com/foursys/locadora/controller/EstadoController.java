package br.com.foursys.locadora.controller;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


import br.com.foursys.locadora.bean.Estado;
import br.com.foursys.locadora.dao.EstadoDAO;

/**
 * Classe responsável por controlar os métodos de acesso a base de dados
 * @author Victor Baptista
 * @since 24/03/2021
 * @version 1.0
 */
public class EstadoController {
    
    /*
    * Método responsável por retornar os estados gravados na tabela
    */
    public ArrayList<Estado> buscarTodos() {
        //lista auxiliar para retornar no método
        ArrayList<Estado> retorno = null;
        
        try {
            retorno = new EstadoDAO().buscarTodos();
        } catch (Exception ex) {
            Logger.getLogger(EstadoController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return retorno;
    }
}
