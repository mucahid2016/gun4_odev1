package concrete;

import abstract1.BaseCustomerManager;
import abstract1.CustomerCheckService;
import abstract1.ICustomerService;
import entities.Customer;



public  class StarbucsCustomerManager   extends BaseCustomerManager {
	private CustomerCheckService customerCheckService;
	
	public  StarbucsCustomerManager(CustomerCheckService CustomerCheckService) {
		this.customerCheckService = CustomerCheckService;
	}
	

	@Override
	public void Save(Customer customer) {
		if( customerCheckService.CheckIfRealPerson(customer)) {
			this.Save(customer);
			System.out.println("Do�rulama : Ba�ar�l� ");
		
		}else {
			System.out.println("Do�rulama Ba�ar�s�z : ");
		}
		
	}


	@Override
	public void Sace(Customer customer) {
		// TODO Auto-generated method stub
		
	}


	

}
