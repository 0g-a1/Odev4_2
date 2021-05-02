package Abstract;

import Entities.Customer;

public abstract class BaseCustomerManager implements CustomerServiceIF {

	@Override
	public void save(Customer customer) {
		
		System.out.println("Save to db : " + customer.getFirstName() + " " + customer.getLastName());
		
	}

}
