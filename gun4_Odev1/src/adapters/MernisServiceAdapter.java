package adapters;

import java.rmi.RemoteException;
import abstract1.CustomerCheckService;
import entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService {

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		
		Long kimlik = Long.parseLong(customer.getNationalityId());
		int dogumYili = customer.getDateOfBirth().getYear();
		
		
		try {
			return client.TCKimlikNoDogrula(kimlik,customer.getFirstName().toUpperCase(),
					customer.getLastName().toUpperCase(),dogumYili);
		}catch (RemoteException e) {
			e.printStackTrace();
		}
		return false;
	}

}
