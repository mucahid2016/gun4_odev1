package concrete;


import abstract1.CustomerCheckService;
import entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class CustomerCheckManager implements CustomerCheckService {
	public boolean CheckIfRealPerson(Customer customer) {
		return true;
	}

}
