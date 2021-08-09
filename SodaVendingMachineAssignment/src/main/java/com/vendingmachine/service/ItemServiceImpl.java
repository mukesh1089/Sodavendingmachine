package com.vendingmachine.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.vendingmachine.model.Item;
import com.vendingmachine.repository.VendingMachineRepository;

public class ItemServiceImpl implements ItemService {

	
	@Autowired
	VendingMachineRepository vendingMachineRepository;
	
	
	@Override
	public Item addItem(Item itemBody) {
		return	vendingMachineRepository.save(itemBody);

	}


	@Override
	public List<Item> getAllItems() {
		return	vendingMachineRepository.findAll();
	}


	@Override
	public Item updateItem(Item itemBody) {
		return	vendingMachineRepository.save(itemBody);
	}


	@Override
	public Optional<Item> getByItemId(int id) {
		return	vendingMachineRepository.findById(id);
	}


	@Override
	public void removeItem(int id) {
		Optional<Item> itemEntity=getByItemId(id);
			vendingMachineRepository.delete(itemEntity.get());
		
	}

}
