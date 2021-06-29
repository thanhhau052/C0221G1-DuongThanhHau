package com.example.bt.model.entity;


import java.util.HashMap;
import java.util.Map;

public class Cart {
    private Map<Item,Integer> items = new HashMap<>();

    public Cart() {
    }

    public Cart(Map<Item,Integer> items) {
        this.items = items;
    }

    public Map<Item,Integer> getItems() {
        return items;
    }

    private boolean checkItemInCart(Item item){
        for (Map.Entry<Item, Integer> entry : items.entrySet()) {
            if(entry.getKey().getId().equals(item.getId())){
                return true;
            }
        }
        return false;
    }

    private Map.Entry<Item, Integer> selectItemInCart(Item item){
        for (Map.Entry<Item, Integer> entry : items.entrySet()) {
            if(entry.getKey().getId().equals(item.getId())){
                return entry;
            }
        }
        return null;
    }

    public void addItem(Item item){
        if (!checkItemInCart(item)){
            items.put(item,1);
        } else {
            Map.Entry<Item, Integer> itemEntry = selectItemInCart(item);
            Integer newQuantity = itemEntry.getValue() + 1;
            items.replace(itemEntry.getKey(),newQuantity);
        }
    }
    public  Double toTalItem(){
        Double total=0.0;
        for (Map.Entry<Item,Integer> item :items.entrySet()
             ) {
            total+=item.getKey().getPrice()*item.getValue();
        }

        return total;
    }

//    public Integer countItemQuantity(){
//        Integer itemQuantity = 0;
//        for (Map.Entry<Item, Integer> entry : items.entrySet()) {
//            itemQuantity += entry.getValue();
//        }
//        return itemQuantity;
//    }
////
//    public Integer countQuantity(){
//        return items.size();
//    }
//
//    public Float countTotalPayment(){
//        float payment = 0;
//        for (Map.Entry<Item, Integer> entry : items.entrySet()) {
//            payment += entry.getKey().getPrice() * (float) entry.getValue();
//        }
//        return payment;
//    }

    public void removeItem(Item item){
        items.remove(item);
    }




//    private Map<Item,Integer> cart;
//
//    public Cart(){
//        cart = new HashMap<>();
//    }
//
//    public void addToCart(Item item){
//        if(cart.containsKey(item)){
//            cart.replace(item,cart.get(item), cart.get(item) +1);
//        }else {
//            cart.put(item, 1);
//        }
//    }
//

//
//    public int getQuantity(Item item){
//        return cart.get(item);
//    }
//
//    public Map<Item, Integer> getCart(){
//        return cart;
//    }
//

}