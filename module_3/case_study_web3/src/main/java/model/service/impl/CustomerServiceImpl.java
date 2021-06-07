package model.service.impl;

import model.bean.customer.Customer;
import model.bean.customer.CustomerType;
import model.repository.CustomerRepository;

import model.service.commom.Validate;
import model.service.interfacee.IService;


import java.util.List;

public class CustomerServiceImpl implements IService<Customer> {
CustomerRepository customerRepository = new CustomerRepository();
Validate validate = new Validate();
    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public Customer findById(int customerId) {
        return customerRepository.findById(customerId);
    }

    @Override
    public List<Customer> findByName(String customerName) {
        return customerRepository.findByName(customerName);
    }

    @Override
    public boolean save(Customer customer) {
        try {
//          validate.validateCustomer(customer.getCustomerId());
            validate.validateDate(customer.getCustomerBirthday());
            validate.validateIdCard(customer.getCustomerIdCard());
            validate.validatePhone(customer.getCustomerPhone());
            validate.validateEmail(customer.getCustomerEmail());

        } catch (Exception e) {
            e.printStackTrace();
            
        }
        return customerRepository.insert(customer);
    }

    @Override
    public boolean update(int customerId, Customer customer) {
        try {
            validate.validateDate(customer.getCustomerBirthday());
            validate.validateIdCard(customer.getCustomerIdCard());
            validate.validatePhone(customer.getCustomerPhone());
            validate.validateEmail(customer.getCustomerEmail());
        }catch (Exception e){
            e.printStackTrace();
        }
        return customerRepository.update(customerId,customer);
    }

    @Override
    public boolean remove(int customerId) {
        return customerRepository.delete(customerId);
    }

    public  List<CustomerType> findAllCustomerType(){
        return customerRepository.findAllCustomerType();
    }
}