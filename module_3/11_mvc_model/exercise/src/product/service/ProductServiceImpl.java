package product.service;

import product.model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductServiceImpl implements IProductService {

    private static Map<Integer,Product> list;
    static {
        list= new HashMap<>();
        list.put(1,new Product(1,"oto",1000,"kire","toshiba"));
        list.put(2,new Product(2,"xe may",400,"futsu","honda"));
        list.put(3,new Product(3,"xe dap",200,"futsu","yamaha"));
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(list.values());
    }

    @Override
    public Product findById(int id) {
        return list.get(id);
    }

    @Override
    public void remove (int id){
        list.remove(id);
    }

    @Override
    public void update (int id, Product product){
        list.put(id,product);
    }

    @Override
    public void save(Product product) {
        list.put(product.getId(),product);
    }
    @Override
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