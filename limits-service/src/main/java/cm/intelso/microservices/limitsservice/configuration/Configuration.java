/**
 * 
 */
package cm.intelso.microservices.limitsservice.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

/**
 * @author HOME
 *
 */
@Component
@ConfigurationProperties("limits-service")
@Data
public class Configuration {

	private int minimum;
	
	private int maximum;
}
