/**
 * 
 */
package cm.intelso.microservices.limitsservice.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author HOME
 *
 */
@Data @NoArgsConstructor @AllArgsConstructor
public class Limits {

	private int minimum;
	
	private int maximum;
	
}
