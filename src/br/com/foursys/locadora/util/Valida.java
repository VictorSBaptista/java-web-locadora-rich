package br.com.foursys.locadora.util;

/**
 * Classe responsável por armazenar os métodos de validação de dados
 *
 * @author Victor Baptista
 * @since 17/03/2021
 * @version 1.0
 */
public class Valida {

    /*
     *Método para verificar se o campo é diferente de vazio ou nulo
     */
    public static boolean isEmptyOrNull(String args) {
        return (args.trim().equals("") || args == null);
    }//fim do método isEmptyOrNull

    /*
     *Método para verificar se o campo formatado é diferente de vazio ou nulo 
     */
    public static boolean formattedIsEmptyOrNull(String args) {
        String aux = args.trim().replaceAll("[()-./]", "");
        return (aux.trim().equals("") || aux == null);
    }//fim do método isEmptyOrNull

    /*
     *Método para verificar se o campo é um inteiro  
     */
    public static boolean isInteger(String args) {
        try {
            Integer.parseInt(args);
            return true;
        } catch (Exception e) {
            return false;
        }
    }//fim do método isEmptyOrNull
    
    /*
     *Método para verificar se o campo é um inteiro  
     */
    public static boolean isDouble(String args) {
        try {
            Double.parseDouble(args);
            return true;
        } catch (Exception e) {
            return false;
        }
    }//fim do método isEmptyOrNull
    
    public static boolean isDoubleZero(double num) {
    	if (num <= 0) {
    		return true;
    	}
    	return false;
    }
    
    public static boolean isIntZero(int num) {
    	if (num <= 0) {
    		return true;
    	}
    	return false;
    }
}
