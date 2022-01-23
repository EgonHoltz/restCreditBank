package pt.utad.egonh.credibank.restCredibank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

public class RestCredibankApplication {

	public static void main(String[] args) {
		
		//declare the url to call
		String url = "http://ken.utad.pt:8181";
		//create a rest template to work with rest request
		RestTemplate restTemplate = new RestTemplate();
		//call the service and return it on a string
		String result = restTemplate.getForObject(url+"/check/51535415/amount/500", String.class);
		
		System.out.println(result);
		
	}

}
