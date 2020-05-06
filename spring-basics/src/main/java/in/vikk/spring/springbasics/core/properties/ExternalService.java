package in.vikk.spring.springbasics.core.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ExternalService {
	
	@Value("${external.service.url}")
	private String url;

	public String getServiceUrl() {
		return this.url;
	}

	@Override
	public String toString() {
		return "ExternalService [getServiceUrl()=" + getServiceUrl() + "]";
	}
}
