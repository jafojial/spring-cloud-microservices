/**
 * 
 */
package cm.intelso.microservices.currencyconversionservice;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author HOME
 * 
 */
@Data @NoArgsConstructor @AllArgsConstructor
public class CurrencyConversion {

	private Long id;
	
	private String from;
	
	private String to;
	
	private BigDecimal quantity;
	
	private BigDecimal conversionMultiple;

	private BigDecimal totalCalculateAmount;
	
	private String environment;
	
}
