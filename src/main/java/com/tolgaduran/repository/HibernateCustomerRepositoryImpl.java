package com.tolgaduran.repository;

import java.util.ArrayList;
import java.util.List;

import com.tolgaduran.model.Customer;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {

	/* (non-Javadoc)
	 * @see com.tolgaduran.repository.CustomerRepository#findAll()
	 */
	@Override
	public List<Customer> findAll() {
		List<Customer> customers = new ArrayList<>();

		Customer customer = new Customer();

		customer.setFirstName("Tolga");
		customer.setLastName("DURAN");

		customers.add(customer);

		return customers;
	}
}
