package br.com.foursys.locadora.util;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/**
 * Classe para exibir mensagem
 * @author Victor Baptista
 * @since 27/04/2021
 * @version 1.0
 */
public class JSFUtil {

	//retirnando mensagem de erro
	public static void addErrorMessage(String msg) {
		FacesMessage facesMessage = new FacesMessage(FacesMessage.SEVERITY_ERROR, msg, msg);
		FacesContext facesContext = FacesContext.getCurrentInstance();
		facesContext.addMessage(msg, facesMessage);
	}
	
	//retirnando mensagem de info
		public static void addInfoMessage(String msg) {
			FacesMessage facesMessage = new FacesMessage(FacesMessage.SEVERITY_INFO, msg, msg);
			FacesContext facesContext = FacesContext.getCurrentInstance();
			facesContext.addMessage(msg, facesMessage);
		}
}
