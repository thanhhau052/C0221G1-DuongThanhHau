package model.service.impl;

import model.bean.view_customer.CustomerUserService;
import model.repository.CustomerUserServicrRepository;
import model.service.interfacee.IService;

import java.util.List;

public class CustomerUserServiceImpl implements IService<CustomerUserService> {
    CustomerUserServicrRepository customerUserServicrRepository = new CustomerUserServicrRepository();
    @Override
    public List<CustomerUserService> findAll() {
        return customerUserServicrRepository.listCustomerUseService();
    }

    @Override
    public CustomerUserService findById(int id) {
        return null;
    }

    @Override
    public List<CustomerUserService> findByName(String name) {
        return customerUserServicrRepository.search(name);
    }

    @Override
    public boolean save(CustomerUserService customerUserService) {
        return false;
    }

    @Override
    public boolean update(int id, CustomerUserService customerUserService) {
        return false;
    }

    @Override
    public boolean remove(int id) {
        return customerUserServicrRepository.delete(id);
    }
}
