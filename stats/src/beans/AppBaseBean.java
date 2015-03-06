package beans;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.application.FacesMessage.Severity;
import javax.faces.context.FacesContext;

/**
 * Base bean for all the backing bean. 
 * All common methods goes here
 * not exposed as managed bean.
 * @author ramkumarsundarajan
 *
 */
public class AppBaseBean implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	/**
	 * 
	 * @param componentId
	 * @param message
	 */
	protected void setMessage(String componentId,String message) {
		FacesContext.getCurrentInstance().addMessage(componentId, new FacesMessage(message,message));
	}
	
	/**
	 * 
	 * @param message
	 */
	protected void setMessage(String message) {
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(message,message));
	}
	
	/**
	 * 
	 * @param componentId
	 * @param severity
	 * @param message
	 */
	protected void setMessage(String componentId,Severity severity,String message) {
		FacesContext.getCurrentInstance().addMessage(componentId, new FacesMessage(severity,message,message));
	}

}
