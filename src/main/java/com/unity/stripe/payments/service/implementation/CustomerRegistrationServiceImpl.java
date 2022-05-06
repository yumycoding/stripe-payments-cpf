package com.unity.stripe.payments.service.implementation;

import com.unity.stripe.payments.dao.CustomerRepository;
import com.unity.stripe.payments.dao.UserRegistrationRepository;
import com.unity.stripe.payments.entity.Customer;
import com.unity.stripe.payments.service.CustomerRegistrationService;
import org.springframework.stereotype.Service;

@Service
public class CustomerRegistrationServiceImpl implements CustomerRegistrationService {

    private final CustomerRepository customerRepository;
    private final UserRegistrationRepository userRegistrationRepository;

    public CustomerRegistrationServiceImpl(CustomerRepository customerRepository,
                                           UserRegistrationRepository userRegistrationRepository) {
        this.customerRepository = customerRepository;
        this.userRegistrationRepository = userRegistrationRepository;
    }

    @Override
    public Customer saveCustomer(Customer customer) {
        return customerRepository.save(customer);
    }
}
