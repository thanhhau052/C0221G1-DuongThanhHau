package customer.model.service;

import customer.model.bean.Customer;

import java.util.List;

public interface ICustomerService {


        List<Customer> findAll();

        Customer findById(int id);

        void save(Customer customer);



        void update(int id, Customer customer);

        void remove(int id);

        List<Customer> findByName(String name);

}
