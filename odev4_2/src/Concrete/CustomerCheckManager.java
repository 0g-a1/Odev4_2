package Concrete;

import Abstract.CustomerCheckServiceIF;
import Entities.Customer;

public class CustomerCheckManager implements CustomerCheckServiceIF {

	// bizim oluþturduðumuz kontrol servisi
	
	@Override
	public boolean checkIfRealPerson(Customer customer) {
		
		
		return false;
	}

	

}
