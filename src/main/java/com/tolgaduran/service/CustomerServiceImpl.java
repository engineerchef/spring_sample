package com.tolgaduran.service;

import java.util.List;

import com.tolgaduran.model.Customer;
import com.tolgaduran.repository.CustomerRepository;
import com.tolgaduran.repository.HibernateCustomerRepositoryImpl;

public class CustomerServiceImpl implements CustomerService {

	private CustomerRepository customerRepository = new HibernateCustomerRepositoryImpl();

	/* (non-Javadoc)
	 * @see com.tolgaduran.service.CustomerService#findAll()
	 */
	@Override
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}
}
