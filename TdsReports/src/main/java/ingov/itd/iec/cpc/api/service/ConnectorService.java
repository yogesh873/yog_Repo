package ingov.itd.iec.cpc.api.service;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;

import ingov.itd.iec.cpc.api.exception.ConnectorException;

public interface ConnectorService {

	
	public void generateReport(HashMap<String,String>  queries,String connectorname) throws FileNotFoundException, IOException, ConnectorException;
	
	
}
