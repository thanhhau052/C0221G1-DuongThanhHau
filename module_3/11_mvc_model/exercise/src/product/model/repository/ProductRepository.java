package product.model.repository;

import product.model.bean.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductRepository {
    private static Map<Integer, Product> list;
    static {
        list= new HashMap<>();
        list.put(1,new Product(1,"oto",1000,"kire","toshiba"));
        list.put(2,new Product(2,"xe may",400,"futsu","honda"));
        list.put(3,new Product(3,"xe dap",200,"futsu","yamaha"));
    }


    public List<Product> findAll() {
        return new ArrayList<>(list.values());
    }


    public Product findById(int id) {
        return list.get(id);
    }


    public void remove (int id){
        list.remove(id);
    }


    public void update (int id, Product product){
        list.put(id,product);
    }


    public void save(Product product) {
        list.put(product.getId(),product);
    }

    // tim theo ten
    public List<Product> findByName(String name){
        List<Product> listproduct = new ArrayList<>();
        for(Product product : list.values()){
            if(product.getName().contains(name)){
                listproduct.add(product);
            }
        }
        return listproduct;
    }
}
