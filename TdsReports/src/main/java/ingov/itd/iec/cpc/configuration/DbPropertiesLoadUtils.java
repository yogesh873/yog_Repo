package ingov.itd.iec.cpc.configuration;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.impl.client.HttpClientBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import com.fasterxml.jackson.databind.ObjectMapper;

public class DbPropertiesLoadUtils extends PropertySourcesPlaceholderConfigurer {

	private static final Logger LOGGER = LoggerFactory.getLogger(DbPropertiesLoadUtils.class);
	
	private static Map<String, String> propMap = new HashMap<>();

	private enum HTTPMethod {
		GET, POST, DELETE, PUT
	}

	protected HttpClient getHTTPClient() {
		return HttpClientBuilder.create().build();
	}

	@Override
	protected void loadProperties(Properties props) throws IOException {

		super.loadProperties(props);
		try {
			String url = props.getProperty(TdsSchedulerConstants.ADMIN_WEB_URL) + TdsSchedulerConstants.ADMIN_MODULE_URL;
			LOGGER.info("The url used to fetch the adminweb properties are ", url);
			propMap = executeGetRequest(url);
			props.putAll(propMap);
		} catch (Exception e) {
			LOGGER.error("Error loading the properties from the Adminweb", e);
		}
	}

	@SuppressWarnings("unchecked")
	public Map<String, String> executeGetRequest(String url) throws Exception {

		StringBuilder result = new StringBuilder();
		String output;
		HttpClient client = getHTTPClient();
		HttpResponse response = client.execute(getHTTPGetRequest(url));
		if (response.getStatusLine().getStatusCode() != 200) {
			throw new Exception("Failed : HTTP error code : " + response.getStatusLine().getStatusCode());
		}

		Map<String, String> newMap = new HashMap<>();
		try (BufferedReader br = new BufferedReader(new InputStreamReader(response.getEntity().getContent()))) {
			while ((output = br.readLine()) != null) {
				result.append(output);
			}
			HashMap<String, Object> hash = new ObjectMapper().readValue(result.toString(), HashMap.class);
			Map<String, Object> map = hash;

			for (Map.Entry<String, Object> entry : map.entrySet()) {
				if (entry.getValue() instanceof String) {
					newMap.put(entry.getKey(), (String) entry.getValue());
				}
			}
		}
		return newMap;

	}

	private HttpRequestBase getHTTPRequest(String restUri, Enum<HTTPMethod> httpMethod) {
		HttpRequestBase request = null;
		if ("GET".equals(httpMethod.name())) {
			request = new HttpGet(restUri);
			request.addHeader("accept", "application/json");
			request.addHeader("content-type", "application/json");
		}
		return request;
	}

	public HttpGet getHTTPGetRequest(String restUri) {
		return (HttpGet) getHTTPRequest(restUri, HTTPMethod.GET);
	}
}
