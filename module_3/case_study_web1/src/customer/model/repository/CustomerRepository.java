package customer.model.repository;

import customer.model.bean.Customer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerRepository {
    private static Map<Integer,Customer> list;

    static {
        list = new HashMap<>();
        list.put(1, new Customer(1, "John", "john@codegym.vn", "Hanoi"));
        list.put(2, new Customer(2, "Bill", "bill@codegym.vn", "Danang"));
        list.put(3, new Customer(3, "Alex", "alex@codegym.vn", "Saigon"));
        list.put(4, new Customer(4, "Adam", "adam@codegym.vn", "Beijin"));
        list.put(5, new Customer(5, "Sophia", "sophia@codegym.vn", "Miami"));
        list.put(6, new Customer(6, "Rose", "rose@codegym.vn", "Newyork"));
    }


    public List<Customer> findAll() {
        return new ArrayList<>(list.values());
    }


    public void save(Customer customer) {
        list.put(customer.getId(), customer);
    }


    public Customer findById(int id) {
        return list.get(id);
    }

    public void update(int id, Customer customer) {
        list.put(id, customer);
    }


    public void remove(int id) {
        list.remove(id);
    }


    // tim theo tên
    public List<Customer> findByName(String name){
        List<Customer> customerList = new ArrayList<>();
        for(Customer customer : list.values()){
            if(customer.getName().contains(name)){
                customerList.add(customer);
            }
        }
        return customerList ;
    }
}
