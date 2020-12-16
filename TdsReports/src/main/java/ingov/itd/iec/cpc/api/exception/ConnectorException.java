package ingov.itd.iec.cpc.api.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ConnectorException extends Exception {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(ConnectorException.class);
	private static final long serialVersionUID = 1L;
	String message = null;
	
	public ConnectorException(String message){
		super(message);
		
		
	
		
	}
	
	public void addMessage(String message) {
		
		
		this.message = this.message + System.lineSeparator()+ message;
	}
	
	@Override
	public String getMessage() {
		return message;
		
	}
	

}
