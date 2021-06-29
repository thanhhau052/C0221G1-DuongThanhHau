package com.example.bt.model.service;

import com.example.bt.model.entity.Item;

import java.util.List;

public interface ItemService {
    List<Item> findAll();

    Item findById(Integer id);

    void save(Item item);

    void remove(Integer id);
}