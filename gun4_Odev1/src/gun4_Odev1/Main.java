
package gun4_Odev1;

import java.rmi.RemoteException;
import java.time.LocalDate;

import abstract1.BaseCustomerManager;
import adapters.MernisServiceAdapter;
import concrete.NeroCustomerManager;
import concrete.StarbucsCustomerManager;
import entities.Customer;

public class Main {

	public static void main(String[] args)  throws RemoteException{
		BaseCustomerManager customerManager = new StarbucsCustomerManager(new MernisServiceAdapter());
		customerManager.Save(new Customer(1,"engin","demiroð",LocalDate.of(1985,1,6),"28861499108"));
		
		System.out.println();
	}
		
			
		
		

	

}
