package bai_17_io_binary_file_serialization.bai_tap.bai1_quan_li_san_phamm;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductManagement {
    ArrayList<Product> productsList = new ArrayList<>();

    public void createList() {
        Product product1 = new Product("1", "Iphone ", "Apple", 20000);
        Product product2 = new Product("2", "Galaxy ", "SanSung", 5000);
        Product product3 = new Product("3", "Nokia", "Nokia", 300);
        Product product4 = new Product("4", "Joy 3", "VSmart", 8000);
        Product product5 = new Product("5", "BPhone 2", "VietNam",10000);
        productsList.add(product1);
        productsList.add(product2);
        productsList.add(product3);
        productsList.add(product4);
        productsList.add(product5);
    }

    public void addProduct() {
        Product product = new Product();
        product.inputData();
        productsList.add(product);
    }


    public void displayProduct() {
//        System.out.printf("ID"+"NAME"+"MANUFACTURER"+"PRICE ($)");
        try {
            for (Product product : productsList) {
                System.out.println("--------------------------------------------------------");
                System.out.printf( "ID : "+product.getID()+"\n" +
                                   "NAME : "+product.getName()+"\n" +
                                   "MANUFACTURER : "+product.getManufacturer()+"\n"+
                                   "PRICE : "+product.getPrice()+"\n");
//                System.out.println("--------------------------------------------------------");
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void findByID() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the ID you want to find: ");
        String idToFind = sc.nextLine();
        for (Product product : productsList) {
            if (product.getID().equals(idToFind)) {
                System.out.println("This is the ID you want to find: ");
                product.display();
            }
        }
    }

    public void removeID() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the ID you want to remove: ");
        String idForRemove = sc.nextLine();
        for (int i = 0; i < productsList.size(); i++) {
            if (productsList.get(i).getID().equals(idForRemove)) {
                productsList.remove(productsList.get(i));
            }
        }
    }

    public void replaceID() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the ID you want to replace: ");
        String idForReplace = sc.nextLine();
        for (int i = 0; i < productsList.size(); i++) {
            if (productsList.get(i).getID().equals(idForReplace)) {
                productsList.remove(productsList.get(i));
                Product newProduct = new Product();
                newProduct.inputData();
                productsList.add(i, newProduct);
            }
        }
    }

}