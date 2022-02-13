package pt.utad.egonh.credibank.restCredibank.controller;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import pt.utad.egonh.credibank.restCredibank.model.checkRequest;
import pt.utad.egonh.credibank.restCredibank.service.CrediBankService;
@RestController
public class CrediBankController {
	
	@Autowired
	private CrediBankService cbs;
	
	@PostMapping("/")
	public ResponseEntity<String> getAmountByCheckId(@RequestBody checkRequest cr) {
		String result = cbs.validateAmountByClient(cr.getCheckId(), cr.getAmount());
		if (StringUtils.isBlank(result)) {
			return new ResponseEntity<String>("",HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<String>(result,HttpStatus.OK);
	}
}
