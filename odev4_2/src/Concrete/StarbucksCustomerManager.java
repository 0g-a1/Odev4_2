package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckServiceIF;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {
	
	private CustomerCheckServiceIF _customerCheckService;
	
	public StarbucksCustomerManager(CustomerCheckServiceIF customerCheckService) {
		_customerCheckService = customerCheckService;
	}
	
	@Override
	public void save(Customer customer) {
		
		if(_customerCheckService.checkIfRealPerson(customer)) 
		{
			super.save(customer);
		}
		else 
		{
			System.err.println("Not a valid person");
		}		
		
	}
	
	
}
