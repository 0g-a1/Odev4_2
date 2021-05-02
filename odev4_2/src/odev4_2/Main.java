package odev4_2;

import java.time.LocalDate;

import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapters;
import Concrete.CustomerCheckManager;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {

		Customer customer = new Customer(1,"KungFu","Panda",LocalDate.of(1993, 1, 5),"123456789");
		
		BaseCustomerManager customerManager = new NeroCustomerManager();
		//BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapters());
		
		customerManager.save(customer);
		
		
	}

}
