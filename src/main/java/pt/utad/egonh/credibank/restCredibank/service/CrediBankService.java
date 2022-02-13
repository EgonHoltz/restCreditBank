package pt.utad.egonh.credibank.restCredibank.service;

import java.math.BigDecimal;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CrediBankService {
	
	
	//declare the url to call
	private final String URL = "http://ken.utad.pt:8181";

	public String validateAmountByClient(String checkId, BigDecimal amount) {
		//create a rest template to work with rest request
		RestTemplate restTemplate = new RestTemplate();
		//call the service and return it on a string
		return restTemplate.getForObject(URL+String.format("/check/%s/amount/%.2f", checkId, amount.floatValue()), String.class);
		
	}

}
