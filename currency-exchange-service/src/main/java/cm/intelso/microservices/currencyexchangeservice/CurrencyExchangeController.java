/**
 * 
 */
package cm.intelso.microservices.currencyexchangeservice;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author HOME
 *
 */
@RestController
public class CurrencyExchangeController {
	
	@Autowired
	private Environment environment;
	
	@GetMapping(value = "/currency-exchange/from/{from}/to/{to}")
	public CurrencyExchange retrieveExchangeValue(
			@PathVariable String from,
			@PathVariable String to) {
		String port = environment.getProperty("local.server.port");
		return new CurrencyExchange(1000L, from, to, BigDecimal.valueOf(570), port);
//		return new CurrencyExchange(1000L, from, to, BigDecimal.valueOf(570), "8080");
	}

}
