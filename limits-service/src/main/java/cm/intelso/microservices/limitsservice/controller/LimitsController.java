/**
 * 
 */
package cm.intelso.microservices.limitsservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import cm.intelso.microservices.limitsservice.bean.Limits;
import cm.intelso.microservices.limitsservice.configuration.Configuration;

/**
 * @author HOME
 *
 */
@RestController
public class LimitsController {
	
	
	@Autowired
	private Configuration configuration;

	@GetMapping(value = "/limits") // , consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Limits retrieveLimits() {
		return new Limits(configuration.getMinimum(), configuration.getMaximum());
//		return new Limits(1, 1000);
	}
}
