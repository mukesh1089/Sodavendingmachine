package com.vendingmachine.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.vendingmachine.model.Item;

@Service
public interface ItemService {

	Item addItem(Item itemBody);

	List<Item> getAllItems();

	Item updateItem(Item itemBody);

	Optional<Item> getByItemId(int id);

	void removeItem(int id);

}
