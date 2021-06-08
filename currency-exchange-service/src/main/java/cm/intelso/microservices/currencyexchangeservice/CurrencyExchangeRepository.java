/**
 * 
 */
package cm.intelso.microservices.currencyexchangeservice;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author HOME
 *
 */
public interface CurrencyExchangeRepository extends JpaRepository<CurrencyExchange, Long>{

	CurrencyExchange findByFromAndTo(String from, String to);
}
